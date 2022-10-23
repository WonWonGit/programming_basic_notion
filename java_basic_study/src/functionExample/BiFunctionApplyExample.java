package functionExample;


import java.util.function.BiFunction;

public class BiFunctionApplyExample {
    public static void main(String[] args) {
        
        BiFunction<String, String, String> stringFunc1 = (s1, s2) -> {
            String s3 = s1 + s2;
            return s3;
        };

        String stringResult = stringFunc1.apply("Hello", "World");
        System.out.println(stringResult);

        BiFunction<Integer, Integer, Double> doubleFunc2 = (i1, i2) -> Double.valueOf(i1 + i2);
        Double sum = doubleFunc2.apply(10, 11);
        System.out.println(sum);

    }
}
