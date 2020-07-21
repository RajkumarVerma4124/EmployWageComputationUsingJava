import java.util.*;
public class EmployWageComputation
{
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Total Daily Hour : ");
		int dailyHours = sc.nextInt();
		System.out.print("Enter The Wage Per Hour : ");
		int wagePerHours = sc.nextInt();
		//constant
		final int fullTime=1, partTime=2, dayPerMonth = 20;
		//variable
		int dailyWage, monthlyWage = 1, dailyEmpHours =0;
		//computation
		System.out.println("Solving using Switch Case Statement (UC4)");
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
			case fullTime:
				dailyEmpHours = dailyHours;
				System.out.println("Employ Wage For Full Time is :"+(dailyEmpHours*wagePerHours));
				break;
			case partTime:
				dailyEmpHours = dailyHours / 2;
				System.out.println("Employ Wage For Part Time is :"+(dailyEmpHours*wagePerHours));
				break;
			default:
				dailyEmpHours = 0;
				System.out.println("Employ Is Absent For Today with wage :" +dailyEmpHours);
				break;
		}
		System.out.println();
		System.out.println("Calculating Wages for a Month - Assume 20 Working Day per Month (UC5)");	
		dailyWage = wagePerHours * dailyHours;
		monthlyWage = dayPerMonth * dailyWage;
		System.out.println("Employee monthly wage is "+monthlyWage);
		sc.close();
	}

}