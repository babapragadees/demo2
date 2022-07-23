import java.util.*;
class compoundinterest
{
public static void main(String[]args)
{
System.out.println("enter input value pricipal balance");
Scanner sc=new Scanner(System.in);
double p=sc.nextDouble();
System.out.println("enter input value in interest rate");
double r=sc.nextDouble();
System.out.println("enter input value t");
double t=sc.nextDouble();
System.out.println("enter input value number of tym periods");
double n=sc.nextDouble();
double k=r/100;
double w=k/n;
double g=1+w;
double a=n*t;
double m=Math.pow(g,a);
double ci=(p*m);
System.out.println("enter the o/p value compound interest"+ci);
}




}