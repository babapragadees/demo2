import java.util.*;
class acres
{
public static void main(String[]args)
{
System.out.println("enter input length");
Scanner sc=new Scanner(System.in);
double l=sc.nextDouble();
System.out.println("enter input width");
double w=sc.nextDouble();
double acres=l*w;
System.out.println("enter the input length is"+acres);
//(1acre=43,560sq.ft)
System.out.println("enter input feet value");
double c=sc.nextDouble();
double d=(acres/43560);
System.out.println("enter the o/p value d:"+d);




}

}