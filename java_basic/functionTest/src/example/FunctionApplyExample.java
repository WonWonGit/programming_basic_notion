package example;

import java.util.function.Function;

public class FunctionApplyExample {
    public static void main(String[] args) {
        Function<Integer, Integer> func1 = x -> x + x;

        Integer result = func1.apply(20);

        System.out.println(result);
    }
}
