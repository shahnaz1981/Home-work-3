package oopencaps;

public class TestStudent {

	public static void main(String[] args) {

    Student st1=new Student();
    st1.setStName("Tas");
    st1.setStId(101);
    st1.setStDob(2011);
    
    Student st2= new Student();
    st2.setStName("PD");
    
    st2.setStId(205);
    st2.setStDob(2003);
    
    Student st3=new Student();
    st3.setStName("Pop");
    st3.setStId(405);
    st3.setStDob(2008);
    
    
    System.out.println(" First Name is"+"Tas"+"\n ID is"+101+"\n Dob is" +2011);
    System.out.println("Second Name is"+"PD"+"\n ID is"+205+"\n Dob is" +2003);
    System.out.println(" Third Name is"+"P0p"+"\n ID is"+101+"\n Dob is" +2008);
    
    
    Student st4=new Student();
    System.out.println("Sony"+ 102+11 );
   
    
    
	}

}
