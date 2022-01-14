package program.locker;
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Locker {
	
	 public static void main(String[] args) {
	 
		 String f,d,m;
		 List list = new List();
		 Scanner sc =new Scanner(System.in);
		 
		 System.out.println("******* Locker Project ********");
		 System.out.println("******* Swapnali Wakale *******\n");
		 

			File file2 = new File("D:\\Lockers_Pvt_Ltd\\");
			 if(file2.isDirectory())
			 {
				 File[] files = file2.listFiles();
				 System.out.println("*******Retriving the File*******");
				 for(File file:files)
				 {
					 System.out.println(file.getName());
				 }
			 }
			
		 char ch ;
		 do {
			 System.out.println("\n*******Lockers Operations*******");
	         System.out.println("1. Add File ");
	         System.out.println("2. Delete File ");
	         System.out.println("3. Search File ");
	         System.out.println("4. Close ");
	         System.out.println("Please enter number 1,2,3 or 4 : ");
	         int choice = sc.nextInt();
	         
		 switch(choice)
		 {		 
		 case 1 : 
			 //create file
			 try
             {	
				 System.out.println("File Name : ");
				  f = sc.next();
				  File file = new File("D://Lockers_Pvt_Ltd//"+f+".txt");
				  
				 if (file.createNewFile()) 
		            {  
		                System.out.println(file.getName()+" File is Created Successfully !! ");  
		                break;
		            }
		            else { 
		                if(file.exists())
		                {	 
		                    System.out.println("File already exists."); 	                           
		                }
		                else
		                {
		                	System.out.println("File doesnot exists.");
		                }
		            }
				 
             }
           
			 catch (IOException e) {  
		            e.printStackTrace(); 
             } 
		  
		 case 2 : //delete the file
			 try {
				
			 System.out.println("which file do you want to Delete : ");
			  d = sc.next();

			  File file = new File("D://Lockers_Pvt_Ltd//"+d+".txt");
			 
			  if(file.exists())
			  {
				  boolean s = Boolean.parseBoolean(d);
				  s = file.delete();
				  System.out.println(file.getName()+" File is Deleted Successfully !!"); 
			  }
			  else
			  {
				  System.out.println("File not deleted");
			  } 
		 }
			 catch (Exception e) {  
				 System.out.println(e);
             } 
			 break;
			  
		 case 3 ://search the file
			 try {
			 System.out.println("which file do you want to Search : ");
			  m = sc.next();

			  File file1 = new File("D://Lockers_Pvt_Ltd//"+m+".txt");
			 if(file1.exists())
			  {
				 System.out.println("File Found : "+file1.getName());
				 }
			 else {
				 System.out.println("File Not Found");
			 }
		 }
		 
		 catch (Exception e) {  
			 System.out.println(e); 
         } 
			 break;
		
		 case 4 : 
			 System.out.println("Thank You !!");

			 System.exit(0);
		default :
			
			 System.out.println("Invalid Choice");
			 break;
		 
		
		 } 
		
		 System.out.println("\nDo you want to continue (Type y or n) \n");
         ch = sc.next().charAt(0);
		 }while (ch == 'Y'|| ch == 'y'); 
		 }

	 
	 }


	 

