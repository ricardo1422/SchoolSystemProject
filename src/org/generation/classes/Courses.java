package org.generation.classes;

import java.util.HashSet;

public class Courses {
	
	String courseName;
	String professorName;
	int year;
	
	HashSet<Student> students= new HashSet<Student>();
	
	
	public Courses(String courseName, String professorName, int year){
		this.courseName=courseName;
		this.professorName=professorName;
		this.year=year;
		
		
	}
	
	public void enroll(Student student){
	      //TODO add the student to the collection
			if(students.contains(student)) {
				System.out.println("Estudiante "+student.getFullName()+" ya esta inscripto en el curso: "+this.courseName);
				
			}else
			{
			  students.add(student);
			  System.out.println("Estudiante "+student.getFullName()+" añadido con exito al curso: "+this.courseName);
			}
	   }
	public void enroll(Student[] arrstudents){
		//TODO add the student to the collection
		for (Student student : arrstudents) {
			
			if(students.contains(student)) {
				System.out.println("Estudiante "+student.getFullName()+" ya esta inscripto en el curso: "+this.courseName);
				
			}else
			{
				students.add(student);
				System.out.println("Estudiante"+student.getFullName()+" añadido con exito al curso: "+this.courseName);
			}
			
		}
		
	}

	   public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
		   if(students.contains(student)) {
			   students.remove(student);
			   System.out.println("Estudiante "+student.getFullName()+" ha sodo eliminado del cuso "+this.getCourseName());
			   
		   }else {
			   System.out.println("El estudiante "+student.getFullName()+" no esta inscripto en este curso");
		   }
	   }

	   public int countStudents(){
	       //TODO implement
		   System.out.println("El número de estudiantes del curso "+this.courseName+" es:");
	       return  students.size();
	   }
	   
	   public int bestGrade(){
	       //TODO implement
		   int bestGrade=0;
		   for(Student student:students) {
			   
			   if(student.getGrade()>bestGrade) {
				   bestGrade=student.getGrade();
			   }
			   
		   }
		   System.out.println("El mayor promedio del curso "+this.courseName+" es:");
	       return bestGrade;
	   }
	   
	   public double AverageGrade() {
		   double averageGrade=0.0;
		   for (Student student : students) {
			averageGrade+=student.getGrade();
		   }
		   averageGrade=averageGrade/students.size();
		   return averageGrade;
	   }
	   
	   public String getCourseName() {
		   return this.courseName;
	   }
	   
	   public void ranking()
	   {
		   Student [] arrAux= new Student[students.size()];
		   int contador=0;
		   Student temporal;
		   if(students.size()!=0 && students.size()!=1) {
			   for (Student student : students) {
				   arrAux[contador]=student;
				   contador++;
				
			   }			  
			   for (int i = 0; i < arrAux.length; i++) {
				   for (int j = 1; j < arrAux.length-i; j++) {
					   if(arrAux[j-1].getGrade() < arrAux[j].getGrade())
					   {
						   temporal=arrAux[j-1];
						   arrAux[j-1]=arrAux[j];
						   arrAux[j]=temporal;
					   }
				   }
			   }
			   System.out.println("\nRanking de alumnos de la clase "+this.courseName);
			   for (Student student : arrAux) {
				
				   System.out.println(student.getFullName()+" -> "+student.getGrade());
				
			   }
		   }else if(students.size()==0) {
			   System.out.println("No hay alummnos inscriptos para hacer el ranking");
		   }else if(students.size()==1) {
			   for (Student student : students) {
				System.out.println("\nRanking de alumnos de la clase "+this.courseName);
				System.out.println(student.getFullName()+" -> "+student.getGrade());
			}
		   }
	   }
	   
	   public void aboveAverage() {
		   double averageGrade=AverageGrade();
		   System.out.println("\nEl promedio general de la clase: "+this.courseName+" fue de: "+averageGrade);
		   for (Student student : students) {
			   if (student.getGrade()>=averageGrade) {
				System.out.println("El estudiante "+student.getFullName()+" con un promedio de: "+student.getGrade()+" que fue mayor o igual al promedio general de la clase");
			} else {
				System.out.println("El estudiante "+student.getFullName()+" con un promedio de: "+student.getGrade()+" que fue menor al promedio general de la clase");
			}
			
		}
	   }
}
