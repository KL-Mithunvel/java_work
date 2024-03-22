package Operations;
public class BitwiseOperators {
    public int bitand(int a,int b){
        return a&b;
    }
    public int bitor(int a,int b){
        return a^b;
    }
    public int bitIor(int a,int b){
        return a|b;
    }
    public int not(int a){
        return ~a;
    }
    public int rho(int a,int b){
        return a<<b;
    }
    public int lho(int a,int b){
        return a>>b;
    }
    public int urho(int a,int b){
        return a >>>b;
    }

}
