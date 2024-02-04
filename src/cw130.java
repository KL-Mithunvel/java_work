//1
/*
import java.util.Scanner;
public class cw130 {
    public static void main(String[] args) {
        String city[] = new String[5];
        int temp[][]=new int[5][3];
        int max,min,maxi=0,mini=0;
        Scanner myscan= new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.print("city name");
            city[i] = myscan.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("tem");
                temp[i][j]= myscan.nextInt();
            }
        }
        for (int i=0;i<5;i++){
            max=temp[i][1];
            min=temp[i][1];
            for (int j = 0; j < 3; j++) {
                if (max <temp[i][j]){
                    max=temp[i][j];
                    maxi=j+1;
                }
                if (min>temp[i][j]){
                    min=temp[i][j];
                    mini=j+1;
                }

            }
            System.out.println(city[i]+"'s maximum temp is: "+max +"C° on "+ maxi +"th day");
            System.out.println(city[i]+"'s minimum temp is: "+min +"C° on "+ mini +"th day");

        }

    }
}
*/
//2
/*
import java.util.Scanner;
public class cw130 {
    public static void main(String[] args) {
        int mark[]=


    }
}*/

/*
 public class cw130 {
    public static void mult(int a, int b){
        System.out.println(a*b);
    }
    public static int mult1(int a,int b,int c){
        return (a*b*c);
    }

    public static void main(String arr[]) {
        mult(3,4);
        int S= mult1( 3, 6,4);
        System.out.println(S);

    }

}
*/
/*Students from an Indian education background will find the International GPA grading system used by schools abroad
different from what they are used to. This is because Indian schools grade academic performance through a 10-point GPA
 system. In the 10-point GPA system, marks are converted to a percentage which is then assigned to a category as below:

Grade-S, Above 9 CGPA.
Grade-A, which is between 7.5 and 9.
Grade-B, which is between 6 and 7.5;
Grade-C, which is between 5 and 6;
Grade-D, which is between 4 and 5;
Grade-F, Below 5.

As a programmer, Write a Java Application to implement the above given problem.

Input : Read Student_RegdNo, Student_Name, Student_Age,            Student_Marks1, Student_Marks2, Student_Marks3.

Output : Print Student_RegdNo, Student_Name, Student_Age, Student_Marks1, Student_Marks2, Student_Marks3,
 Student_Total, Student_Avg, Student_CGPA, STudent_Grade. (Line by Line)

Note : All the marks for the student is +Ve, Otherwise print "Invalid Marks"*/
/*
import java.util.Scanner;


public class cw130{
public static void main(String[] args) {
Scanner myscan=new Scanner(System.in);
int regno[]=new int[2];
String name[]=new String[2];
int m1[]=new int[2];
int m2[]=new int[2];
int m3[]=new int[2];
int age[]=new int[2];
int sum[]=new int[2];
int avg[]=new int [2];
int gpa[]=new int [2];
String grade []=new String[2];
for (int i = 0; i < 2; i++) {
regno[i] = myscan.nextInt();
name[i] = myscan.next();
age[i]=myscan.nextInt();
m1[i]= myscan.nextInt();
m2[i]= myscan.nextInt();
m3[i]=myscan.nextInt();

if (m1[i]>0 && m2[i]>0&& m3[i]>0) {
System.out.println("valid marks");


}else {System.out.println("Invalid marks");}}
if (m1[1]>0 && m2[1]>0&& m3[1]>0) {
System.out.println("valid marks");
Stud st2 = new Stud();
st2.stud(name[1],regno[1],age[1],m1[1],m2[1],m3[1]);
st2.disply();
}else {System.out.println("Invalid marks");}

        }





 }*/

import java.util.Scanner;


public class cw130{
public static void main(String[] args) {
Scanner myscan=new Scanner(System.in);
int regno[]=new int[2];
String name[]=new String[2];
int m1[]=new int[2];
int m2[]=new int[2];
int m3[]=new int[2];
int age[]=new int[2];
int sum[]=new int[2];
int avg[]=new int [2];
int gpa[]=new int [2];
String grade []=new String[2];
for (int i = 0; i < 2; i++) {
regno[i] = myscan.nextInt();
name[i] = myscan.next();
age[i]=myscan.nextInt();
m1[i]= myscan.nextInt();
m2[i]= myscan.nextInt();
m3[i]=myscan.nextInt();

if (m1[i]>0 && m2[i]>0&& m3[i]>0) {
System.out.println("valid marks");
sum[i]=m1[i]+m2[i]+m3[i];
avg[i]=sum[i]/3;
gpa[i]=avg[i]/10;
    if(gpa[i] <=4){
        grade[i]="F";
    }
    if (gpa[i]>4 && gpa[i]<=5){
        grade[i]="D";
    }
    if (gpa[i]>5 && gpa[i]<=6){
        grade[i]= "C";
    }if (gpa[i]>6 && gpa[i]<=7.5){
        grade[i]="B";
    }if (gpa[i]>7.5 && gpa[i]<=9){
        grade[i]="A";
    }else {
        grade[i]= "S";
    }

}else {System.out.println("Invalid marks");}}
    for (int i = 0; i < 2; i++) {
        System.out.println(regno[i]+" "+name[i]+" "+age[i]+" "+m1[i]+" "+m2[i]+" "+m3[i]+" "+sum[i]+" "+avg[i]+" "+gpa[i]+" "+grade[i]);
    }
        }





 }



