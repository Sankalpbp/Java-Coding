import java.util.*;

public class LeapYear {
	
	private int year;

	public boolean condition (int year) {
		
		if (year % 400 == 0) {
			return true;
		}
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		}

		return false;
	}

	public LeapYear (int year) {
		while (condition(year) == false) {
			++year;
		}

		this.year = year;
	}

	public int nextLeap () {
		int year = this.year;
		this.year += 4;
		return year;
	}

	public static void main (String [] args) {
			
		LeapYear ly = new LeapYear (2021);

		for (int i = 1; i <= 20; ++i) {
			System.out.println(ly.nextLeap());	
		}
	}
}
