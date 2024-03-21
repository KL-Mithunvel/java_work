package Operations;
interface BoolLogicalOperators{
    public boolean Not(boolean a);
    public boolean Or(boolean a,boolean b);
    public boolean And(boolean a,boolean b);

}
public class LogicalOperators implements BoolLogicalOperators{
    public boolean And(boolean a,boolean b){
        return a&&b;
    }public boolean Or(boolean a,boolean b){
        return a||b;
    }
    public boolean Not(boolean a){
        return !a;
    }
}
