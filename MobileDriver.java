///  Console Based Filpkart mobile application using java 



// .................................Service Provider program as Mobile......................


public class Mobile
{
	private String name;
	private String color;
	private int ram;
	private int rom;
	private double price;
	public Mobile(String name,String color,int ram,int rom,double price)
	{
		this.name=name;
		this.color=color;
		this.ram=ram;
		this.rom=rom;
		this.price=price;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public void setRam(int ram)
	{
		this.ram=ram;
	}
	public int getRam()
	{
		return ram;
	}
	public void setRom(int rom)
	{
		this.rom=rom;
	}
	public int getRom()
	{
		return rom;
	}
	public double getPrice()
	{
		return price;
	}
	public void display()
	{
		System.out.println("Mobile Name : "+name);
		System.out.println("Mobile color : "+color);
		System.out.println("Mobile RAM : "+ram);
		System.out.println("Mobile ROM : "+rom);
		System.out.println("Mobile Price : "+price);
	}
}



//............................user program as MobileDriver .................................



import java.util.*;
class MobileDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Mobile m=null;
		boolean exit=true;
		do
		{
			System.out.println("choose your option to proceed......\n\t\t\t\t\t1.Add mobile Details\n\t\t\t\t\t2.Dispaly All Details\n\t\t\t\t\t3.Display Price\n\t\t\t\t\t4.change color\n\t\t\t\t\t5.change mobile\n\t\t\t\t\t6.change ram\n\t\t\t\t\t7.change rom\n\t\t\t\t\t8.exit");
			System.out.println();
			System.out.println();
			int n=sc.nextInt();
			System.out.println("Option that you entered is :                   "+n);
			System.out.println();
			switch(n)
			{
				case 1:
					System.out.println("Enter the mobile do you want:");
					String name=sc.next();
					System.out.println("Enter the mobile color do you want:");
					String color=sc.next();
					System.out.println("Enter the ram do you want:");
					int ram=sc.nextInt();
					System.out.println("Enter the rom do you want:");
					int rom=sc.nextInt();
					System.out.println("Enter the mobile price do you want:");
					double price=sc.nextDouble();
					m=new Mobile(name,color,ram,rom,price);
					System.out.println();
					break;
				case 2:
					if(m!=null)
						m.display();
					else
						System.out.println("Mobile not found  ");
					System.out.println();
					break;
				case 3:
					if(m!=null)
						System.out.println("Price is            : "+m.getPrice());
					else
						System.out.println("Mobile not found   ");
					System.out.println();
					break;
				case 4:
					if(m==null)
						System.out.println("Mobile not found  ");
					else
					{
						System.out.println("enter the new mobile color do you want");
					    color=sc.next();
						System.out.println("old Mobile color is : "+m.getColor());
						m.setColor(color);
						System.out.println("New Mobile color is : "+m.getColor());
					}
					System.out.println();
					break;
				case 5:
					if(m==null)
						System.out.println("Mobile not found  ");
					else
					{
						System.out.println("enter the new mobile do you want");
						name=sc.next();
						System.out.println("old Mobile is       : "+m.getName());
						m.setName(name);
						System.out.println("New Mobile color is : "+m.getName());
					}
					System.out.println();
					break;
				case 6:
					if(m==null)
						System.out.println("Mobile not found  ");
					else
					{
						System.out.println("enter the new mobile ram do you want");
						ram=sc.nextInt();
						System.out.println("old Mobile ram is   : "+m.getRam());
						m.setRam(ram);
						System.out.println("New Mobile ram is   : "+m.getRam());
					}
					System.out.println();
					break;
				case 7:
					if(m==null)
						System.out.println("Mobile not found  ");
					else
					{
						System.out.println("enter the new mobile rom do you want");
						rom=sc.nextInt();
						System.out.println("old Mobile rom is   : "+m.getRom());
						m.setRom(rom);
						System.out.println("New Mobile rom is   : "+m.getRom());
					}
					System.out.println();
					break;
				case 8:
					exit=false;
					System.out.println("                 ....#....@....*....	THANK YOU VISIT AGAIN	....*....@....#");
					break;
				default:
					System.out.println("Enter the valid option");
					System.out.println();
					break;
			}
		}
		while (exit);
	}
}
