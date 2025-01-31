
public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //char ch= 'a';
          String name1="Siva";
          String name2="Satya";
          System.out.println("before swapping");
          //System.out.println(name3);
          System.out.println(name2);
          System.out.println(name1);
	      System.out.println("after swapping");
      
        String name3  =( name1  + name2);
         // name1=name3.substring(0,4); 
         name2=name3.substring(4,9);
         name1=name1.substring(0,name3.length()-name2.length());
         //System.out.println("after swapping");
         
         System.out.println(name3);
         System.out.println(name2);
         System.out.println(name1);
	}
}
