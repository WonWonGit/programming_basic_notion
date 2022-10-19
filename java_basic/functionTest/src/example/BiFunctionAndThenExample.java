package example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionAndThenExample {
    public static void main(String[] args) {
        
        BiFunction<Integer, Integer, Double> func1 = (a1, a2) -> Double.valueOf(a1 + a2);
        Function<Double, String> func2 = d1 -> "Result : " + d1;

        String result = func1.andThen(func2).apply(10, 20);
        System.out.println(result);

    }
}
