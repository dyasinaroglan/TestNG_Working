package day_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MainIterotor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ", ");
        }
    }
}
