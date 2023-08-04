//Write a java program to demonstrate exception handling
import java.util.Scanner;
class DemoExce
{
double a[][] = new double[3][3];
Scanner sc = new Scanner(System.in);
public DemoExce()
{
}
public void acceptValues()
{
System.out.println("Enter 3 X 3 values ");
for(int i=0; i<3; i++)
for(int j=0; j<3; j++)
{
a[i][j]=sc.nextDouble();
}
}
public void sumOfAllValues()
{
System.out.println("Sum of all values of this 2D array is:\n ");
double sum=0.0;
try{
for(int i=0; i<3; i++)
for(int j=0; j<4; j++)
{
sum=sum+a[i][j];
}
} catch(ArrayIndexOutOfBoundsException e)
{
e.printStackTrace();
}
finally
{
System.out.println("Sum="+sum);
}
}
}
class Prg4
{
public static void main(String[] args)
{
DemoExce d2 = new DemoExce();
d2.acceptValues();
d2.sumOfAllValues();
}
}