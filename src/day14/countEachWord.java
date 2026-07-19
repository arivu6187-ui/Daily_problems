package day14;

import java.util.stream.Stream;

public class countEachWord {
    static void main() throws Exception {
        Stream<String> str=Stream.of("sunday","monday","tuesday","wednesday","thursday","friday","saturday");
        System.out.println(str.count());
    }
}
