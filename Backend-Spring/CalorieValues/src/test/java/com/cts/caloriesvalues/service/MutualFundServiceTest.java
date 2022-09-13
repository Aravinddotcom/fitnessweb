package com.cts.caloriesvalues.service;

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

import com.cts.caloriesvalues.exception.CaloriesValuesNotFoundException;
import com.cts.caloriesvalues.model.CaloriesValues;
import com.cts.caloriesvalues.repository.CaloriesValuesRepository;
import com.cts.caloriesvalues.service.CaloriesValuesService;

@SpringBootTest
class MutualFundServiceTest {

	@MockBean
	private CaloriesValuesRepository mutualFundRepository;

	@Autowired
	private CaloriesValuesService mutualFundService;

	CaloriesValues m1 = new CaloriesValues(11, "Egg", 1200);
	

	CaloriesValues m2 = new CaloriesValues(12, "York", 100);
	List<CaloriesValues> record=new ArrayList<>(Arrays.asList(m1,m2));

	@Test
	void testGetByfoodName() throws CaloriesValuesNotFoundException {
		Mockito.when(mutualFundRepository.findByfoodName("GLE")).thenReturn(m1);
		assertEquals(m1, mutualFundService.getByfoodName("GLE"));
		status().isOk();

	}
	@Test
	void testfindAll() throws CaloriesValuesNotFoundException  {
		Mockito.when(mutualFundRepository.findAll()).thenReturn(record);
		assertEquals(record, mutualFundService.getAll());
		status().isOk();

	}
}
