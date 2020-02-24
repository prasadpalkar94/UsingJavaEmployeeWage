public class EmpWageBuilderObject{
		public static final int FULL_TIME=1;
      public static final int PART_TIME=2;


		private final String Company;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxHoursPerMonth;

		public EmpWageBuilderObject(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
			this.Company = Company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
		}


		public static void main(String args[]){
			EmpWageBuilderObject dmart = new EmpWageBuilderObject("Dmart",20,2,10);
			int totalEmpHrs=0,totalWorkingDays=0, dailyWage=0, totalEmpWage=0;
			while(totalEmpHrs <= dmart.maxHoursPerMonth && totalWorkingDays < dmart.numOfWorkingDays){
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
	 		dailyWage=(empHrs*dmart.empRatePerHour);
      	totalEmpWage += dailyWage;
      	System.out.println("Daily Wage="+dailyWage);
		}
			System.out.println("Total Wages="+totalEmpWage);
	}
}
