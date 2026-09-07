import java.util.Scanner;
class BMI
{
static String[][] calculateBMI(double[][] data)
{
String[][] result=new String[10][4];
for(int i=0;i<10;i++)
{
double weight=data[i][0];
double heightMeter=data[i][1]/100.0;
double bmi=weight/(heightMeter*heightMeter);
String status="";
if(bmi<=18.4)
status="Underweight";
else if(bmi<=24.9)
status="Normal";
else if(bmi<=39.9)
status="Overweight";
else 
status="Obese";
result[i][0]=String.valueOf(data[i][1]);
result[i][1]=String.valueOf(weight);
result[i][2]=String.format("%.2f",bmi);
result[i][3]=status;
}
return result;
}
static void display(String[][] arr)
{
System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
for(int i=0;i<10;i++)
{
for(int j=0;j<4;j++)
{
System.out.print(arr[i][j]+"\t\t");
}
System.out.println();
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double[][] data=new double[10][2];
for(int i=0;i<10;i++)
{
System.out.println("Person "+(i+1));
System.out.print("Enter Weight (kg): ");
data[i][0]=sc.nextDouble();
System.out.print("Enter Height (cm): ");
data[i][1]=sc.nextDouble();
}
String[][] result=calculateBMI(data);
display(result);
}
}


