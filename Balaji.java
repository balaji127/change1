public class Balaji{
		int rollno;
		String name;
		static String college="RAMCO";//static variable declaration and assiging value to the variable,we can use to refer this variable
                                              // value to all objects
  Balaji(String nm,int roll){                 //parameterised constructor block for name & roll number
	     name=nm;
            rollno=roll;
  }
  static void collegename(){
	   college="Ramco";
   }
	void display(){                       //method  displaying the details of students
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String args[]){
		 Balaji bal = new Balaji("Balaji",21);   //intializing the variables over here
		 Balaji bal1= new Balaji("Charan",22);
		 bal.display(); 
                 bal1.collegename();             //calling the static method and here the value of the college name has changed
		 bal1.display();
	}
}
//if we have used the normal methods the program works fine.But normal methods are associated with objects so every time a new object is created new 
//memory is allocated for the common prorperty this doesn't sound good.So we are using static method or static varaiable.Since these are associated
//with class they get memory at the time of class loading so we can make our memory efficient 
  	