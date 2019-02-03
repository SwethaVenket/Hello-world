import java.util.Scanner;
import java.io.*;

class Bank{
	
	String Name;
	int AccNum;
	String Type;
	int Bal;
	
	void assign() {
		System.out.println("Enter Bank details");
		System.out.println("Enter Name:");
		Scanner sa=new Scanner(System.in);
		Name=sa.nextLine();
		System.out.println("Enter Account type:");
		Type=sa.nextLine();
		System.out.println("Enter Account Num:");
		AccNum=sa.nextInt();
		System.out.println("Enter Amount to be deposited:");
		Bal=sa.nextInt();
		
	}
	
	void deposit() {
		System.out.println("Enter Amount to be deposited:");
		Scanner sd=new Scanner(System.in);
		int deposit=sd.nextInt();
		Bal=Bal+deposit;
		
	}
	
	void withdraw() {
		System.out.println("Enter Amount to be withdrawn:");
		Scanner sw=new Scanner(System.in);
		int withdraw=sw.nextInt();
		Bal=Bal-withdraw;
		
	}
	
	void display() {
		System.out.println("Name:"+Name);
		System.out.println("Account Number:"+ AccNum);
		System.out.println("Type: "+Type);
		System.out.println("Balance Amount"+Bal);
	}
	//The below class is for another class for import class name is BankImportTest.java
	public void ThankYou() {
		System.out.println("Printed from Bank class");
	}
	
	public static void main(String args[]) {
		Bank b=new Bank();
		int ch;
		Scanner scanner=new Scanner(System.in);
				do {
			System.out.println("1.Initiate account\n2.Deposit Money\n3.Withdraw Money\n4.Display details\n5.Exit\n");
			System.out.println("Enter your option\n");
			ch=scanner.nextInt();
			scanner.nextLine();
			switch(ch){
				case 1: b.assign();break;
				case 2: b.deposit();break;
				case 3: b.withdraw();break;
				case 4: b.display();break;
					
			}
		}while(ch<=4);
		
	}
	
}