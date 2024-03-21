/*EXAM PAT3
Imagine you're asked with creating a simple Java program for managing a LMS. Your program should have a Book class
representing books in the library. Each book has attributes such as title, author, ISBN, and yearPublished.

REQUIREMENTS::

Define a Book class with private instance variables for title, author, ISBN, and yearPublished.
Implement a constructor that initializes all these instance variables.
Provide a default constructor that sets default values for title, author, ISBN, and yearPublished in case no values
 are provided during object creation.
Implement getdata and displaydata methods for all instance variables.
 */


import java.time.Year;
import java.util.Scanner;
public class pat3 {
    public static void main(String[] args) {
        Scanner myscan =new  Scanner(System.in);
        String b_nam= myscan.nextLine();
        String b_tit= myscan.nextLine();
        String b_num= myscan.nextLine();
        String b_date= myscan.nextLine();
        Book text=new Book(b_nam,b_tit,b_num,b_date);
        text.Disply();


    }
}
class Book{
    String name;
    String title;
    String ISBN;
    String year;
    public Book(String na, String tit,String num, String ye){
        name=na;
        title=tit;
        ISBN=num;
        year=ye;}
    public Book()
    {
        this("klm","klkm","ojkj","jkbhkh");
    }
    public void Disply(){
        System.out.println(this.name);
        System.out.println(this.title);
        System.out.println(this.ISBN);
        System.out.println(this.year);
    }


}