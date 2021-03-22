package employeewages;
import java.util.Random;
class Employeewages{
public static void main(String[] args){
System.out.println("Welcome to Employee");
int Present=1;
int Wage_per_hr=20;
int Full_Day_hrs=8;
int Part_Time_hrs=4;
int WorkingDaysInMonth=20;
int WorkingDays=0;
int Monthly_Employee_Wage=0;
int Monthly_Part_Employee_Wage=0;
int empcheck=((int)(Math.random()*2)+0);
int checkfullpart=((int)(Math.random()*2)+0);
switch(empcheck){
case 1:
System.out.println("Employee is Present");
switch(checkfullpart){
case 0:
for(int i=WorkingDays;i<=WorkingDaysInMonth;i++){
int Daily_Employee_Wage = (Wage_per_hr*Full_Day_hrs);
Monthly_Employee_Wage = (Daily_Employee_Wage*i ); 
}
System.out.println("Employee daily wage =" +Monthly_Employee_Wage);

System.out.println();
break;
case 1:
for(int i=WorkingDays;i<=WorkingDaysInMonth;i++){
int Part_time_Employee_wage = (Wage_per_hr*Part_Time_hrs);
Monthly_Part_Employee_Wage = (Part_time_Employee_wage*i);
}
System.out.println("Part time Employee wage =" +Monthly_Part_Employee_Wage);

System.out.println();
break;
default:System.out.println("Invalid");
}
break;
case 0:
System.out.println("Employee is Absent");
break;
default:System.out.println("Invalid");
  }
 }
}
