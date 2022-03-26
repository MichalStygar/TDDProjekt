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
}
