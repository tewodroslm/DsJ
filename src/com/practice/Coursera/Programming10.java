package Coursera;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.System.*;

/**
 * Lambda
 */

public class Programming10 {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("2023/01/11 06:08:05");
        list.add("2022/03/11 02:41:35");
        list.add("2021/05/11 03:45:25");
        list.add("2020/06/11 04:18:41");
        list.add("2019/07/11 09:48:21");
        list.add("2018/07/11 07:28:34");
        list.add("20217/08/11 08:38:55");


        System.out.println(list);
        System.out.println("**** Start UnaryOperator ****");
        UnaryOperator<String> unaryOperator = (data) ->  data.replace('/', '-');
        list.replaceAll(unaryOperator);

        System.out.println(list);

        System.out.println("**** start function ****");
       // 2
        System.out.println("\n**** 2 \n");
        List<String> songTitles = Arrays.asList("humble", "element", "dna");
        System.out.println(songTitles);
        Function<String, String> capitalize = (str) -> str.toUpperCase();
        System.out.println("\n Capitalize Test \n");
        System.out.println(capitalize.apply("ted"));
        songTitles.stream().map(capitalize).forEach(System.out::println);
        List<String> m = songTitles.stream().map(capitalize).collect(Collectors.toList());
        System.out.println("M " + m);

        System.out.println("\n**** 6 125\n");
        List<Integer> numbers = List.of(1, 2, 4, 5, 6);
        int total1 = 0;

        for (Integer x : numbers) {
            if (x % 2 == 0)
                total1 += x * x;
        }
        System.out.println(total1);

        Function<Integer, Boolean> totFun = x -> x % 2 == 0;
//        numbers.stream().filter()
        int total = numbers.stream().filter(x -> x % 2 == 0).mapToInt(x -> x * x).sum();
        System.out.println(total);


        // 154
        System.out.println(" Map Entry \n");
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        int result = 0;
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            result += entry.getValue();
        }
        System.out.println(result);



    }

}

// 3, 4, 125(6), 7(154), 9(139), 10(138), 11(163), 12(144),






// What is the difference between the wait() and sleep methods?