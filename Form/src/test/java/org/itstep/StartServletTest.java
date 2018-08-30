package org.itstep;

import static org.junit.Assert.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

public class StartServletTest {

	@Test
	public void testDoGetHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		
		StartServlet servlet = new StartServlet();
		
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		RequestDispatcher dispatcher = Mockito.mock(RequestDispatcher.class);
		
		Mockito.when(request.getRequestDispatcher("/WEB-INF/pages/MyPages.html")).thenReturn(dispatcher);
		
		servlet.doGet(request, response);
		
		Mockito.verify(request, times(1)).getRequestDispatcher("/WEB-INF/pages/MyPages.html");
		Mockito.verify(request, never()).getAttributeNames();
		Mockito.verify(dispatcher).forward(request, response);
		
	}

}
