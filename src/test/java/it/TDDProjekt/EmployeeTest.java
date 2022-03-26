package it.TDDProjekt;

public class EmployeeTest {
    @Test
	public void getMonthTest() throws Exception {
		Employee employee = new Employee("Jan", "Nowak", "2022-01-14", "jan@nowak.com");
		assertEquals("Jan", employee.getName());
	}
}
