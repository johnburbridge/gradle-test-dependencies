package test;


import static org.junit.Assert.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Example test that uses the concrete implementation of HttpServletRequest and HttpServletResponse provided
 * at runtime (as opposed to compile time). For more details, see build.gradle dependencies
 * 
 * @author jburbridge
 */
public class PingServletTest {

	@Test
	public void test() throws IOException {
		PingServlet pingCheck = new PingServlet();
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		Mockito.when(response.getWriter()).thenReturn(new PrintWriter(System.out));
		try {
			pingCheck.doGet(request, response);
		} catch (ServletException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
}
