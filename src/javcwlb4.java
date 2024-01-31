//1
/*
import java.util.Scanner;
public class javcwlb4 {
    public static void main(String[] args) {
        Scanner myscan=new Scanner(System.in);
        int n= myscan.nextInt(),i,j;
        String odd ="",eve="";
        String arr[]=new String[n];
        for (i=0;i<n;i++){
            arr[i]= myscan.nextLine();

        }
        for (i=0;i<n;i++){
            for (j=0;j<arr[i].length();j++){
                if (arr[i].charAt(j)%2==0){
                    eve=eve+arr[i].charAt(j);
                }else {odd=odd+arr[i].charAt(j);}
            }
        }
        System.out.println("First number: "+odd);
        System.out.println("Second number: "+eve);
    }
}
*/
//2
/*
import java.util.Scanner;
public class javcwlb4 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int n1= myscan.nextInt(),n2=myscan.nextInt(),i;
        Double arr1[]= new Double[n1],arr2[]=new Double[n2];
        for ( i = 0; i < n1; i++) {
            arr1[i]=myscan.nextDouble();
        }
        for (int j = 0; j < n2; j++) {
            Double qus= myscan.nextDouble();
            boolean flag= false;
            for (int k = 0; k < n1; k++) {
                if (arr1[k]==qus){
                    flag=true;


                    }
                }
            }
        }

    }

*/

//3
/*
import java.util.Scanner;
public class javcwlb4{
    public static void main(String[] args) {
        Scanner myscan=new Scanner(System.in);
        int row= myscan.nextInt(),col= myscan.nextInt(),i,j;
        int mat[] []=new int[row] [col];
        int hmat[] []=new int[row] [col];
        int vmat[] []=new int[row] [col];
        int dmat[] []=new int[row] [col];
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                mat[i][j]=myscan.nextInt();
            }
        }
        System.out.println("given matrx");
        printmat(mat);

        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                hmat[i][col-1-j]=mat[i][j];
            }
        }
        System.out.println("Horizontal matrx");
        printmat(hmat);
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                vmat[row-1-i][j]=mat[i][j];
            }
        }
        System.out.println("Vertical matrx");
        printmat(vmat);

        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                dmat[i][j]=hmat[i][j]-vmat[i][j];
            }}
        System.out.println("diff");
        printmat(dmat);

    }


    static void printmat(int matx[][]){
        int i,j;
        for (i=0;i<matx.length;i++){
            for (j=0;j<matx[i].length;j++){
                System.out.print(matx[i][j]+" ");
            }System.out.println("");
        }

    }
}
*/