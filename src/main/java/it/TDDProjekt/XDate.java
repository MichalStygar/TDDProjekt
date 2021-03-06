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
		return date.getDayOfMonth();
	}

    public int getMonth() {
		return date.getMonthValue();
	}

    public int getYear() {
		return date.getYear();
	}

    public String getDate() {
		return date.toString();
	}

    public Boolean isSameDate() {
		LocalDate isSame = LocalDate.now();
		if(date.equals(isSame)) {
			return true;
		}else {
			return false;
		}
	}
}
