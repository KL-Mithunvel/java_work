/*
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Character;
public class ips {
    public static void main(String arr[]){
        Scanner myscan=new Scanner(System.in);
        int c=0;
        int dig[]= new int [10];
        String inp= myscan.nextLine();
        int len = inp.length();
        boolean t = true;
        if (len<9){System.out.println("Can't Generate ISBN");
            t=false;
        }
        else{
            for (int i = 0; i < 9; i++) {
                dig[i]=Character.getNumericValue(inp.charAt(i));

                for (int j = 1; j < 9; j++) {
                    c=c+j*dig[i];}
            }}

        if(t){c=c%11;
            if(c==0){System.out.println(inp+"X");}
            else{
                System.out.println(inp+c);}

        }



    }}
*/
import java.util.Scanner;
import java.lang.*;
public class Main {
    public static void main(String arr []){
        Scanner myscan=new Scanner(System.in);
        String lis []=new String[5];
        int c=0,diff=0;
        for (int i = 0; i < 2; i++) {
            lis[i]= myscan.nextLine();
        }
        int uni[]=new int[2];
        for (int i =0 ; i < 2; i++) {
            uni[i]=myscan.nextInt();
            if(uni[i]>0){
                c=c+1;}else {System.out.println("Invalid Units");
                break;}
        }diff=uni[1]-uni[0];
        if (c == 2) {
            for(int i=0;i<2;i++){System.out.println(lis[i]);}
            for(int i=0;i<2;i++){System.out.println(uni[i]);}
            System.out.println(diff);
            if (diff <500) {
                if(diff<=100){System.out.println(String.format("%.2f",diff*1.25));}
                else if((diff>101)&&(diff>200)){System.out.println(String.format("%.2f",diff*2.25));}
                else if((diff>201)&&(diff>400)){System.out.println(String.format("%.2f",diff*4.5));
                }else if((diff>401)&&(diff>500)){System.out.println(String.format("%.2f",diff*6));}
            } else if (diff>500) {
                if((diff>101)&&(diff>400)){System.out.println(String.format("%.2f",diff*4.5));}
                else if((diff>401)&&(diff>500)){System.out.println(String.format("%.2f",diff*6));
                }else if((diff>501)&&(diff>600)){System.out.println(String.format("%.2f",diff*8));}
            }else {System.out.println(String.format("%.2f",diff*9));}
        }
}}