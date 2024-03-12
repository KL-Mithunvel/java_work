public class virtuallab{
String mess;
    public static void main(String[] args) {
        sub1 Aobj= new sub1();
        Aobj.message();
        sub2 Bobj =new sub2();
        Bobj.message();
    }}
class parent{
public static void message(){
        System.out.println("This is Parent class");
    }}

 class sub1 extends parent{
public static void message(){
    System.out.println("This is first subclass");
}}
class sub2 extends parent{
public static void message(){
    System.out.println("This is second subclass");
}}

/*
public class virtuallab {
    int bank_balance;
    public static void main(String arr []){
            virtuallab BankA = new virtuallab();
            virtuallab BankB = new virtuallab();
            virtuallab BankC = new virtuallab();
            getBalance(BankA,BankB,BankC);

    }
    public static void getBalance(virtuallab b1,virtuallab b2,virtuallab b3){
        int mon[]= {100000,150000,200000};
        b1.bank_balance=mon[0];
        b2.bank_balance=mon[1];
        b3.bank_balance=mon[2];


    }
}*/

/*
public class virtuallab {
    public static void main(String[] args) {
        studW3 st1=new studW3();
        studW4 st2 = new studW4();
        st1.cal();
        st2.cal();

    }static public void persentage(int m1,int m2,int m3){
        double avg = (m1+m2+m3)/3;
        System.out.println("stud 1 avg is "+avg);
    }
    static public void persentage(int m1,int m2,int m3,int m4){
        double avg = (m1+m2+m3+m4)/4;
        System.out.println("stud 2 avg is "+avg);
    }

}
class studW3 extends virtuallab{

    public void cal(){
        int marks[]={79,89,99,};
        persentage(marks[0],marks[1],marks[2] );}
}
class studW4 extends virtuallab{
    public void cal(){
        int marks[]={79,89,99,60};
        persentage(marks[0],marks[1],marks[2],marks[3] );}
}*/