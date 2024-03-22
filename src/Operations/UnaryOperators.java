package Operations;
interface var_UnaryOperato{
    public void pls1(int a);
    public void les1(int a);
    public int pos_a(int a);
    public int neg_a(int a);
    public boolean notof(int a,int b);
}
public class UnaryOperators implements var_UnaryOperato{
    public void pls1(int a){
        a++;
    }
    public void les1(int a){
        a--;
    }
    public int pos_a(int a){
        return +a;

    }
    public int neg_a(int a){
        return -a;

    }
    public boolean notof(int a,int b){
        return !(a>b);
    }
}
