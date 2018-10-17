package com.dataflowdeveloper.operations;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperationsApplicationTests {

	@Autowired
    private DataController controller;
	
	@Test
	public void contextLoads() {
		System.out.println("Test");
		
		assertNotNull(controller);
	}

}
