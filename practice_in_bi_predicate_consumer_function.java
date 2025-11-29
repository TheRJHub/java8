import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class practice_in_bi_predicate_consumer_function {
    public static void main(String[] args) {
        Predicate<Integer> p=x->x%2==0;
        System.out.println(p.test(12));
        BiPredicate<Integer,String> p1=(x,y)->x==y.length();
        System.out.println(p1.test(5,"Rajat"));


//        Consumer<Integer> c=x-> System.out.println("Stire the value "+x);
//        c.accept(10);
//        BiPredicate<Integer,Integer> c1=(x,y)-> System.out.print("Add of these two (x,y)"+(x+y));
//        c1.accep(3,4);
    }
}
