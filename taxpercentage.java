import java.util.*;
class taxpercentage
{
public static void main(String[]args)
{
System.out.println("enter input total amount");
Scanner sc=new Scanner(System.in);
int total=sc.nextInt();
System.out.println("enter input tax amount");
int tax=5;
int y=total/100*5;
int ta=total-y;
System.out.println("enter the o/p"+y);
}



}