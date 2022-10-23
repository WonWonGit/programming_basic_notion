package streamExample;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class StreamTest {

    public static void forEachWithoutStream(List<String> heroList){
        
        Iterator<String> heroIteratore = heroList.iterator();
        while(heroIteratore.hasNext()){
            String hero = heroIteratore.next();
            System.out.println(hero);
        }

    }

    public static void forEachStream(List<String> heroList) {
        
        Stream<String> heroStream = heroList.stream();
        heroStream.forEach(hero -> System.out.println(hero));

    }

    public static void sortedStream(List<String> heroList) {
        
        Stream<String> heroStream = heroList.stream();
        heroStream.sorted().forEach(hero -> System.out.println(hero));

    }

    public static void sortedWithoutStream(List<String> heroList){
        
        //기존 데이터를 정렬해서 변형시켜버림..!
        // Collections.sort(heroList);
        // for(String hero : heroList) System.out.println(hero);

    }

    public static void main(String[] args) {
        List<String> heroList = Arrays.asList("IronMan", "Thor", "SpiderMan");
        sortedWithoutStream(heroList);
        sortedStream(heroList);
        forEachWithoutStream(heroList);
        forEachStream(heroList);
    }
}
