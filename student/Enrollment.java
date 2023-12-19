package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Enrollment {
	static ArrayList<String> set=new ArrayList<String>();  
	public static void main(String[] args) {		
		 Scanner sc=new Scanner(System.in);
		 int choice;
		 do {
		 System.out.println("1.Enroll \n2.Course Registration list");
		  choice=sc.nextInt();
		  sc.nextLine();
		 switch(choice) {
		 case 1:
			 System.out.println("Student name: ");
		       set.add(sc.nextLine());		     
		        System.out.println("Date of Birth: ");
		        set.add(sc.nextLine());
		        System.out.println("course name: ");
		        set.add(sc.nextLine());
		        System.out.println("Mobile No: ");
		        set.add(sc.nextLine());
		        System.out.println("Email Id: ");
		        set.add(sc.nextLine());
		        System.out.println("Passout year: ");
		        set.add(sc.nextLine());
			 break;
		 case 2:
			 System.out.println("Course name: ");
			 String applylist=sc.nextLine();
			 if(applylist==set.get(2)) {
				 System.out.println("Course Registration student list: ");
			 Iterator<String> itr=set.iterator();  
			 while(itr.hasNext()){  
			 System.out.println(itr.next()); 
			 }
		 }
			 else {
				 System.out.println("This Course list is empty.");
			 }
			 break;
		 }		 
	}while(choice!=0);
	}
}
