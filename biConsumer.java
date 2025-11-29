import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class biConsumer {
    public static void main(String[] args) {
        Consumer<Integer> c=x-> System.out.println("It consume the value or accept the value "+x);
        c.accept(9);

        BiConsumer<Integer,Integer> c1=(x,y)-> System.out.println("Two values are "+x+","+y);
        c1.accept(9,10);
    }
}
