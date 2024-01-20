//1a
/*
import java.util.Scanner;
public class HW_1 {
    public static void main(String arg[]){
        Scanner myscan = new Scanner(System.in);
        int n1 = myscan.nextInt(),n2 = myscan.nextInt();
        int sum = n2+n1;
        System.out.println("sum of num: " +sum);
        System.out.println("multiply of num: " +n1*n2);
        System.out.println("division of num: " +n1/n2);
        System.out.println("division of num: " +n1%n2);
    }
}
*/

//1b
/*
import java.util.Scanner;
public class HW_1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n1= scan.nextInt(), n2= scan.nextInt(), n3 = scan.nextInt();
        int sum = n1+n2+n3;
        System.out.println("sum of nums:" + sum);
        System.out.println("multiply of num: " +n1*n2*n3);
        System.out.println("division of num: " +(n1/n2)/n3);
        System.out.println("division of num: " +n1%n2%n3);
    }
}
*/

//1c
/*
import java.util.Scanner;
public class HW_1{
    public static void main(String args []){
        Scanner myscan = new Scanner (System.in);
        int n1 = myscan.nextInt();
        float f2 = myscan.nextFloat();
        float sum = n1+f2;
        System.out.println("sum of nums: "+sum);
        System.out.println("multiply of num: " +n1*f2);
        System.out.println("division of num: " +n1/f2);
        System.out.println("division of num: " +n1%f2);

    }

}


//2
/*
import java.util.Scanner;
public class HW_1 {
public static void main(String args[]) {
    int i,n,c=0;
    Scanner myscan = new Scanner(System.in);
    n=myscan.nextInt();
    for(i=1;i<=n;i++) {
        if(n%i==0)
            c++;
    }
    if(c==2)
        System.out.println("Prime");
    else
        System.out.println("Not prime");
}}
 */

//3
/*
import java.util.Scanner;
public class HW_1 {
    public static void main(String args []){
        Scanner myscan= new Scanner(System.in);
        System.out.println("Enter A:");
        int A,B,temp;
        A = myscan.nextInt();
        System.out.println("Enter B:");
        B = myscan.nextInt();
        temp = A;
        A = B;
        B = temp;
        System.out.println("Value of A: " + A);
        System.out.println("Value of B: " + B);
    }
}
 */

//4
/*
import java.util.Scanner;
public class HW_1 {
    public static void main(String args []){
        Scanner myscan =new Scanner(System.in);
        int x, m;
        long fact;
        fact=1;
        x = myscan.nextInt();
        for (m=1;m<=x;m++){
            fact=fact*m;
        }
        System.out.println("factoral of "+x+" is: "+ fact);
    }
}
*/

//5
/*
import java.util.Scanner;
public class HW_1{
    public static void main(String args []){
        Scanner myscan = new Scanner(System.in);
        System.out.println("Enter temp in F: ");
        float F =myscan.nextFloat();
        float C = (F-32)*5/9;
        System.out.println("Temp in C is:"+C);
    }
}
 */

//6
/*
import java.util.Scanner;
public class HW_1 {
    public static void main(String arug[]){
        Scanner myscan= new Scanner(System.in);
        System.out.println("Enter the number (n): ");
        int n = myscan.nextInt();
        if (n%2==0){
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

    }
}
 */

//7
/*
import java.util.Scanner;
public class HW_1{
    public static void main(String args []) {
        Scanner myscan = new Scanner(System.in);
        int n1, n2, n3,mx;
        System.out.println("Enter n1: ");
        n1 = myscan.nextInt();
        System.out.println("Enter n2: ");
        n2 = myscan.nextInt();
        System.out.println("Enter n3: ");
        n3 = myscan.nextInt();
        mx = Math.max(n1,n2);
        mx = Math.max(mx,n3); // Math.max(Math.max(n1,n2), n3)
        System.out.println("MAX of all 3 numbers: "+ mx);
    }
}
 */

//8
/*
import java.util.Scanner;
public class HW_1{
    public static void main(String args []){
        Scanner myscan =new Scanner(System.in);
        System.out.println("Enter initial principal balance (p): ");
        float p= myscan.nextFloat();
        System.out.println("Enter annual interest rate (r): ");
        float r= myscan.nextFloat();
        System.out.println("Enter time in years (t): ");
        float t= myscan.nextFloat();
        float a = p*(1+(t*r/100));
        System.out.println("Final amount: "+ a);
    }
}

 */

//9
/*
import java.util.Scanner;
public class HW_1 {
    public static void main(String args[]){
        Scanner myscan= new Scanner(System.in);
        System.out.println("Enter length (l):");
        int l = myscan.nextInt();
        System.out.println("Enter breath (b):");
        int b = myscan.nextInt();
        int A = l*b;
        System.out.println("Area of rectangle(A): "+ A);
    }
}
 */

