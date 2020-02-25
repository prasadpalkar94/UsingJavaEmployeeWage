import java.util.*;
 public class EmpWageBuilderforHashMap{
		public static final int FULL_TIME=1;
      public static final int PART_TIME=2;

		private ArrayList<EmpWage> emp= new ArrayList<EmpWage>();

		public EmpWageBuilderforHashMap(){
			//emp = new ArrayList<EmpWage>();
		}

		public void addDetails(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
			emp.add( new EmpWage(Company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth) );
			empWageBuilder();
		}

		public static void empWageBuilder(){

			HashMap<String,Integer> map= new HashMap<>();
			int totalEmpHrs=0,totalWorkingDays=0, dailyWage=0, totalEmpWage=0;
         while(totalEmpHrs <= EmpWage.maxHoursPerMonth && totalWorkingDays < EmpWage.numOfWorkingDays){
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
         	dailyWage=(empHrs*EmpWage.empRatePerHour);
         	totalEmpWage += dailyWage;
         	System.out.println("Daily Wage="+dailyWage);
				map.put("DAY"+totalWorkingDays,dailyWage);
      }
         	System.out.println("Total Wages="+totalEmpWage);
		}

		public static void main(String args[]){
		EmpWageBuilderforHashMap obj= new EmpWageBuilderforHashMap();
		obj.addDetails("Bridgelabz",30,20,100);
		obj.addDetails("D-mart",35,20,100);
		obj.addDetails("TeaShop",25,20,100);		
		}
}
