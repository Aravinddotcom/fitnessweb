package com.cts.caloriesvalues;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.caloriesvalues.controller.CaloriesValuesController;
import com.cts.caloriesvalues.service.CaloriesValuesService;

@SpringBootTest
class DailyMutualFundNavApplicationTests {
	
	@Autowired
    private CaloriesValuesController stockController;
    @Autowired
    private  CaloriesValuesService stockService;
     @Test
     void contextLoads() throws Exception {
            assertThat(stockController).isNotNull();
            assertThat(stockService).isNotNull();
      }
	

}
