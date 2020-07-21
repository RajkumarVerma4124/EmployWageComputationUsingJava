import java.util.*;
public class EmployWageComputation
{
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		System.out.println();
		System.out.println("Calculate Daily Employee Wage(UC2)");
		Scanner sc = new Scanner(System.in);
		//constant
		final int fullTime=1;
		//computation
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if ( empCheck == fullTime ) {
			System.out.println("Employee is Present");
			System.out.print("Enter The Total Daily Hour : ");
			int dailyHours = sc.nextInt();
			System.out.print("Enter The Wage Per Hour : ");
			int wagePerHours = sc.nextInt();
			int fullDayWage = wagePerHours * dailyHours;	
			System.out.println("Employee daily wage is :"+fullDayWage);
		}
		else{
			System.out.println("Employee is Absent");
		}
		sc.close();
		
	}

}