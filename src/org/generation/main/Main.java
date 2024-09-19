package org.generation.main;

import java.util.ArrayList;

import org.generation.classes.Courses;
import org.generation.classes.Student;

public class Main {

	public static void main(String[] args) {
		//Declara estudiantes
		Student studentRicardo = new Student("Ricardo", "Alfaro", 1, 95, 4);
		Student studentAdrian = new  Student("Adrian", "García", 75);
		Student studentVictor = new Student("Victor", "Matias");
		
		//Declara un array list de estudiantes
		ArrayList<Student> students= new ArrayList<Student>();
		students.add(studentRicardo);
		students.add(studentAdrian);
		students.add(studentVictor);
		
		
		
		//Declara un arreglo con estudiantes para isncribri
		Student [] arrStudent= {studentAdrian, studentVictor};
		Student [] arrStudent2= {studentAdrian, studentVictor, studentRicardo};
		
		//Declara cursos
		Courses courseMath1 = new  Courses("Math 1", "Kevin Carranza", 1);
		Courses courseBiology = new  Courses("Biology", "David Hernandez", 4);
		Courses courseMath3 = new  Courses("Math 3", "Kevin Carranza", 4);
		
		//Declara un array list de estudiantes
		ArrayList<Courses> courses= new ArrayList<Courses>();
		courses.add(courseMath1);
		courses.add(courseMath3);
		courses.add(courseBiology);
		
		//Añade estudiantes a los cursos
		courseMath1.enroll(arrStudent);
		courseMath3.enroll(arrStudent2);
		courseMath1.enroll(studentAdrian);
		courseBiology.enroll(studentRicardo);
		
		
		
		System.out.println("\n Se añadieron estudiantes a cursos e imprime cuantos estudiantes tiene cada curso");
		System.out.println(courseMath1.countStudents());
		System.out.println(courseMath3.countStudents());
		
		System.out.println("\n Se eliminaron estudiantes de cursos e imprime cuantos estudiantes tiene cada curso");
		courseMath3.unEnroll(studentVictor);
		courseMath3.unEnroll(studentVictor);
		
		System.out.println("\n Imprime cuantos estudiantes tiene cada curso");
		for (Courses course : courses) {
			System.out.println(course.countStudents());
		}
		
		courseMath3.enroll(studentVictor);
		System.out.println(courseMath3.countStudents());
		
		System.out.println("\n Imprime los mejores promedios de cada curso");
		for (Courses course : courses) {
			System.out.println(course.bestGrade());
		}
		
		
		System.out.println("\n Imprime los nombres completos de los estudiantes");
		 
		 for (Student student : students) {
			 student.printFullName();
		}
		
		 System.out.println("\n Imprime si aprobaron los estudiantes");
		for (Student student : students) {
			 if(student.isApproved()){
				 System.out.println("El estudiante: "+student.getFullName()+" aprobo" );
			 }else {
				 System.out.println("El estudiante: "+student.getFullName()+" no aprobo" );
			 }
			 
		 }
		
		 System.out.println("\n Imprime el año actual de los estudiantes y lo aumenta si aprobaron ");
		 for (Student student : students) {
			 
			 System.out.println("El estudiante "+student.getFullName()+" va en el año: "+student.getYear());
			 student.changeYearIfApproved();
			 System.out.println("El estudiante "+student.getFullName()+" va en el año: "+student.getYear()+"\n");
			 

		}
		 
		 System.out.println("El promedio del curso ");
		 for (Courses course : courses) {
			System.out.println("El promedio del curso "+course.getCourseName()+" es:"+course.AverageGrade());
		}
		
		 System.out.println("\n Imprime los rankings de los cursos");
		 for (Courses course : courses) {
			 course.ranking();
			
		}
		
		 System.out.println("\n Imprime por cada estudiante esta por encima del promedio o no");
		 for (Courses course : courses) {
			course.aboveAverage();
		}
	}

}
