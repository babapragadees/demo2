import java.util.*;
class totalandaverage
{
public static void main(String[]args)
{
System.out.println("enter input rollno");
Scanner sc=new Scanner(System.in);
double rollno=sc.nextDouble();
System.out.println("enter input name");
String name=sc.next();
System.out.println("enter input tamil");
double t=sc.nextDouble();
System.out.println("enter input english");
double e=sc.nextDouble();
System.out.println("enter input maths");
double m=sc.nextDouble();
double tm=t+e+m;
System.out.println("rollno:"+rollno);
System.out.println("name:"+name);
System.out.println("total mark"+tm);
double avg=tm/3;
System.out.println("average mark"+avg);
}

}