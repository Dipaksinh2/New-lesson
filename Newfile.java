import java.util.Scanner;
class EMP {

	public static void main(String[] args) 
	{
		Scanner add=new Scanner(System.in);
		
		System.out.print("Enter ID :-");
		String id=add.next();
		
		System.out.print("Enter Name :-");
		String name=add.next();
		
		System.out.print("Enter Age :-");
		int age=add.nextInt();
		
		System.out.print("Enter Salary :-");
		int sal=add.nextInt();
		
		System.out.print("Enter Designation :-");
		String des=add.next();
		
		System.out.println("Hello Mr./Mrs "+name);
		System.out.println("Your ID is "+id);
		System.out.println("Your Age is "+age);
		System.out.println("Your payout would be "+sal);
		System.out.println("You are hired as a "+des);

		System.out.println("Thank you");
	}

}
