
public class SBI {

        String name;
        int accNo;
        String mobile;
        int balance;
    
	public SBI(String name,int accNo,String mobile ) {
		super();
		// TODO Auto-generated constructor stub
		this.name=name;
		this.mobile=mobile; 
		this.balance=balance;
		this.accNo=generateAccNo();
	}
	
     int generateAccNo() {
    	 int max=5000;
    	 int min=500;
    	 int range=max-min+1;
    	 
    	 int randNo=(int)(Math.random()*range)+min;
    	 return randNo;
     }
	      void deposit(int amt){
		  this.balance=this.balance+amt;
		  System.out.println("succesfully deposited  : " + amt);
	  } 
	      void withdraw(int amt) {
	    	  if(this.balance> amt) {
	    	  this.balance=this.balance-amt;
	    	  System.out.println("successfully withdrawn   :  " + amt);
	    	  }
	    	  else {
	    		  System.out.println("insufficient balance");
	    	  }
	      }
	      void Checkbalance() {
	    	  System.out.println("avail balance   : " +this.balance);
	      }
	@Override
	public String toString() {
		return "SBI [name=" + name + ", accNo=" + accNo + ", mobile=" + mobile + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated mehod stub
		SBI sbi=new SBI("Siva", 131313 , "4242443424 ");
		System.out.println(sbi);
		System.out.println("amount depositing----->" );
		sbi.deposit(15000);
		System.out.println("withdrawn amount----->");
		sbi.withdraw(17000);
		System.out.println("available balance---->");
		sbi.Checkbalance();
		
		
}
}
 