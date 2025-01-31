import java.util.Scanner;
public class ArrayMax14 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] num;
       int size;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array");
       size=sc.nextInt();
       num=new int [size];
       for(int i=0;i<size;i++) {
    	   System.out.println("enter" +(i+1)+ " element");
    	   int n=sc.nextInt();
    	   num[i]=n;
       }
       int max=num[0];
       int min=num[0];
       for(int i=1;i<size;i++) {
    	   if(num[i]>max) {
    		   
    	   }
       }
	}

}
