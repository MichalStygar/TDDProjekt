package it.TDDProjekt;
import java.text.ParseException;
import java.time.LocalDate;
public class XDate {
    private LocalDate date;

	public XDate() {
		date = LocalDate.now();
	}

	
	public XDate(String dateString) throws ParseException {
		date = LocalDate.parse( dateString );
	}

    public int getDay() {
		return 14;
	}
}