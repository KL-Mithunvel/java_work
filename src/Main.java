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
        String txtMon=nameOfmon(mon);
        if (txtMon=="") {System.out.println("Invalid Input");return;}
        days = calcNoDays(mon,year);
        System.out.println(txtMon+" "+year+" has "+days+" days");

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
        if ((mon>12)||(mon<1)){return "";}

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


}
*/



/*import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner myscan =new Scanner(System.in);
        int sw[][]=new int[2][2];
        for (int i=0;i<=2;i++){
            for (int j = 0; j <= 2; j++) {
            sw[i][j]=myscan.nextInt();}
        }
    }
    public static String klm(String abc){
        return abc;
    }
    public static int add (int a,int b){
        return a+b;
    }
}
*/
/*
import java.util.Scanner;
public class Main {
    public static void main (String arr []){
        int k=3,sbi=0;
        Scanner myscan = new Scanner (System.in);
        String peo [][]=new String[3][4];
        String plis[]=new String [3];
        String uslis []=new String[3];
        for(int i=0;i<3;i++){
            peo[i][0]=myscan.nextLine();
            if (peo[i][0].length()!=5){
                System.out.println("Invalid Account Number");
            }else{
                for (int j =1;j<4;j++){
                    peo[i][j]=myscan.nextLine();
                }if (peo[i][0].length()!=5){System.out.println("invalid input");}
                else{plis[i]=pass(peo[i]);
                    uslis[i]=user(peo[i]);}
            }}for (int i=0;i<3;i++){
            System.out.println(uslis[i]);
            System.out.println(plis[i]);
        }for (int i=0;i<3;i++){
            if(plis[i].charAt(0)=='S'){sbi=sbi+1;

            }
        }System.out.println("INDIAN BANK:"+(k-sbi));
        System.out.println("STATE BANK:"+sbi);

    }
    public static String user(String arr []){
        String usid="";
        if (arr[0].charAt(0)=='2'){
            usid="IND"+usid;
        }else{usid="STA";}
        usid=usid+arr[0].substring(2,5);
        usid=usid+arr[2].substring(arr[2].length()-2,arr[2].length()).toUpperCase();
        return usid;
    }
    public static String pass(String arr[]){
        String pass="";
        if (arr[0].charAt(0)=='2'){
            pass="INB"+pass;
        }else{pass="STB"+pass;}
        pass=pass+arr[1].substring(3,7);
        if(arr[3].charAt(0)=='F'){
            pass=pass+"FE";
        }else {pass=pass+"MA";}
        return pass;}
}*/
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //int mark=sc.nextLin.e();
    }
}
*/
/*
public class Main{
    public static void main (String [] argdd){
        person sanju =new person("sanju",12,"white");

        System.out.println(sanju.age);
        person mirfaq=new person("mirfu",17,"white");
        sanju.sleep();
        mirfaq.message("man");
        student mithun = new student("mithun",20,"white","23bmh1029");
        mithun.message();


    }
}class person{
    String name;
    int age;
    String col;
    public person(String na,int ag, String skin){
        age=ag;
        col=skin;
        name=na;
    }
    public void sleep(){
        System.out.println("zzzz");
    }
    public void message(String gender){
        System.out.println("hi i am "+name+" and iam "+gender);
    }
}

class student extends person{
    String name;
    int age;
    String col;
    String regno;


    public student(String na, int ag, String skin,String reg) {
        super(na, ag, skin);
        name=na;
        age=ag;
        col=skin;
        regno = reg;
    }
    public void message(){
        System.out.println("hi iam " + name +" my registration number is "+regno);
    }
}*/

/* In a Chemical factory there are workers like Part-time workers and Full-Time workers. Every worker has a name,
designation,no.of hours worked and salary . Design a method that computes the weekly pay for every worker. A Part-Time
worker gets paid the hourly wage for the actual number of hours worked, if hours is at most 35. If the hourly worker worked
 more than 35 hours, the excess is paid at time and a half. The Full-Time worker gets paid the hourly wage for 40 hours, no
 matter what the actual number of hours is. Design a method that compute the total pay of any worker. Supply a Java Multilevel
 hierarchy inheritance program that executes these classes and methods.
 */

/*
public class Main{
public static void main(String[] args) {

    full_W tony =new full_W("tony","manager",40,100);
    part_W mike =new part_W("mike","driver",30,50);
    part_W henry=new part_W("henry","tester",40,60);
    tony.calc_inc();
    mike.calc_inc();
    henry.calc_inc();
    System.out.println(tony.income);
    System.out.println(mike.income);
    System.out.println(henry.income);
}}
abstract class workers{
    String name;
    String designation;
    int num_hrs;
    int salary;
    public workers (String na,String desig,int hrs,int sal){
        name = na;
    designation = desig;
    num_hrs= hrs;
    salary = sal;}

}
class part_W extends workers{
    int  income;
    public part_W(String na,String desig,int hrs,int sal){
        super(na,desig,hrs,sal);

    }
    public void calc_inc(){
        if(num_hrs<=35){
            income=(num_hrs*salary);

        }
        else{
            int n = salary+salary/2;

            income=(num_hrs*n);
        }
    }

}


class full_W extends workers{
    int  income;
    public full_W(String na,String desig,int hrs,int sal){
        super(na,desig,hrs,sal);

    }
    public void calc_inc(){
        income= salary * 40;

    }

}*/
/*Create a class called “HotelRoom” that includes an integer field for the room number and a double field for the nightly rental rate.
 Include get methods for these fields and a constructor that requires an integer argument representing the room number. The constructor
 sets the room rate based on the room number; rooms numbered 100 and below are Rs 500 per night, others are Rs.800 per night.
Create an extended class name Suite whose constructor requires a room number and adds a Rs 400 surcharge to the regular hotel room rate
based on the room number. Write a program to demonstrate creating and using an object of each class.
*/
/*
public class Main {
    public static void main(String[] args) {
        HotelRoom room_500=new HotelRoom(500);
        HotelRoom room_30=new HotelRoom(30);
        suite s_480= new suite(480);
        suite s_45= new suite(45);
        System.out.println("Room no: " + room_500.getRoomNo() + " Rate: " + room_500.getPrice());;
        System.out.println("Room no: " + room_30.getRoomNo() + " Rate: " + room_30.getPrice());;
        System.out.println("Room no: " + s_45.getRoomNo() + " Rate: " + s_45.getPrice());;
        System.out.println("Room no: " + s_480.getRoomNo() + " Rate: " + s_480.getPrice());;
    }
}

class HotelRoom{
    int room_no;
    double price;
    public HotelRoom(int r){
        room_no=r;
        if (room_no<=100){
            price=500;
        }
        else {
            price=800;
        }
    }
    public int getRoomNo(){
        return room_no;
    }
    public double getPrice(){
        return price;
    }
}

class suite extends HotelRoom{
    public suite (int r){
        super(r);
        price = price + 400;
    }
}
*/

public class Main {
    public static void main(String[] args) {

    }
}

interface room{

    public void calc_area();
    public void calc_circ();
}
class s_room implements room{
    double side;
    double area;
    double circumference;
    public s_room(double s){
        side=s;
    }
    public void calc_area(){
        area= side*side;
    }
    public void calc_circ(){
        circumference= side*4;
    }
}
class r_room implements room{
    double length;
    double breath;
    double area;
    double circumference;
    public r_room(double l,double b){
        length=l;
        breath=b;
    }
    public void calc_area(){
        area = length *breath;
    }
    public void calc_circ(){
        circumference=(2*length)+(2*breath);
    }
}


/*Create a class named Computer that contains data fields for processor model (for example, i3) and clock speed in
gigahertz (for example, 3.4). Inclue a get method for each field and a constructor that requires a parameter for each field.
Create a subclass named MultiMediaComputer that contains an additional integer field for the CD-ROM speed. The multimedia
 class also contains a get method for the new data field and a constructor that requires arguments for each of the three fields.
Write a JAVA program to demonstrate creating and using an object of each class.

*/