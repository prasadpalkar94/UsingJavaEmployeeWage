 public class ArrayforEmpWageBuilderObject{
		public static final int FULL_TIME=1;
      public static final int PART_TIME=2;


		private final String Company;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxHoursPerMonth;



		public ArrayforEmpWageBuilderObject(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
			this.Company = Company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
		}

		public void setCompany(String Company) {
      this.Company = Company;
   	}
   	public void setEmpRatePerHour(int empRatePerHour) {
      this.empRatePerHour = empRatePerHour;
   	}

		public void setNumOfWorkingDays(int  numOfWorkingDays) {
      this.numOfWorkingDays =  numOfWorkingDays;
      }
      public void setAge(int maxHoursPerMonth) {
      this.maxHoursPerMonth = maxHoursPerMonth;
      }

   	public void display(){
      	System.out.println("CompanyName: "+this.Company);
      	System.out.println("Emp_Rate_Per_Hour: "+this.empRatePerHour);
      	System.out.println("Num_Of_Working_Days: "+this.numOfWorkingDays);
   		System.out.println("Max_Hours_Per_Month: "+this.maxHoursPerMonth);
		}

		public void EmpWageBuilder(){

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

		public static void main(String args[]){
			ArrayforEmpWageBuilderObject[] emparray= new ArrayforEmpWageBuilderObject[5];
			emparray[0]= new MethodforEmpWageBuilderObject("D-mart",50,20,100);
			emparray[1]= new MethodforEmpWageBuilderObject("Reliance-Store",20,30,100);
			emparray[2]= new MethodforEmpWageBuilderObject("Vijay-Sales",30,20,100);
			emparray[3]= new MethodforEmpWageBuilderObject("Senheiser",35,20,100);
			emparray[4]= new MethodforEmpWageBuilderObject("Big-Bazaar",40,20,100);
			for(int i=0;i<emparray.length;i++){
				emparray[i].EmpWageBuilder();
			 	System.out.println(" ");
			}
				
	}
}
