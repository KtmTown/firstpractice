package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstDemo {
    public static void main(String[] args) {
        List<Integer> li =Arrays.asList(66,32,45,12,20);
            for(int i =0; i <li.size();i++){
                System.out.println(li.get(i));
                System.out.println("-00----");
            }

        System.out.println("===================");
            for(Integer i:li)
                if(i>20)
                System.out.println(i);

        System.out.println("=========================");
        System.out.println("=----=000000");
        li.stream()
                .filter(i->i>32)
                .forEach(i -> System.out.println(i));
    }
}
