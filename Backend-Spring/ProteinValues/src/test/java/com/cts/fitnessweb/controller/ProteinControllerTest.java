package com.cts.fitnessweb.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cts.fitnessweb.controller.ProteinController;
import com.cts.fitnessweb.feigclient.AuthorizationClient;
import com.cts.fitnessweb.model.Protein;
import com.cts.fitnessweb.service.ProteinService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(ProteinController.class)
class ProteinControllerTest {

	@Autowired
	MockMvc mockMvc;
	@Autowired
	ObjectMapper mapper;
	@MockBean
	private ProteinService stockService;
	@MockBean
	private AuthorizationClient authorizationClient;
	Protein s1 = new Protein(11, "CTS", 12000);
	Protein s2 = new Protein(12, "MNS", 12000);
	List<Protein> record = new ArrayList<>(Arrays.asList(s1, s2));

	@Test
	void testGetDailyAllMutualFundNav() throws Exception {

		Map<String, String> map = new HashMap<>();
		map.put("Authorization", "token");
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAll(map);

		Mockito.when(stockService.getStockDetail(s1.getProductName())).thenReturn(s1);

		mockMvc.perform(MockMvcRequestBuilders.get("/DailySharePrice/CTS").headers(httpHeaders)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}

	@Test
	void testFindAllStock() throws Exception {

		Map<String, String> map = new HashMap<>();
		map.put("Authorization", "token");
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAll(map);

		Mockito.when(stockService.findAll()).thenReturn(record);

		mockMvc.perform(MockMvcRequestBuilders.get("/DailySharePrice/allstock").headers(httpHeaders)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}

}
