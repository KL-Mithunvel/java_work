package Operations;
interface boolComparisionOperator{
    public boolean Equals(int a,int b);
    public boolean NotEquals(int a,int b);
    public boolean great(int a,int b);
    public boolean less(int a,int b);
    public boolean greatEqual(int a,int b);
    public boolean lessEqual(int a,int b);

}
public class ComparisionOperators implements boolComparisionOperator{
    public boolean Equals(int a,int b){
        return (a==b);
    }
    public boolean NotEquals(int a,int b){
        return (a!=b);
    }
    public boolean great(int a,int b){
        return (a<b);
    }
    public boolean less(int a,int b){
        return (a>b);
    }
    public boolean greatEqual(int a,int b){
        return (a<=b);
    }
    public boolean lessEqual(int a,int b){
        return (a>=b);
    }


}
