package TreeSet;

public class TreeSetExModel implements Comparable<TreeSetExModel>{
	
	String name;
	int empId;
	int Phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public TreeSetExModel() {
		super();
		
	}
	public TreeSetExModel(String name, int empId, int phone) {
		super();
		this.name = name;
		this.empId = empId;
		Phone = phone;
	}
	@Override
	public String toString() {
		return "TreeSetExModel [name=" + name + ", empId=" + empId + ", Phone=" + Phone + "]";
	}
	@Override
	public int compareTo(TreeSetExModel o) {
		
		return this.empId - o.empId;
	}
	
	
	
	
	

	
	
}
