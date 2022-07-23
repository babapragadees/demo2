import java.util.*;
class swap3
{
public static void main(String[]args)
{
System.out.println("enter input value a");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("enter input value b");
int b=sc.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println("enter the swap without variable a:"+a);
System.out.println("enter the swap without variable b:"+b);


}



}