package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> arList=new ArrayList<>();
        arList.add(10);
        arList.add(12);
        arList.add(15);
        arList.add(16);
        arList.add(18);
        List<Integer> collect = arList.stream().filter(x -> x >= 15).collect(Collectors.toList());
        collect.stream().forEach(x-> System.out.println(x));

        //odd and even


    }

}
