package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(52);
      /*  Stream<Integer> integerStream = list.stream().filter(i -> i % 2 == 0);
        integerStream.forEach(x-> System.out.println(x));*/
        list.stream().filter(i->i%2==0).forEach(x-> System.out.println(x));

    }
}
