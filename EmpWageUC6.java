public class EmpWageUC6{
		public static final int FULL_TIME=1;
      public static final int PART_TIME=2;
      public static final int EMP_RATE_PER_HOUR=20;
		public static final int NUM_WORKING_DAYS=20;		
		public static final int MAX_HRS_IN_MONTH=100;
	public static void main(String args[]){
		int totalEmpHrs=0,totalWorkingDays=0, dailyWage=0, totalEmpWage=0;
		while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS){
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
	 	dailyWage=(empHrs*EMP_RATE_PER_HOUR);
      totalEmpWage += dailyWage;
      System.out.println("Daily Wage="+dailyWage);
	
		}
		System.out.println("Total Wages="+totalEmpWage);
	}
}
