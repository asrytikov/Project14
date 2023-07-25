package p6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("iPhone 13", "Apple",120000),
                new Phone("Samsung Galaxy S9", "Samsung",80000),
                new Phone("Xiaomi 13", "Xiaomi",50000),
                new Phone("Samsung Galaxy S13", "Samsung",130000)
        );

       /* Map<String, List<Phone>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany)
        );*/

       /* Map<Boolean, List<Phone>> phonesByCompany = phoneStream.collect(
                Collectors.partitioningBy(phone -> phone.getCompany()=="Apple")
        );*/
        /*Map<String, Long> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany, Collectors.counting())
        );*/
        /*Map<String, Integer> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany, Collectors.summingInt(Phone::getPrice))
        );*/

        /*Map<String, Optional<Phone>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany, Collectors.minBy(Comparator.comparing(Phone::getPrice)))
        );*/

       /* Map<String, IntSummaryStatistics> priceStatistics = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany, Collectors.summarizingInt(Phone::getPrice))
        );*/

        Map<String, List<String>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany, Collectors.mapping(Phone::getName, Collectors.toList()))
        );



        /*for (Map.Entry<String, List<Phone>> item : phonesByCompany.entrySet()){
            System.out.println(item.getKey());
            for(Phone phone:item.getValue()){
                System.out.println(phone.getName());
            }
            System.out.println();
        }*/
        /*for (Map.Entry<Boolean, List<Phone>> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey());
            for (Phone phone : item.getValue()) {
                System.out.println(phone.getName());
            }
            System.out.println();

        }*/

       /* for (Map.Entry<String, Long> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());


        }*/
        /*for (Map.Entry<String, Integer> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());


        }*/
        /*for (Map.Entry<String, Optional<Phone>> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue().get().getName());


        }*/
       /* for (Map.Entry<String, IntSummaryStatistics> item : priceStatistics.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue().getAverage());
        }*/
        for (Map.Entry<String, List<String>> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey());
            for(String name : item.getValue()){
                System.out.println(name);
            }
        }


    }

}
