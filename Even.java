# Even
import java.io.*;
import java.util.*;
public class Even
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1,n2;
System.out.println("Enter the starting limit");
n1=sc.nextInt();
System.out.println("Enter the ending limit");
n2=sc.nextInt();
if(n%2==0)
{
System.out.println("print even numbers between n1 &n2");
}
else
{
System.out.println("print n1 to n2");
}
}
}
