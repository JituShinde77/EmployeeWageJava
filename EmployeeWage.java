
public class EmployeeWage{
	public static void main(String[] args){
		// Constants
		int IS_FULL_TIME = 1;
		int WAGE_PER_HOUR = 20;
		int FULL_DAY_HOURS = 8;
		// Variables
		double empCheck = Math.floor(Math.random() * 10 ) %2;
		int dailyWage = 0;

		System.out.println("Welcome Wage Employee..");
		//Computraion
		if (empCheck == IS_FULL_TIME)
		{
			System.out.println("Employee is Present.");
			dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
		}
		else
		{
			System.out.println("Employee is Absent.");

		}
		System.out.println("Employee Daily Wage=" + dailyWage );
	}
}
