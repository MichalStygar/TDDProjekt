package it.TDDProjekt;
import static org.junit.Assert.*;
import org.junit.*;
public class EmployeeTest {
    
    @Test
	public void getNameTest() throws Exception {
		Employee employee = new Employee("Jan", "Nowak", "2022-01-14", "jan@nowak.com");
		assertEquals("Jan", employee.getName());
	}
}
