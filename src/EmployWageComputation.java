import java.util.*;

class EmployWage {
	 public int dailyWage;
	 public int totalWage;
	 public int day;

	 public EmployWage(int day,int dailyWage, int totalWage) {
		 this.day=day;
		 this.dailyWage=dailyWage;
		 this.totalWage=totalWage;
	
	 }
	 
	 public void showEmployWages(){
		   System.out.print("Day : "+day+" Daily Wage : "+dailyWage+" Total Wage : "+totalWage);
		   System.out.println();
		 }
}



class EmpWageComputaion {
	public static final int fullTime = 1;
    public static final int partTime = 2;
    
	public final String company;
    public final String name;
    public int wagePerHours;
    public int dailyHours;
    public final int dayPerMonth;
    public final int totalHours;
    
    Map<String, Integer> companyWage = new HashMap<>();
    
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
    
    public void addTotalWage() {
    	companyWage.put(company, employMonthlyWage());
	}

	public void getTotalEmpWage(String company) {
        System.out.println("Company Name : "+company+" Total Wage : "+companyWage.get(company));
	}
    
    
    public int employMonthlyWage() {
    	// variable
        int dailyWage, totalWage = 0, dailyEmpHours = 0, hours = 0, day = 0;
        // computation
    	EmployWage[] Wages = new EmployWage[dayPerMonth+1];
    	
    	ArrayList<Integer> dailyEmployWage=new ArrayList<Integer>();  
    	ArrayList<Integer> totalEmployWage=new ArrayList<Integer>();  
    	
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
            dailyEmployWage.add(dailyWage);
            totalWage += dailyWage;
            totalEmployWage.add(totalWage);
            Wages[day] = new EmployWage(day, dailyWage, totalWage);
            Wages[day].showEmployWages();
            //System.out.println("Day : " + day + "  Hours : " + hours + "  DailyWage : " + dailyWage + "  TotalWage : "+ totalWage);
        }
        System.out.println("Daily Wage : "+dailyEmployWage);
        System.out.println("Total Wage : "+totalEmployWage);
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
			    	EmpWageComputaion companyOne = new EmpWageComputaion(company, name, wagePerHours, dailyHours, dayPerMonth, totalHours);
			    	companyWage.put(company, companyOne.employMonthlyWage());
			    	System.out.println();
			    	companyOne.addTotalWage();
			    	companyOne.getTotalEmpWage(company);
			    	System.out.println();
			    }
			    if(i == 2) {
			    	EmpWageComputaion companyTwo = new EmpWageComputaion(company, name, wagePerHours, dailyHours, dayPerMonth, totalHours);
			    	companyWage.put(company, companyTwo.employMonthlyWage());
			    	System.out.println();
			    	companyTwo.addTotalWage();
			    	companyTwo.getTotalEmpWage(company);
			        System.out.println();
			    }
			    if(i == 3) {
			    	EmpWageComputaion companyThree = new EmpWageComputaion(company, name, wagePerHours, dailyHours, dayPerMonth, totalHours);
			    	companyWage.put(company, companyThree.employMonthlyWage());
			    	System.out.println();
			    	companyThree.addTotalWage();
			    	companyThree.getTotalEmpWage(company);
			        System.out.println();
			    }
			    if(i == 4) {
			    	EmpWageComputaion companyFour = new EmpWageComputaion(company, name, wagePerHours, dailyHours, dayPerMonth, totalHours);
			    	companyWage.put(company, companyFour.employMonthlyWage());
			    	System.out.println();
			    	companyFour.addTotalWage();
			    	companyFour.getTotalEmpWage(company);
			        System.out.println();
			    }
		    }
        }
        else {
		    System.out.print("Entries Should be Less than or equal to 4 ");
        }
        
        while (true) {
	        System.out.println("Enter The Company Name To get The Total Wage and press e to Exit ");
	        String companyName = sc.next();
	        String exit = "e";
	        if (companyName.equals(exit)) {
	        	System.exit(1);
	        }
	        else {
	            System.out.println("Company Name : "+companyName+" Total Wage : "+companyWage.get(companyName));

	        }  
        }
    }
}