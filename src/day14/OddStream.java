package day14;

import java.util.stream.Stream;

public class OddStream {
    public static void main(String[] args) {
        Stream<Integer> number=Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println("Even numbers");
        number.filter(num->num%2==0).forEach(System.out::println);
    }
}
