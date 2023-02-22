package Programa;

import java.util.Scanner;

import javax.swing.JFrame;

public class Bank {

	public static void main(String[] args) {
		
		Scanner code = new Scanner(System.in);
		
		double balance = 0;
		double sum;
		int option;
	do { 
		  System.out.println("+--------------------------------+");
	      System.out.println("|           AGENCY BANK          |");
	      System.out.println("|                                |");
	      System.out.println("|          (1) WITHDRAW          |");
	      System.out.println("|          (2) DEPOSIT           |");
	      System.out.println("|          (3) TRANSFER          |");
	      System.out.println("|          (4) QUIT              |");
	      System.out.println("|                                |");
	      System.out.println("+--------------------------------+");
	      
	      option = code.nextInt();
	     
	      switch(option) {
	      
	      case 1:
	    	  System.out.println("What amount do you want to withdraw?");
	    	  double withdraw = code.nextDouble();
	    	  
	    	  if(withdraw > balance) {
	    		  System.out.print("Insufficient value");
	    	  }else {
	    		  System.out.println("Withdrawal made successfully");
	    	  }
	    	  
	     case 2:
	    	 System.out.println("What amount do you want to deposit?");
	    	 double deposit = code.nextDouble();
	    	 balance = deposit + balance;
	    	 
	         System.out.println("Amount successfully deposited");
	         System.out.println("Your current balance is: $"+balance);
	    case 3:
	    	 System.out.println("what amount do you want to transfer?");
	    	 double transfer = code.nextDouble();
	    	 
	    	 System.out.println("Who do you want to transfer to?"); 
	    	 String recipient = code.next();
	    	 
	    	 System.out.println("Enter account number");
	    	 int account = code.nextInt();
	    	 
	    	 System.out.println("He is sure?");
	    	 String confirmation = code.next();
	    	 
	    	 System.out.println("Amount of $"+transfer +  
	    			 " successfully transferred to "+recipient );
	    	 
	    case 4:
	    	System.out.println("Exiting....");
	      }
	   } while(option != 4);   
	}

}
