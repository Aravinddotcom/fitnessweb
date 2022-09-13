package com.cts.fitnessweb;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.fitnessweb.controller.ProteinController;
import com.cts.fitnessweb.service.ProteinService;

@SpringBootTest
class ProteinApplicationTests {

	@Autowired
    private ProteinController stockController;
    @Autowired
    private  ProteinService stockService;
     @Test
     void contextLoads() throws Exception {
            assertThat(stockController).isNotNull();
            assertThat(stockService).isNotNull();
      }
}
