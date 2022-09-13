package com.cts.fitnessweb.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cts.fitnessweb.exception.ProteinNotFoundException;
import com.cts.fitnessweb.model.Protein;
import com.cts.fitnessweb.repository.ProteinRepository;
import com.cts.fitnessweb.service.ProteinService;

@SpringBootTest
class ProteinServiceTest {

	@MockBean
	private ProteinRepository stockRepository;

	@Autowired
	private ProteinService stockService;

	Protein s1 = new Protein(11, "CTS", 12000);
	Protein s2 = new Protein(12, "MNS", 12000);
	List<Protein> record=new ArrayList<>(Arrays.asList(s1,s2));
	@Test
	void testGetStockDetail() throws ProteinNotFoundException  {
		Mockito.when(stockRepository.findByProductName("CTS")).thenReturn(s1);
		assertEquals(s1, stockService.getStockDetail("CTS"));
		status().isOk();

	}
	
	@Test
	void testfindAll() throws ProteinNotFoundException  {
		Mockito.when(stockRepository.findAll()).thenReturn(record);
		assertEquals(record, stockService.findAll());
		status().isOk();

	}
}
