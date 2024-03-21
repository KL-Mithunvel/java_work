package Operations;
abstract class TernaryOperator{
    boolean if_con(int a,int b){
        return (a>b) ? (true):(false);
    }
}

public class TernaryOperators extends TernaryOperator{
    public void disp(int a,int b){
        if (if_con(a,b)){
        System.out.println("a is bigger i think");}
        else {System.out.println("b is bigger i think");}
    }
}
