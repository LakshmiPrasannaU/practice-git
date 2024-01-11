import java.util.Scanner;
interface I1{
public int getSum(int a,int b);
public int getProduct(int a,int b);
}
class  Calci implements I1{
public int getSum(int a,int b);
{
return a+b;

}
public int getProduct(int a,int b);
{
return a*b;

}
}
class CalciDriver
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Calci c=new Calci();
System.out.println("Enter 1st number");
int n1=s.nextInt();
System.out.println("Enter 2st number");
int n2=s.nextInt();
System.out.println(n1+"+"+n2+c.getSum(n1,n2));
System.out.println(n1+"-"+n2+c.getProduct(n1,n2));
}
}

