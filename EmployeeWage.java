
public class EmployeeWage{
	public static void main(String[] args){
		// Constants
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;

		// Variables
		int empHrs = 0;
		int totalWage = 0;
		int totalWorkingHrs = 0;
		int totalWorkingDays = 0;
		System.out.println("Welcome Wage Employee..");
		//Computraion
		while( totalWorkingHrs <= 100 && totalWorkingDays <=20)
		{
			int empCheck = (int)Math.floor(Math.random() * 10 ) %3;
			switch (empCheck){
				case 0:
					empHrs = 0;
					break;
				case 1:
					empHrs = 4;
					break;
				case 2:
					empHrs = 8;
					break;
			}
			++totalWorkingDays;
			totalWorkingHrs= totalWorkingHrs + empHrs;
		}
		totalWage = totalWorkingHrs * WAGE_PER_HOUR;
		System.out.println("Total Wage: "+totalWage );
	}
}
