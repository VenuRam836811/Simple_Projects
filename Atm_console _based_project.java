/// CONSOLE BASED ATM APPLICATIONS MANAGEMENT SYSTEM



import java.util.*;
import java.time.LocalTime;
import java.time.LocalDate;
class Methods 
{
	
	 void withdrwal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pin");
		int pin=sc.nextInt();
		int co=0;
		while(co==0)
		{
		System.out.println("Enter the Money do you want");
		int mon=sc.nextInt();
		if(mon%100==0)
		{
			co+=1;
			System.out.println("Collect your cash");
			break;
		}
		else
		{
			co=0;
			System.out.println("enter the valid amount");
		}
		}
		System.out.println();
		System.out.println();
		
	}
	void check_balance()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pin");
		int pin=sc.nextInt();
		System.out.println("                        Balance Amount\n                           xxxx.xx");
		System.out.println();
		System.out.println();
	}
	void balance_receipt()
	{
		Scanner sc=new Scanner(System.in);
		LocalTime a=LocalTime.now();
		int hour=a.getHour();
		int min=a.getMinute();
		int sec=a.getSecond();
		LocalDate b=LocalDate.now();
		int day=b.getDayOfMonth();
		int month=b.getMonthValue();
		int year=b.getYear();
		System.out.println("Enter the Pin");
		int pin=sc.nextInt();
		System.out.println("                                KARNATAKA BANK OF BANGALORE");
		System.out.println("                                      Customer Advice");
		System.out.println("                          Date: "+day+"-"+month+"-"+year+"           Time : "+hour+":"+min+":"+sec);
		System.out.println("                          Withdrawal  RS  : 0000.00");
		System.out.println("                          From   A/C      : xxxxxxxxxxxxxxx");
		System.out.println("                          Avail BAL       : #####.##");
		System.out.println("                          ...........................................");
		System.out.println("                          --------****---------****--------****------");
		System.out.println("                          ...........................................");
		System.out.println();
		System.out.println();
	}
	void pin_change()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Previous pin");
		int pre_pin=sc.nextInt();
		System.out.println("Enter Your Mobile number");
		Long mbl_num=sc.nextLong();
		System.out.println("Enter the OTP");
		int otp=sc.nextInt();
		System.out.println("Enter the New Pin");
		int new_pin=sc.nextInt();
		System.out.println("                       .....SYCCESSFULLY YOU CHANGED THE ATM PIN.....");
		System.out.println();
		System.out.println();
	}
	void pin_setting()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Mobile number");
		Long mbl_num=sc.nextLong();
		System.out.println("Enter the OTP");
		int otp=sc.nextInt();
		System.out.println("Create a Pin number");
		int new_pin=sc.nextInt();
		System.out.println("                       .....SYCCESSFULLY YOU CREATED THE ATM PIN.....");
		System.out.println();
		System.out.println();
	}
}

public class ATM
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("                                 ----> WELCOME TO ATM <---- ");
		System.out.println("                               Insert your card wait a second");
		Methods obj=new Methods();
		int a=0;
		do
		{
			System.out.println("Choose a valid option do you want ");
			System.out.println();
			System.out.println("\t\t\t....Main menu....\n\t\t\t1.Widthdrwal money\n\t\t\t2.Check balance\n\t\t\t3.Pin change\n\t\t\t4.Pin setting\n\t\t\t5.Balance Receipt\n\t\t\t6.Exit");
			a=sc.nextInt();
		switch(a)
		{
			case 1:
				obj.withdrwal();
			    break;
			case 2:
				obj.check_balance();
			    break;
			case 3:
				obj.pin_change();
			    break;
			case 4:
				obj.pin_setting();
			    break;
			case 5:
				obj.balance_receipt();
			    break; 
			case 6:
				System.out.println("Take your card  ");
				System.out.println();
				System.out.println("                               Thankyou for visiting !!!!");
				System.out.println();
				System.out.println("                        --------****---------****--------****-----");
				System.out.println("                        --------****---------****--------****-----");
				break;
			default:
				System.out.println("Enter the valid option");
				System.out.println();
		}
		}while(a!=6);		
	}
}
