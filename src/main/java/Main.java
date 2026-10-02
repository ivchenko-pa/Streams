import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,4,3,2,6,8,5,4,33,4,6,5,44,67);

        Stream<Integer> evenNumbersStream = numbers.stream().filter(n -> n%2 == 0);
        List<Integer> evenNumbers = evenNumbersStream.toList();
        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> doubledNumbers = numbers.stream().map(n ->  n*2).toList();
        System.out.println("Doubled numbers: " + doubledNumbers);

        List<Integer> sorteddNumbers = numbers.stream().sorted().toList();
        System.out.println("Sorted numbers: " + sorteddNumbers);


        int sum = numbers.stream().reduce(0, (a, b) -> a+b);
        System.out.println("Sum numbers: " + sum);
        sum = numbers.stream().reduce(0, (a, b) -> a+b);
        System.out.println("Sum numbers: " + sum);

        numbers.stream().forEach(n -> System.out.print(n));




    }
}
