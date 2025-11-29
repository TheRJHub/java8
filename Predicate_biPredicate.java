import java.util.function.*;
public class Predicate_biPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> b=(x,y)->x%2==0 && y%2==0;
        System.out.println(b.test(10,21));
        System.out.println(b.test(20,24));
        System.out.println(b.test(11,13));
        System.out.println("++++++++++++++++++++");

        BiPredicate<String,Integer> b1=(a,a1)->a.length()==(a1-1);
        System.out.println(b1.test("Rajat",5));

        System.out.println("==============");
        Function<String,Integer> f=x->x.length();
        System.out.println(f.apply("RajatKumardas"));
        System.out.println("---BiFunction---");
        BiFunction<String,String,Integer> f1=(x,y)->x.length()-y.length();
        System.out.println(f1.apply("Das","Rajat"));

        System.out.println("====Consumer====");
        Consumer<Integer> c=x-> System.out.println("value of a is consumed "+x);
        c.accept(8);
        System.out.println("BiConsumer");
        BiConsumer<Integer,Integer> c1=(x,y)-> System.out.println("Values of x and y are consumed "+(x+y));
        c1.accept(98,12);

        System.out.println("---Supplier-there is no BiSupplier---");
        Supplier<Integer> ss=()->123;
        System.out.println("U get this value by supplier without giving any input to it: "+ss.get());
    }
}
