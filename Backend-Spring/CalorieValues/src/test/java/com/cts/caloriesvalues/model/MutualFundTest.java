package com.cts.caloriesvalues.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.caloriesvalues.model.CaloriesValues;

@SpringBootTest
class MutualFundTest {

	CaloriesValues mf = new CaloriesValues();
	CaloriesValues mf1 = new CaloriesValues(10, "CTE", 12);

	@Test
	void testGetfoodId() {
		mf.setFoodId(10);
		assertEquals(10, mf.getFoodId());
	}

	@Test
	void testGetfoodName() {
		mf.setFoodName("GGE");
		assertEquals("GGE", mf.getFoodName());
	}

	@Test
	void testGetcaloriesValue() {
		mf.setCaloriesValue(12);
		assertEquals(12, mf.getCaloriesValue());
	}

	@Test
	void testSetfoodId() {
		mf.setFoodId(11);
		assertEquals(11, mf.getFoodId());
	}

	@Test
	void testSetfoodName() {
		mf.setFoodName("GGE");
		assertEquals("GGE", mf.getFoodName());
	}

	@Test
	void testSetcaloriesValue() {
		mf.setCaloriesValue(12);
		assertEquals(12, mf.getCaloriesValue());
	}

	void testToString() {
		CaloriesValues mf = new CaloriesValues(11, "abc", 100);
		assertEquals("MutualFund [foodId=11, foodName=abc, caloriesValue=100.0]", mf.toString());
	}
}
