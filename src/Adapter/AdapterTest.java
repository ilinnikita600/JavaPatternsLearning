package Adapter;

import java.util.ArrayList;

public class AdapterTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World!");
        IteratorEnumeration<String> iteratorEnumeration = new IteratorEnumeration<>(arrayList.iterator());
        while (iteratorEnumeration.hasMoreElements()) {
            System.out.println(iteratorEnumeration.nextElement());
        }
    }
}
