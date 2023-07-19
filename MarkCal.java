import java.util.Scanner;
class Marksheet
{
private String usn;
String sname;
protected char grade;
protected double m1,m2,m3;
public double total;

//Default Constructor
public Marksheet()
{
}

//Parameterized constructor
public Marksheet(String usn, String sname, char grade, double m1, double m2, double m3,double total)
{
this.usn=usn;
this.sname=sname;
this.grade=grade;
this.m1=m1;
this.m2=m2;
this.m3=m3;
this.total=total;
}

//getter and setter methods
public String getUSN()
{
return this.usn;
}
public void setUSN(String usn)
{
this.usn=usn;
}

//Method
public void display()
{
System.out.println("USN:"+usn);
System.out.println("NAME:"+sname);
System.out.println("GRADE:"+grade);
System.out.println("M1:"+m1+",M2:"+m2+",M3:"+m3);
System.out.println("Total:"+(m1+m2+m3));
}
public void display(char msg)
{
System.out.println("Grade of the Student:"+msg);
}
}
class MarkCal
{
public static void main(String[] args)
{
Marksheet krithi = new Marksheet();
System.out.println("Default Constructor Called\n\n");
krithi.display();
Marksheet atharv = new Marksheet("1BY23MC021","aaaa",'W',1,2,3,6);
atharv.display();
Marksheet nani=new Marksheet();
nani.setUSN("1BY20MC030");
nani.sname="HERO";
nani.grade='O';
nani.m1=nani.m2=nani.m3=90;
nani.total=nani.m1+nani.m2+nani.m3;
nani.display();
nani.display('O');
nani.getUSN();
}
}