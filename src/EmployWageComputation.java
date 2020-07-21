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
		final int fullTime=1, partTime=2, dayPerMonth = 20, totalHours = 100;
		//variable
		int dailyWage, monthlyWage = 0, dailyEmpHours = 0, hours = 0, day = 0;
		//computation
		System.out.println("Calculated Wages till a condition of working hours or days is reached for a month (UC6)");
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		while ( hours < totalHours && day < dayPerMonth ) {
			empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case fullTime:
					dailyEmpHours = dailyHours;
					break;
				case partTime:
					dailyEmpHours = dailyHours / 2;
					break;
				default:
					dailyEmpHours = 0;
					break;
			}
			hours += dailyEmpHours;
			day++;
			dailyWage = dailyEmpHours * wagePerHours;
			monthlyWage += dailyWage;
			System.out.println("Day : " +day+ "  Hours : " +hours+ "  DailyWage : " +dailyWage+ "  TotalWage : " +monthlyWage);
		}
		System.out.println("Employee Total monthly wage is : "+monthlyWage+ "  and Total Hours : "+hours+"  Total Day is : "+day);
		System.out.println();
		System.out.println("Employee monthly wage is "+monthlyWage);
		sc.close();
	}

}