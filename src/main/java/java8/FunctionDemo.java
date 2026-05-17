package java8;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String,Integer> f = (name) -> name.length();
        System.out.println(f.apply("Ashokit"));
        System.out.println(f.apply("Rameshit"));
        System.out.println("========================");

       BiFunction<Integer,Integer,Integer> bif =(i, j) -> (i + j);
        System.out.println(bif.apply(5,15));
    }
}
