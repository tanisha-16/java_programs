package OOPS2.Vehicle;


public class Car extends Vehicle {
	int numGears;
	boolean isConvertible;
        
        public void printCar(){
            System.out.println("Car color : "+color);
            System.out.println("Car Speed : "+getmaxSpeed());
            System.out.println("Car numGears : "+numGears);
            System.out.println("Car isConvertible : "+isConvertible);
        }
        public void print(){
            System.out.println("Car color : "+color);
            System.out.println("Car Speed : "+getmaxSpeed());
            System.out.println("Car numGears : "+numGears);
            System.out.println("Car isConvertible : "+isConvertible);
        }
}
