package org.itstep;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

public class MainServletTest {

	@Test
	public void testDoGetHttpServletRequestHttpServletResponse() throws IOException, ServletException {
		
		MainServlet servlet = new MainServlet();
		
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		PrintWriter out = Mockito.mock(PrintWriter.class);
		
		Mockito.when(response.getWriter()).thenReturn(out);
		
		servlet.doGet(request, response);
		
		Mockito.verify(response, times(1)).getWriter();
		Mockito.verify(out).print("<html>");
	}

}
