package example;

import java.util.function.Function;

public class FunctionAndThenExample {
    public static void main(String[] args) {
        
        Function<Integer, Integer> func1 = a -> a * a;
        Function<Integer, String> func2 = a -> "result :" + a;

        String result = func1.andThen(func2).apply(10);

        System.out.println(result);
    
    }
}
