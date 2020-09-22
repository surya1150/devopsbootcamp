package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MessageServiceTest {
	
	@Test
	public void welcomeMessage() {
		MessageService ms = new MessageService();
		System.out.println("welcome");
		Assertions.assertEquals(ms.sayHello(), "Welcome to Spring boot Demo");
	}
	
	@Test
	public void adminMessage() {
		MessageService ms = new MessageService();
		System.out.println("admin");
		Assertions.assertEquals(ms.adminPage(), "Welcome Admin");
	}
	
	@Test
	public void guestMessage() {
		MessageService ms = new MessageService();
		System.out.println("guest");
		Assertions.assertEquals(ms.guestPage(), "Welcome Guest");
	}

	
	
	
	
}
