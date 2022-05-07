package stream;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.stream().map(i->i*i).forEach(x-> System.out.println(x));

    }
}
