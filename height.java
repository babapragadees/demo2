import java.util.*;
class height
{
public static void main(String[]args)
{
System.out.println("enter input height cm");
Scanner sc=new Scanner(System.in);
double personheight=sc.nextDouble();
System.out.println("enter input feet");
double f=personheight/30.48;
System.out.println("Your o/p feet"+f);
double inch=personheight/2.54;
System.out.println("Your o/p inches"+inch);

}

}