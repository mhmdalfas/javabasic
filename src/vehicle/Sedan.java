package vehicle;

public class Sedan {
	
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
	public Sedan(String name, String model, double price, int noairbags) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.noairbags = noairbags;
	}
	public Sedan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Sedan [name=" + name + ", model=" + model + ", price=" + price + ", noairbags=" + noairbags + "]";
	}
	
	

	
	
	
	
	
	
	
	
}
