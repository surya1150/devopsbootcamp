package com;

import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CalculatorServiceTest {
	
	CalculatorService calc = new CalculatorService();
	@Test
	public void testSum() {		
		
		Assertions.assertEquals(calc.printSum(), 15);
	}
	@Test
	public void testMul() {
		
		Assertions.assertEquals(calc.printMul(), 50);
	}
	
	@Test
	public void testDiv() {
		
		Assertions.assertEquals(calc.printDiv(), 2);
	}
	@Test
	public void testSub() {
		
		Assertions.assertEquals(calc.printSub(), 5);
	}

}
