package oop1;

public class TestCar {

	public static void main(String[] args) {
	Car car=new Toyota();	
	car.start();
	car.stop();
	car.wheel();
	
	Toyota camry=new Toyota();
	camry.start();
	camry.motorVehicle();
	camry.engineRunBettary();
	
	
Bmw sereise5=new Bmw();	
sereise5.start();	
sereise5.stop();
sereise5.wheel();
sereise5.moonroof();

EcletricCar sereise6=new Toyota();
sereise6.engineRunBettary();

FlyingCar kittyHawk=new Toyota();

kittyHawk.autoPilot();
kittyHawk.flyingFeature();
kittyHawk.flyingSource();

	}

}
