import enums.Rank;

public class App {
    public static void main(String[] args) throws Exception {

        Rank one = Rank.ONE;
        Rank two = Rank.TWO;
        Rank three = Rank.THREE;

        System.out.println(one.compareTo(Rank.TWO));
        System.out.println(two.compareTo(Rank.TWO));
        System.out.println(three.compareTo(Rank.TWO));

    }

   
}
