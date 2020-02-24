public class Charge{
	private final double rx;
	private final double ry;
	private final double q;

	public Charge(double x0,double y0,double q0){
		this.rx=x0;
		this.ry=y0;
		this.q=q0;
	}
	
	private double potentialAt(double x,double y){
		double k= 8.99e09;
		double dx=x-rx;
		double dy=y-dy;
		return k * q / Math.sqrt(dx*dx + dy*dy);
	}

	@Override
	public String toString(){
	return q+ "at" + "(" +rx+ "," +ry+ ")";
	}

	public static void main(String args[]){
		double x= Double.parseDouble(args[0]);
		double y= Double.parseDouble(args[1]);
		



	}


}
