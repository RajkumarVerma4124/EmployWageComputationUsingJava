import java.util.*;
public class EmployWageComputation
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		System.out.println();
		System.out.println("Check Employee is Present or Absent - Use ((RANDOM)) for Attendance Check(UC1)");
		final int fullTime=1;
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if ( empCheck == fullTime )
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}