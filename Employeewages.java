package employeewages;
import java.util.Random;
class Employeewages{
public static void main(String[] args){
System.out.println("Welcome to Employee");
int Present=1;
int Wage_per_hr=20;
int Full_Day_hrs=8;
int empcheck=((int)(Math.random()*2)+0);
if(empcheck == Present){
System.out.println("Employee is Present");
int Daily_Employee_Wage = (Wage_per_hr*Full_Day_hrs);
System.out.println("Employee daily wage =" +Daily_Employee_Wage);
}else{
System.out.println("Employee is Absent");
  }
 }
}
