import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UseOfPREDICATE {
    public static void main(String[] args) {

//        System.out.println("Checking even odd using predicate");
//        Predicate<Integer> p=a->a%2==0;
//        List<Integer> l= Arrays.asList(1,2,3,4,5,6,10,22,33);
//
//        for(int i:l){
//            if (p.test(i)){
//                System.out.print(i+" ");
//            }
//        }
        Predicate<String> p1=s-> s.toLowerCase().startsWith("r");
        List<String> q=Arrays.asList("Rajat","Rohit","aman","sandeep");
                for(String a:q){
                    if (p1.test(a)){
                        System.out.println(a+" ");
                    }
                }
    }
}
