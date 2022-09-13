package com.cts.fitnessweb.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.fitnessweb.model.Protein;

@SpringBootTest
class ProteinTest {

	Protein st = new Protein();
	Protein st1 = new Protein(11, "MRX", 12);

	@Test
	void testGetStockId() {
		st.setStockId(12);
		assertEquals(12, st.getStockId());
	}

	@Test
	void testGetStockName() {
		st.setProductName("CRS");
		assertEquals("CRS", st.getProductName());
	}

	@Test
	void testGetproteinValue() {
		st.setProteinValue(15);
		assertEquals(15, st.getProteinValue());
		;
	}

	@Test
	void testSetStockId() {
		st.setStockId(13);
		assertEquals(13, st.getStockId());
	}

	@Test
	void testSetStockName() {
		st.setProductName("CRX");
		assertEquals("CRX", st.getProductName());
	}

	@Test
	void testSetproteinValue() {
		st.setProteinValue(16);
		assertEquals(16, st.getProteinValue());
		;
	}

	@Test
	void testToString() {
		Protein st= new Protein(101, "abc", 10);
		assertEquals("Stock(stockId=101, productName=abc, proteinValue=10.0)",st.toString());

	}

}
