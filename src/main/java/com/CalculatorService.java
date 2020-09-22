package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	@GetMapping("/sum")
	public int printSum() {
		int num1=5;
		int num2=10;
		return num1 + num2;		
	}
	@GetMapping("/multiplication")
	public int printMul() {
		int num1=5;
		int num2=10;
		return num1 * num2;		
	}
	@GetMapping("/division")
	public int printDiv() {
		int num1=5;
		int num2=10;
		return num2/num1;		
	}
	@GetMapping("/substraction")
	public int printSub() {
		int num1=5;
		int num2=10;
		return num2 - num1;		
	}
}
