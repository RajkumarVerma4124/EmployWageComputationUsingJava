import java.util.*;

class EmpWageComputaion {
	public static final int fullTime = 1;
    public static final int partTime = 2;
    	
	public final String company;
    public final String name;
    public final int wagePerHours;
    public final int dailyHours;
    public final int dayPerMonth;
    public final int totalHours;

    public EmpWageComputaion(String company, String name, int wagePerHours, int dailyHours, int dayPerMonth, int totalHours) {
        this.company = company;
        this.name = name;
        this.wagePerHours = wagePerHours;
        this.dailyHours = dailyHours;
        this.dayPerMonth = dayPerMonth;
        this.totalHours = totalHours;
    }
    
    public String getCompany() {
		return this.company;
	}
    
    public String getName() {
		return this.name;
	}
    
    public int employMonthlyWage() {
        // variable
        int dailyWage, totalWage = 0, dailyEmpHours = 0, hours = 0, day = 0;

        // computation
        while (hours < totalHours && day < dayPerMonth) {
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
            System.out.println("Day : " + day + "  Hours : " + hours + "  DailyWage : " + dailyWage + "  TotalWage : "+ totalWage);
        }
        return totalWage;
    }
}

public class EmployWageComputation {

    public static void main(String[] args) {
    	
    	System.out.print("Calculating The Monthly Employ wage for multiple companies");
        System.out.println();
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter The No. Of Records You Want To Enter : ");
        int records = sc.nextInt();
    	 
        EmpWageComputaion companyWageofEmp[] = new EmpWageComputaion[records];
     
	    for(int i=0; i<records; i++) {
		    System.out.print("Enter The Name Of The Company : ");
		    String company = sc.next();
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
		   
		    companyWageofEmp[i] = new EmpWageComputaion(company, name, wagePerHours, dailyHours, dayPerMonth, totalHours);
		    System.out.println("Employ Name : " +companyWageofEmp[i].getName()+ "  :: Company name : "+companyWageofEmp[i].getCompany()+"  :: Total Wage : "+companyWageofEmp[i].employMonthlyWage());
	        System.out.println();			
	    }
    sc.close();
    }
}





















