public class EmpWage{
	public static void main(String args[]){
		static final int FULL_TIME=1;
		static final int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10) % 2;
		if(empCheck == FULL_TIME)
			empHrs=8;
		else
			empHrs=0;
		dailyWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Daily Wage="+dailyWage);
	}
}
