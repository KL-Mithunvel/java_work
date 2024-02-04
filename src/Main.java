/*class samp
{
    public static void main(String[] args) {
        System.out.println("HAPPY NEW YEAR 2024!!!");
    }
}*/
/*class Student{
    int rollno; String name,course;
    float fee;
    Student(int rollno,String name,String course){
        this.rollno=rollno; this.name=name;
        this.course=course;
    }
    Student(int rollno,String name,String course,float fee){
        this(rollno,name,course); //reusing constructor
        this.fee=fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
}
class Main{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit","java");
        Student s2=new Student(112,"sumit","java",6000f);
        s1.display(); s2.display();
    }
}*/
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int mon = myscan.nextInt();
        int days=0;
        int year = myscan.nextInt();
        if ((mon>=1) &&(mon <12)) {
            days = calcNoDays(mon,year);
            System.out.println(nameOfmon(mon)+" "+year+" has "+days+" days");
        }else {System.out.println("Invalid Input");}
    }


    public static Boolean islmon(int mon){
        int lmon[]= {1,3,5,7,8,10,12};
        for (int i = 0; i < lmon.length; i++) {
            if (mon==lmon[i]){
                return true;
            }
        } return false;

    }
    public static Boolean isleap(int yr){
        if (yr %4==0) {
            if (yr%100==0){
                if (yr%400==0){return true;}
                else{return false;}
            }else {return false;}
        }else {return false;}
    }
    public static int calcNoDays(int mon,int year){
        if (islmon(mon)){
            return 31;
        } else if (mon==2) {
            if(isleap(year)){return 28;
            }else return 29;
        } else {return 30;}

        }
    public static String nameOfmon(int mon){
        String m[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String s= m[mon-1];
        return s;
    }
    public static void main_test(String arr []){
        int i[] ={400,405,500,25,2024};
        Boolean r[]= {true,false,false,false,false};
        for (int j = 0; j < i.length; j++) {

            if (isleap(i[j])!=r[j]){
                System.out.println("error "+i[j]);}}
    }


}*/
