import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction_ {
    public static void main(String[] args) {
        Function<String,Integer> f=x->x.length();
        System.out.println(f.apply("Rajat"));

        BiFunction<Integer,Integer,Integer> f2=(x,y)->x+y;
        System.out.println(f2.apply(4,8));

        BiFunction<String,String,Integer> f1=(x,y)->x.length()+y.length();
        System.out.println(f1.apply("Rajat","das"));
    }
}
