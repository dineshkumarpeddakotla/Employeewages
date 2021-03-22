package employeewages;
import java.util.Random;
class Employeewages{
public static void main(String[] args){
System.out.println("Welcome to Employee");
int Present=1;
int Wage_per_hr=20;
int Full_Day_hrs=8;
int Part_Time_hrs=4;
int empcheck=((int)(Math.random()*2)+0);
if(empcheck == Present){
System.out.println("Employee is Present");
int Daily_Employee_Wage = (Wage_per_hr*Full_Day_hrs);
int Part_time_Employee_wage = (Wage_per_hr*Part_Time_hrs);
System.out.println("Employee daily wage =" +Daily_Employee_Wage);
System.out.println("Part time Employee wage =" +Part_time_Employee_wage);
}else{
System.out.println("Employee is Absent");
  }
 }
}
