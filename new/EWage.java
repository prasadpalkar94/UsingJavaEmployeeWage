 public class EWage{
		


		private final String Company;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxHoursPerMonth;

		public EWage(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
			this.Company = Company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
		}


		public static void main(String args[]){
			EmpWage obj= new EmpWage();
			obj.EmpWageBuilder("D-mart",50,20,100);
	     }
}
