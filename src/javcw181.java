//1
/*
import java.util.Scanner;
public class javcw181 {
    public static void main(String args []){
        Scanner myscan = new Scanner(System.in);
        String st= myscan.nextLine(),fs="";
        int l= st.length(),i;
        for (i=0;i<l-2;i=i+2){
            fs = fs + st.charAt(i+1) + st.charAt(i);

        }
        if (l%2!=0){
            fs = fs+st.charAt(l-1);
            System.out.println(fs);
        }
        else {
            fs = fs+st.charAt(l-1)+st.charAt(l-2);
            System.out.println(fs);}

    }
}


//2
/*
import java.util.Scanner;
public class javcw181 {
    public static void main(String args []){
        Scanner myscan = new Scanner(System.in);
        String st= myscan.nextLine();
        String rst = "",set="";
        int i,err=0,j;
        for (i=0;i<st.length();i++){
            rst=st.charAt(i)+rst;

        }
        for (j=0;j<st.length();j++) {
            if (rst.charAt(j) != st.charAt(j)) {
                set = rst.charAt(j)+ set;
                err++;

            }
        }




        if (err==2){
            System.out.println(set.charAt(0));
            }
        else if (err>2){
            System.out.println(" Not possible");
        }
        else if(err<2) {System.out.println("palindrone");}

    }
}

*/
//3

import java.util.Scanner;
public class javcw181 {
    public static void main(String[] args) {
        Scanner myscan =new Scanner(System.in);
        int min= 3,n,j;
        String st= myscan.nextLine();
        int l= st.length();
        if (l>min){
            for (n=0;n<l-1;n++){
                String sub=st.substring(n ,n+3);
                System.out.println(sub);
            }

        }}
    }
