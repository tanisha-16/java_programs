package OOPS2.Vehicle;


public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
                v.color="Black";
                v.setmaxSpeed(120);
		v.print();
		
		Car c = new Car();
		c.numGears = 10;
		c.color = "Brown";
//		c.print();
//                c.setmaxSpeed(100);
//                c.printCar();
                c.setmaxSpeed(100);
                c.print(); //Here i use override method print
	}
}
