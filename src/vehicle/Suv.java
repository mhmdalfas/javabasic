package vehicle;

public class Suv {
	
	String name;
	String model;
	double price;
	int noairbags;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNoairbags() {
		return noairbags;
	}
	public void setNoairbags(int noairbags) {
		this.noairbags = noairbags;
	}
	public Suv(String name, String model, double price, int noairbags) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.noairbags = noairbags;
	}
	public Suv() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Suv [name=" + name + ", model=" + model + ", price=" + price + ", noairbags=" + noairbags + "]";
	}
	
	
	
	

}
