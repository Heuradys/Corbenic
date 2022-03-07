package moe.anhedonia.main;

public class Car {
	
	private float gasPrice;
	private float commuteDistance;
	private float milesPerGallon;
	
	public float costPerMileCar;
	public float commuteCarCost;
	
	public Car(float gasPrice, float mpg, float commuteDistance) {
		this.setGasPrice(gasPrice);
		this.setMilesPerGallon(mpg);
		this.setCommuteDistance(commuteDistance);
	}
	
	public float getCostPerMileCar(float gp, float mpg) {
		costPerMileCar = gp / mpg;
		return costPerMileCar;
	}
	
	public float getCommuteCostCar(float cpmc, float cDistance) {
		commuteCarCost = cpmc * cDistance;
		return commuteCarCost;
	}

	public float getGasPrice() {
		return gasPrice;
	}

	public void setGasPrice(float gasPrice) {
		this.gasPrice = gasPrice;
	}

	public float getCommuteDistance() {
		return commuteDistance;
	}

	public void setCommuteDistance(float commuteDistance) {
		this.commuteDistance = commuteDistance;
	}

	public float getMilesPerGallon() {
		return milesPerGallon;
	}

	public void setMilesPerGallon(float milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}

}
