package Task_nine;

import java.util.*;

public class Lists {

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static List setListElements(List<Double> list){
        final int M = 1000000;
        for (int i = 0; i < M; i++) {
            list.add(Math.random());
        }
        return list;
    }

    public static void getListElement(List<Double> list){
        final int K = 100000;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < K; i++) {
            list.get((int) (Math.random() * (K - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();

        getListElement(setListElements(arrayList));
        getListElement(setListElements(linkedList));
        System.out.println(removeDuplicates(arrayList));
    }
}
