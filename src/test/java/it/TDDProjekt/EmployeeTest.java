package it.TDDProjekt;
import static org.junit.Assert.*;
import org.junit.*;
public class EmployeeTest {
    
    @Test
	public void getNameTest() throws Exception {
		Employee employee = new Employee("Jan", "Nowak", "2022-01-14", "jan@nowak.com");
		assertEquals("Jan", employee.getName());
	}

    @Test
	public void getSurNameTest() throws Exception {
		Employee employee = new Employee("Jan", "Nowak", "2022-01-14", "jan@nowak.com");
		assertEquals("Nowak", employee.getSurName());
	}

    @Test
	public void getDateTest() throws Exception {
		Employee employee = new Employee("Jan", "Nowak", "2022-01-14", "jan@nowak.com");
		assertEquals("2022-01-14", employee.getDate());
	}

    @Test
	public void getEmailTest() throws Exception {
		Employee employee = new Employee("Jan", "Nowak", "2022-01-14", "jan@nowak.com");
		assertEquals("jan@nowak.com", employee.getEmail());
	}

    @Test
	public void toStringTest() throws Exception {
		Employee employee = new Employee("Jan", "Nowak", "2022-01-14", "jan@nowak.com");
		assertEquals("Jan, Nowak, 2022-01-14, jan@nowak.com", employee.toString());
	}
}
