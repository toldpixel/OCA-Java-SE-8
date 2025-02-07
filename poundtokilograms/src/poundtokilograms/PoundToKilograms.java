package poundtokilograms;

class Convert {
	private double weight;

	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getKilograms() {
		final double kg = 0.45359237d;
		return this.weight * kg;
	}
}

public class PoundToKilograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = 200d;
		System.out.print("Given weight = " + weight + " Pounds");
		Convert cnvObj = new Convert();
		cnvObj.setWeight(weight);
		System.out.print(" are " + cnvObj.getKilograms() + " Kilograms !");
	}

}
