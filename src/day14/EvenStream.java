package day14;

import java.util.stream.Stream;

public class EvenStream {
    static void main() {
        Stream<Integer> numbers=Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println("odd numbers");
        numbers.filter(num->num%2!=0).forEach(System.out::println);
    }
}
