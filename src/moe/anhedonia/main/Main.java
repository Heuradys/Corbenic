package moe.anhedonia.main;

public class Main {
	
	private float gasPrice;
	private float commuteDistance;
	private float milesPerGallon;
	private float eBikeCost;
	
	public float costPerMileCar;
	public float costPerMileBike;
	
	

	public static void main(String[] args) {
		
		//ask for input here
		
		Car car = new Car(4, 26, 8);
		float costPerMileCar = car.getCostPerMileCar(car.getGasPrice(), car.getMilesPerGallon());
		System.out.println(costPerMileCar);
		
		float costPerCommuteCar = car.getCommuteCostCar(costPerMileCar, car.getCommuteDistance());
		System.out.println(costPerCommuteCar);
	}
	
	public void a () {
		//getCostPerMileCar(gasPrice, milesPerGallon);
	}
	
	
	
	//public float getCostPerCommuteCar(float gp, float mpg);

}
