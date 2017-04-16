package com.springinaction.test;

import static com.springinaction.controller.HomeController.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static java.util.Arrays.*;

import java.util.HashMap;
import java.util.List;
import org.junit.Test;

import com.springinaction.controller.HomeController;
import com.springinaction.model.Spitte;
import com.springinaction.service.SpitterService;

public class HomeControllerTest {

	@Test
	public void test() {
		//ģ��SpitterService
		List<Spitte> expectedSpittles = asList(new Spitte(),new Spitte(),new Spitte());
		SpitterService spitterService = mock(SpitterService.class);
		
		when(spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE))
		.thenReturn(expectedSpittles);
		
		//����������
		HomeController controller = new HomeController(spitterService);
		HashMap<String, Object> model = new HashMap<String,Object>();
		String viewName = controller.showHomePage(model);//���ô�����
		
		//�Դ����������жԱ�
		assertEquals("home", viewName);
		verify(spitterService).getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE);
	}

}