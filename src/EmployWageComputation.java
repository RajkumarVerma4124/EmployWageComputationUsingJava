import java.util.*;
public class EmployWageComputation
{
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		System.out.println();
		System.out.println("Calculate Daily Employee Wage(UC2)");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Total Daily Hour : ");
		int dailyHours = sc.nextInt();
		System.out.print("Enter The Wage Per Hour : ");
		int wagePerHours = sc.nextInt();
		//constant
		final int fullTime=1;
		final int partTime=2;
		//computation
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		if ( empCheck == fullTime ) {
			System.out.println("Employee is Present For Full Day");
			int fullDayWage = wagePerHours * dailyHours;	
			System.out.println("Employee daily wage is :"+fullDayWage);
		}
		else if ( empCheck == partTime ) {
			System.out.println("Employee is Present For Half Day");
			int partTimeHours=wagePerHours / 2;
			int partTimeWage = partTimeHours * dailyHours;	
			System.out.println("Employee part time wage is :"+partTimeWage);
		}
		else {
			System.out.println("Employee is Absent For The day");
			dailyHours = 0;
		}
		sc.close();
		
	}

}