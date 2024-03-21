package Operations;
interface AssaignmentOperators{
    public int add(int a,int b);
    public int  sub(int a,int b);
    public int mul(int a,int b);
    public int dev(int a,int b);

}
public class  IntArithmeticOperators {
    public int add(int a,int b){
        return a+b;}
    public int  sub(int a,int b){
        return a-b;}
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        if (b==0){
            System.out.println("Cant divide by 0");
            return -1;
        }else {
        return a/b;}
    }
    public int mod(int a,int b){
        return a%b;

    }
     }