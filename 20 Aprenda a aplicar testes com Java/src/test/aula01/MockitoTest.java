package test.aula01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.easymock.EasyMock.mock;


public class MockitoTest {

	@Test
	public void test() {
		List mock = mock(List.class);

		when(mock.get(0)).thenReturn("one");
		when(mock.get(1)).thenReturn("two");

		//someCodeThatInteractsWithMock();

		verify(mock).clear();  	
	}
}
