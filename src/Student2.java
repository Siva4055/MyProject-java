 class Laptop{
	 private String model;
	 private int price;
	 private String  processor;
	 private int ram;
	/*public Laptop(String model,int price,String processor,int ram){
		super();
		// TODO Auto-generated constructor stub
		this.model=model;
		this.price=price;
		this.processor=processor;
		this.ram=ram;*/
		
		

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + ", processor=" + processor + ", ram=" + ram + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	 
	 
 }
public class Student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Laptop L=new Laptop();
          L.setModel("Notepad");
          L.setPrice(12000);
          L.setProcessor("I9");
          L.setRam(16);
          System.out.println(L);
          System.out.println(L.getModel() + " : " + L.getPrice()+ " : " + L.getProcessor() + " : " +  L.getRam() );
	}

}
