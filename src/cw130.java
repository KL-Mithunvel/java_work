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

import java.util.Scanner;
public class cw130 {
    public class Stud(String name,int regno,int m1,int m2,int m3){

        int sregno=regno;
        String sname=name;
        int mar1=m1;
        int mar2=m2;
        int mar3=m3;

        public void avg(){

        }


    }

    public static void main(String[] args) {
        Scanner myscan=new Scanner(System.in);
        int regno[]=new int[2];
        String name[]=new String[2];
        int m1[]=new int[2];
        int m2[]=new int[2];
        int m3[]=new int[2];

        for (int i = 0; i < 2; i++) {
            regno[i] = myscan.nextInt();
            name[i] = myscan.nextLine();
            m1[i]= myscan.nextInt();
            m2[i]= myscan.nextInt();
            m3[i]=myscan.nextInt();
        }
        Stud st1=new Stud(name[0],regno[0],m1[0],m2[0],m3[0]);

        }

        }


    }
}

