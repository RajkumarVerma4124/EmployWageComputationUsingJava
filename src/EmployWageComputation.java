import java.util.*;

public class EmployWageComputation {
    public static final int fullTime = 1;
    public static final int partTime = 2;
    	
		public final String company;
	    public final String name;
	    public final int wagePerHours;
	    public final int dailyHours;
	    public final int dayPerMonth;
	    public final int totalHours;

	    public EmployWageComputation(String company, String name, int wagePerHours, int dailyHours, int dayPerMonth, int totalHours) {
	        this.company = company;
	        this.name = name;
	        this.wagePerHours = wagePerHours;
	        this.dailyHours = dailyHours;
	        this.dayPerMonth = dayPerMonth;
	        this.totalHours = totalHours;
	    }

    private int employMonthlyWage() {
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
            System.out.println("Day : " + day + "  Hours : " + hours + "  DailyWage : " + dailyWage + "  TotalWage : "
                    + totalWage);
        }
		System.out.println("Employ Name "+name+" Got Total monthly wage of Rs : "+totalWage+"  and Total Hours : "+hours+"  Total Day is : "+day);
        System.out.println();
        
        return totalWage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Calculating The Monthly Employ wage for multiple companies");
        System.out.println();
        
        System.out.print("Enter The No. Of Records You Want To Enter Max is 4 : ");
        int records = sc.nextInt();
        Map<String, Integer> companyWage = new HashMap<>();
        if( records <=4 ) {
		    for(int i=1; i<=records; i++) {
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
			   
			    if(i == 1) {
			    	EmployWageComputation companyOne = new EmployWageComputation(company, name, wagePerHours, dailyHours, dayPerMonth, totalHours);
			    	System.out.println("Employ Name " + name + " Got Total monthly Wage Of Rs : " + companyOne.employMonthlyWage()+ " From Company Name " +companyOne.company);
			    	companyWage.put(company, companyOne.employMonthlyWage());
			    	System.out.println();
			    }
			    if(i == 2) {
				    EmployWageComputation companyTwo = new EmployWageComputation(company, name, wagePerHours, dailyHours, dayPerMonth, totalHours);
				    System.out.println("Employ Name " + name + " Got Total monthly Wage Of Rs : " + companyTwo.employMonthlyWage()+ " From Company Name " +companyTwo.company);
				    companyWage.put(company, companyTwo.employMonthlyWage());
			    	System.out.println();

			    }
			    if(i == 3) {
				    EmployWageComputation companyThree = new EmployWageComputation(company, name, wagePerHours, dailyHours, dayPerMonth, totalHours);
				    System.out.println("Employ Name " + name + " Got Total monthly Wage Of Rs : " + companyThree.employMonthlyWage()+ " From Company Name " +companyThree.company);
				    companyWage.put(company, companyThree.employMonthlyWage());
			    	System.out.println();

			    }
			    if(i == 4) {
				    EmployWageComputation companyFour = new EmployWageComputation(company, name, wagePerHours, dailyHours, dayPerMonth, totalHours);
				    System.out.println("Employ Name " + name + " Got Total monthly Wage Of Rs : " + companyFour.employMonthlyWage()+ " From Company Name " +companyFour.company);
				    companyWage.put(company, companyFour.employMonthlyWage());
			    	System.out.println();
			    }
		    }
        }
        else {
		    System.out.print("Entries Should be Less than or equal to 4 ");
        }
   
        while (true) {
	        System.out.println("Company Wage Stored in array : " +companyWage);
	        System.out.println("Enter The Company Name To get The Total Wage and press e to Exit ");
	        String companyName = sc.next();
	        String exit = "e";
	        if (companyName.equals(exit)) {
	        	System.exit(1);
	        }
	        else {
	        System.out.println("Total Wage For The Company Name : " +companyName+ " "+companyWage.get(companyName));
	        }  
        }
    }
        
}






















