 public class EmpWage{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;

	public  void EmpWageBuilder(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
	int totalEmpHrs=0,totalWorkingDays=0, dailyWage=0, totalEmpWage=0;
         while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays){
				totalWorkingDays++;
            int empHrs=0;
            int empCheck= (int)Math.floor(Math.random()*10) % 3;
               switch(empCheck) {
                  case FULL_TIME:
                     empHrs=8;
                     break;
                  case PART_TIME:
                     empHrs=4;
                     break;
                  default: 
                     empHrs=0;
         }
        	 totalEmpHrs += empHrs;
         	dailyWage=(empHrs*empRatePerHour);
         	totalEmpWage += dailyWage;
         	System.out.println("Daily Wage="+dailyWage);
      }
         	System.out.println("Total Wages="+totalEmpWage);

		}

}
