/// Console Based Textile Management System



import java.util.*;
class Customer            //public class Project 
{
    Scanner sc=new Scanner(System.in);
     void search()           //public static void main(String[] args)
    {
         
        System.out.println("WELCOME TO MEN'S WEAR SHOP");
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("MRS "+name+" welcome to our shop");
        System.out.println("ENJOY YOUR SHOPPING😁😍");
    }
    void fancyWear()
    {
        System.out.println("Enter size do you want:");
        int size=sc.nextInt();
        System.out.println("Enter the cost you like:");
        int cost=sc.nextInt();
        System.out.println("Enter the Colour do you like:");
        String col=sc.next();
        if(col.equals("red")||col.equals("blue")||col.equals("black")||col.equals("white"))
        {
             System.out.println("These are your searched products");
        }
         else
         {
             System.out.println("Sorry!,Your searched product is not available😔");
         }
    }
    void traditionalWear()
    {
        System.out.println("Enter size do you want:");
        int size=sc.nextInt();
        System.out.println("Enter the cost you like:");
        int cost=sc.nextInt();
        System.out.println("Enter the Colour do you like:");
        String col=sc.next();
        if(col.equals("red")||col.equals("blue")||col.equals("black")||col.equals("white"))
        {
             System.out.println("These are your searched products");
        }
         else
         {
             System.out.println("Sorry!,Your searched product is not available😔");
         }
          
    }
    void dailyWear()
    {
        System.out.println("Enter size do you want:");
        int size=sc.nextInt();
        System.out.println("Enter the cost you like:");
        int cost=sc.nextInt();
        System.out.println("Enter the Colour do you like:");
        String col=sc.next();
        if(col.equals("red")||col.equals("blue")||col.equals("black")||col.equals("white"))
        {
             System.out.println("These are your searched products");
        }
         else
         {
             System.out.println("Sorry!,Your searched product is not available😔");
         }
           
    }
    void weddingWear()
    {
        System.out.println("Enter size do you want:");
        int size=sc.nextInt();
        System.out.println("Enter the cost you like:");
        int cost=sc.nextInt();
        System.out.println("Enter the Colour do you like:");
        String col=sc.next();
        if(col.equals("red")||col.equals("blue")||col.equals("black")||col.equals("white"))
        {
             System.out.println("These are your searched products");
        }
         else
         {
             System.out.println("Sorry!,Your searched product is not available😔");
         }
         
    }
}
public class  Console_Based_Project
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("################## PANDAS MEN'S SHOPPING MALL#############");
       int ch;
       Customer cus=new Customer();
       cus.search();
       do{
           System.out.println("Main Menu\n1.FancyWear\n2.TraditionalWear\n3.DailyWear\n4.WeddingWear\n5.Exit");
           System.out.println("Enter your valid option:");
           ch=sc.nextInt();
           switch(ch)
           {
               case 1:
                   cus.fancyWear();
                   break;
               case 2:
                   cus.traditionalWear();
                   break;
                case 3:
                    cus.dailyWear();
                    break;
                case 4:
                    cus.weddingWear();
                    break;
                case 5:
                    System.out.println("####THANK YOU FOR SHOPPING####");
           }
           
       }while(ch!=5);
    }
}
