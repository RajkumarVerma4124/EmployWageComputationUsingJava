import java.util.*;
public class EmployWageComputation
	{
	//constant
	public static final int fullTime=1;
	public static final int partTime=2;
	
		private int employMonthlyWage( String name, int wagePerHours, int dailyHours, int dayPerMonth, int totalHours ) 
		{
			//variable
			int dailyWage, totalWage = 0, dailyEmpHours = 0, hours = 0, day = 0;
			//computation
			while ( hours < totalHours && day < dayPerMonth )
			{
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
			totalWage += dailyWage;
			System.out.println("Day : " +day+ "  Hours : " +hours+ "  DailyWage : " +dailyWage+ "  TotalWage : " +totalWage);
			}
			System.out.println();
			System.out.println("Employ "+name+" Got Total monthly wage of Rs : "+totalWage+ " and Total Hours He Worked For is : "+hours+" And Total Day is : "+day);
			return totalWage;
		}
			
	public static void main(String[] args)
	{
		System.out.println("Calculating The Monthly Employ wage Using Switch Case ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Name Of The  Employ : ");
		String name = sc.next();	
		System.out.print("Enter The Total Daily Hour : ");
		int dailyHours = sc.nextInt();
		System.out.print("Enter The Wage Per Hour : ");
		int wagePerHours = sc.nextInt();
		System.out.print("Enter The Days in a Month : ");
		int dayPerMonth = sc.nextInt();
		System.out.print("Enter The Total Hours Of That Month You Are Gonna Work : ");
		int totalHours = sc.nextInt();
		EmployWageComputation employ1 = new EmployWageComputation();
		employ1.employMonthlyWage(name, wagePerHours, dailyHours, dayPerMonth, totalHours);
		sc.close();
	}

}