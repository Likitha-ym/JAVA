package mypack;
import java.util.Scanner;
class Marksheet
{
String usn;
String sname;
char grade;
double m1,m2,m3;
double total;

public Marksheet()
{
usn="1BY22MC026";
sname="Likitha";
grade='A';
m1=m2=m3=101;
total=303;
}
}
class MarkCal
{
public static void main(String[] args)
{
Marksheet krithi = new Marksheet();
System.out.println(krithi);
}