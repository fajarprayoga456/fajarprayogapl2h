package Exception;

import jdk.internal.icu.util.CodePointMap;

import java.util.Iterator;

public class Iterators2 {
    public static void main(String[] args) {
        CodePointMap list = null;
        Iterator<CodePointMap.Range> it = list.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
