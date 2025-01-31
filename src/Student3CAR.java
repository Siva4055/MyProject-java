
public class Student3CAR {
	 private String brand;
     private String name;
     private String model;
     private int price;
       
     
     
	public Student3CAR( String brand, String name,String model,int price) {
		super();
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.name=name;
		this.model=model;
		this.price=price;
	}
	



	@Override
	public String toString() {
		return "Student3CAR [brand=" + brand + ", name=" + name + ", model=" + model + ", price=" + price + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student3CAR car=new Student3CAR("BMW","Creta","c7",12000);
         System.out.println(car);
         
	}

}
