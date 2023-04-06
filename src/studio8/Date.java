package studio8;

import java.util.Objects;

public class Date {
	
	private String Month;
	private int Date;
	private int Year;
	private boolean IfHoliday;
/**
 * Constructor for creating a Course object.
 * @param Month  we choose
 * @param Date we choose
 * @param Year we choose
 */
	public Date(String Month, int Date, int Year, boolean IfHoliday) {
		this.Month = Month;
		this.Date = Date;
		this.Year = Year;
		this.IfHoliday = IfHoliday;

	}

	
	public String GetMonth() {
		return Month;
	}
	
	public int GetDate() {
		return Date;
	}
	
	public int GetYear() {
		return Year;
	}


	public String toString() {
		return Month +" "+ Date +  " " + Year + " is a holiday is "+ IfHoliday;
	}
	
    public static void main(String[] args) {
    	Date date1 = new Date("Jan", 1 , 2023, true);
    	System.out.println(date1);
    	
    }


	@Override
	public int hashCode() {
		return Objects.hash(Date, Month, Year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return Date == other.Date && Objects.equals(Month, other.Month) && Year == other.Year;
	}

}
