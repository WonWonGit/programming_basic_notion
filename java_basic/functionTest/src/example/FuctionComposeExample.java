package example;

import java.util.function.Function;

public class FuctionComposeExample {
    public static void main(String[] args) {
        
        Function<Integer, Integer> add = a -> a + a;
        Function<Integer, Double> multiply = a -> a * 2.0;
        Function<Integer, Double> addAndMutiply = multiply.compose(add);

        Double result = addAndMutiply.apply(10);
    
        System.out.println(result);
    }


}
