import java.util.*;
class fahreneit
{
public static void main(String[]args)
{

System.out.println("enter your input celsius");
Scanner sc=new Scanner(System.in);
int c=sc.nextInt();
int k=(c*9/5);
System.out.println("enter your input fahrenheit"+k);
int f=(k+32);
System.out.println("your o/p fahrenheit is:"+f);
}

}