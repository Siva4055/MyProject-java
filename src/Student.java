
public class Student {
      int id;
      String name;
      String CollegeName;
      String course;
      int marks;
      int fee;
     void assignValues(int id,String name,String CollegeName,String course,int marks,int fee) {
    	this.id=id;
  		this.CollegeName=CollegeName;
  		this.course=course;
  		this.marks=marks;
  		this.fee=fee;
      }
     
        
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", CollegeName=" + CollegeName + ", course=" + course
				+ ", marks=" + marks + ", fee=" + fee + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub 
     Student siva=new Student();
    // siva.id=11;
    // siva.name="Abhi";
    // siva.CollegeName="St.peter's";
   
     siva.assignValues(123,"ABhi","PEters ","CSE",89,54000);
     System.out.println(siva);
	}

}
