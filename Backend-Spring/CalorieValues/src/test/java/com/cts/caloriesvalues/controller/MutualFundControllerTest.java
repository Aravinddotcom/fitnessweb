package com.cts.caloriesvalues.controller;

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

import com.cts.caloriesvalues.controller.CaloriesValuesController;
import com.cts.caloriesvalues.feignclient.AuthorizationClient;
import com.cts.caloriesvalues.model.CaloriesValues;
import com.cts.caloriesvalues.service.CaloriesValuesService;
import com.fasterxml.jackson.databind.ObjectMapper;
@WebMvcTest(CaloriesValuesController.class)
class MutualFundControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	private CaloriesValuesService mutualFundService;
	
	@MockBean
	private AuthorizationClient  authorizationClient;

	CaloriesValues m1=new CaloriesValues(11,"Fish",120);
	CaloriesValues m2=new CaloriesValues(11,"Meat",150);
	List<CaloriesValues> record=new ArrayList<>(Arrays.asList(m1,m2));
	@Test
    void testGetDailyAllMutualFundNav() throws Exception {
		
		Map<String,String> map=new HashMap<>();
		map.put("Authorization", "token");
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.setAll(map);
		
		Mockito.when(mutualFundService.getByfoodName(m1.getFoodName())).thenReturn(m1);

		mockMvc.perform(MockMvcRequestBuilders.get("/DailyMutualFundNAV/GLE")
				.headers(httpHeaders).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}
	
	@Test
    void testGetAllMutualFund() throws Exception {
		
		Map<String,String> map=new HashMap<>();
		map.put("Authorization", "token");
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.setAll(map);
		
		Mockito.when(mutualFundService.getAll()).thenReturn(record);

		mockMvc.perform(MockMvcRequestBuilders.get("/DailyMutualFundNAV/allmf")
				.headers(httpHeaders).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}
	
}
