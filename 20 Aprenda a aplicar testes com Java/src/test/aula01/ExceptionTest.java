package test.aula01;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.jupiter.api.Assertions.fail;

public class ExceptionTest {

	
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() { 
	     List<String> lista = new ArrayList<String>();
	     
	     lista.get(0); 
	}
	
	
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
	    List<Object> list = new ArrayList<Object>();
	 
	    thrown.expect(IndexOutOfBoundsException.class);
	    thrown.expectMessage("Index: 0, Size: 0");
	    list.get(0); 
	}
	
	
	@Test
	public void testExceptionMessage() {
	    try {
	        new ArrayList<Object>().get(0);
	        fail("Esperado que IndexOutOfBoundsException seja lan�ada");
	    } catch (IndexOutOfBoundsException ex) {
	        assertThat(ex.getMessage(), is("Index: 0, Size: 0"));
	    }
	}
	
}
