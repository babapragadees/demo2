import java.util.*;
class bmi
{
public static void main(String[]args)
{
System.out.println("enter input weight");
Scanner sc=new Scanner(System.in);
double weight=sc.nextDouble();
System.out.println("enter input height");
double height=sc.nextDouble();
double w=weight/height*height;
System.out.println("your o/p is"+w);
}





}