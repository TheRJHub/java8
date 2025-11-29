import java.util.function.Supplier;

public class Supplier_ {
    public static void main(String[] args) {
        Supplier<Integer> s=()->999;
        System.out.println(s.get());
        //we dont have to pass any input to this this is a supplier
        // it have to supply the value/data to the user
    }
}
