import java.util.*;
class si
{
public static void main(String[]args)
{
System.out.println("enter input value in principal");
Scanner sc=new Scanner(System.in);
double p=sc.nextDouble();
System.out.println("enter the input value in number of tym peroids");
double n=sc.nextDouble();
System.out.println("enter input value of interest");
double r=sc.nextInt();
double b=r/100;
double si=(p*n*b);
System.out.println("enter the o/p value is simple interest"+si);
}

}