package com.ty.log4j_ex;

import java.util.Scanner;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class ValidatePersonInfo {
	static Logger logger=Logger.getLogger(ValidatePersonInfo.class);
	static Layout layout=new PatternLayout("%d %p %c %m %c %l %n");
	
	public static void validatePerson( Person person,String customerId,String password)
	{
		Scanner scanner=new Scanner(System.in);
		if(person.getAccountId().equals(customerId)&& person.getPassword().equals(password))
		{
			boolean flag=true;
			do {
				System.out.println("enter choice \n 1.for check balance \n 2.for credit \n 3.for withdraw \n 4.Logout");
				int choice=scanner.nextInt();
				switch (choice) {
				case 1:{
					System.out.println(" balance : "+person.getBalance());
				}
				break;
				case 2 :{
					System.out.println("enter the amount to be credited ");
					double creditedamount=scanner.nextDouble();
					double newbalance=person.getBalance()+creditedamount;
					person.setBalance(newbalance);
					System.out.println("new balance : "+ newbalance);
				}
				break;
				case 3: {
					System.out.println("enter the amount to be withdrawn ");
					double withdrawamount=scanner.nextDouble();
					double newbalance=person.getBalance()-withdrawamount;
					person.setBalance(newbalance);
					System.out.println("new balance : "+newbalance);
				}
				break;
				case 4 : {
					System.out.println(" Thank you visit again");
					System.exit(0);
				}
				default:
					break;
				}
				
				
			} while (flag);
			
		}else
			logger.info("invalid user info");
	}
	
	public static void main(String[] args) {
		Appender appender=new ConsoleAppender(layout);
		logger.addAppender(appender);
		Scanner scanner=new Scanner(System.in);
		
		Person person=new Person();
		person.setAccountId("ICICI1234");
		person.setName("manu");
		person.setBalance(100000);
		person.setPassword("123");
		int count=3;
		while(count>0)
		{
			System.out.println("enter the account id");
			String customerId=scanner.next();
			System.out.println("enter the password");
			String password=scanner.next();
			validatePerson(person, customerId, password);
			count--;
		}
		logger.warn("user account blocked for next 24 hrs");
	}

}
