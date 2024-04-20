package Tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

    public static void arrayListIterationUsingFor(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void arrayListIterationUsingWhile(ArrayList<String> arrayList) {
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
