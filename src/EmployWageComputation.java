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
		final int fullTime=1;
		final int partTime=2;
		//variable
		int dailyEmpHours = 0;
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
		sc.close();
	}

}