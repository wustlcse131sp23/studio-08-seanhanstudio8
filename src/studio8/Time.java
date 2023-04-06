package studio8;


public class Time {

private int Hour;
private int Minute;
private boolean IfHalf;


	public static void main(String[] args) {
		Time time1 = new Time(12,40, false);
    	System.out.print(time1);
    }
	
	public Time(int Hour, int Minute, boolean IfHalf) {
		this.Hour = Hour;
		this.Minute = Minute;
		this.IfHalf = IfHalf;
	}
	
	public int GetHour() {
		return Hour;
	}
	public int GetMinute() {
		return Minute;
	}
	
	public String toString() {
		if (Hour >12 && IfHalf == false) {
			return "The time is " + (Hour - 12) +  ":" + Minute + "PM";
		}
		else if(Hour < 12 && IfHalf == false) {
			return "The time is " + Hour + ":" + "AM";
		}
		else {
			return "The time is "+ Hour +":" + Minute + "AM";
		}
		
	}


}