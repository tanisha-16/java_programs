package OOPS2.Vehicle;


public class Vehicle {
	String color;
	private int maxSpeed;
	
        public void setmaxSpeed(int maxSpeed){
            this.maxSpeed=maxSpeed;
        }
        public int getmaxSpeed(){
            return maxSpeed;
        }
	public void print() {    //override method
		System.out.println("Vehicle color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);
	}
	
}
