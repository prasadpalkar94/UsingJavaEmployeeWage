public class ArrayInitializer{
public static void main (String args[]){
	EmpWageforArray [] object = new EmpWageforArray[10];
	object[0]=new EmpWageforArray("D-Mart",20,20,100);
	object[1]=new EmpWageforArray("Pantaloons",25,20,75);
	object[2]=new EmpWageforArray("Big-Bazaar",30,20,80);
	object[3]=new EmpWageforArray("Reliance",35,20,90);
	object[4]=new EmpWageforArray("Central",40,20,120);
	for (int i=0;i<10;i++){
		object[i].empWageBuilder();
	}
}
}
