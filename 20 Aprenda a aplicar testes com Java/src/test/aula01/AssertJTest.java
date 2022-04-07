package test.aula01;


import main.aula01.Person;
import org.junit.jupiter.api.Test;


public class AssertJTest {
	
	@Test
	public void checkEquality() {
		Person person= new Person("Barrack", "Obama");
		Person personClone = new Person("Barrack", "Obama");
	    
		assertThat(person).isEqualTo(personClone);
	}

}
