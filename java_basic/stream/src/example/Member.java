package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Member {

    public static int MALE = 0;
    public static int FEMALE = 1;
    private String name;
    private int gender;
    private int age;


    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public int getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
            new Member("홍길동", Member.MALE, 50),
            new Member("체리", Member.FEMALE, 20),
            new Member("지우", Member.MALE, 40),
            new Member("웅이", Member.MALE, 28),
            new Member("이슬이", Member.FEMALE, 20)
        );
        
        List<String> memberNamesUnderForty = memberList.stream()
                                                        .filter(member -> member.age < 40)
                                                        .map(Member::getName)
                                                        .sorted()
                                                        .collect(Collectors.toList());
        
        memberNamesUnderForty.stream().forEach(System.out::println);      
        
        double maleAgeAvg = memberList.stream()
                                        .filter(member -> member.getGender() == Member.MALE)
                                        .mapToInt(Member::getAge)
                                        .average()
                                        .getAsDouble();

        System.out.println("남자 평균 나이 : " + maleAgeAvg);                                
    }

}
