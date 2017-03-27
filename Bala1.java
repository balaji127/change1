class Bala1{
	     int rollno;
		 String name;
		 String collegename;
	Bala1(){                       //This is default constructor
      System.out.println("The details of the stuudents are");
	}
	Bala1(int roll){             //This is single parameterized constructor
		this();                    //calling the Default constructor
		System.out.println(" ");
	}
	Bala1(int no,String ne){ //This is double parameterized constructor
		this(12);                  //calling the single parameterized constructor
	}
   Bala1(int rollno,String name,String collegename){ //This is three parameterized constructor
	   this(12,"Balaji");                        // calling the double parameterized constructor 
           this.rollno = rollno;
	   this.name   = name;
	   this.collegename= collegename;
	                                    
   }
   void display(){
	   System.out.println(rollno+" "+name+" "+collegename);
   }

   public static void main(String args[]){
	   Bala1 bal = new Bala1(12,"Balaji","vits");
	   bal.display();
   }
}