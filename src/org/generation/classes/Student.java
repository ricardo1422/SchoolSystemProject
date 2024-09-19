package org.generation.classes;

public class Student {
	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	       
	       
	       public Student(String firstName, String lastName, int registration, int grade, int year)
	       {
	    	   this.firstName= firstName;
		       this.lastName= lastName;
		       this.registration= registration;
		       this.grade=grade;
		       this.year=year;
	       }
	       
	       
	       public Student(String firstName, String lastName, int grade)
	       {
	    	   this(firstName, lastName, 0, grade, 1);
	       }
	       public Student(String firstName, String lastName)
	       {
	    	   this(firstName, lastName, 0, 50, 1);
	       }
	       
	       public  String getFullName(){
	    	   return this.firstName+" "+this.lastName;
	       }
	       
	       public int getGrade()
	       {
	    	   return this.grade;
	       }
	       public int getYear()
	       {
	    	   return this.year;
	       }
	       
	       public void printFullName(){
	    	    System.out.println(this.firstName+" "+this.lastName);
	    	 }

	    	 public boolean isApproved(){
	    	     //TODO implement: should return true if grade >= 60
	    		 if(this.grade>=60) {
	    			 return true;
	    		 }else
	    		 {
	    			 return false;
	    		 }
	    	 }

	    	 public int changeYearIfApproved(){
	    	     //TODO implement: the student should advance to the next year if he/she grade is >= 60
	    	     // Make year = year + 1, and print "congratulations" if the student has been approved
	    		 if(isApproved())
	    		 {
	    			 this.year=this.year+1;
	    			 System.out.println("Congratulations");
	    		 }
	    	     return this.year;
	    	 }     
}



