package it.TDDProjekt;
import static org.junit.Assert.*;
import org.junit.*;

public class XDateTest {
    
    @Test
	public void getDayTest() throws Exception {
		XDate date = new XDate("2022-01-14");
		assertEquals(14, date.getDay());
	}

    @Test
	public void getMonthTest() throws Exception {
		XDate date = new XDate("2022-01-14");
		assertEquals(1, date.getMonth());
	}

    @Test
	public void getYearTest() throws Exception {
		XDate date = new XDate("2022-01-14");
		assertEquals(2022, date.getYear());
	}

    @Test
	public void getDateTest() throws Exception {
		XDate date = new XDate("2022-03-23");
		assertEquals("2022-03-23", date.getDate());
	}

    @Test
	public void isSameDateTest() throws Exception {
		XDate date = new XDate("2022-03-26");
		assertEquals(true, date.isSameDate());
	}
}
