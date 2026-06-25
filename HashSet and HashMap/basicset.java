package HashSet_And_HashMap;

import java.util.HashSet;

public class Basic {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(5);
        set.add(2);
        set.add(-2);
        set.add(-4);
        System.out.println(set);
        System.out.println(set.size());
        set.remove(-4);
        System.out.println(set);
        set.remove(200);
        System.out.println(set.contains(20));
        System.out.println(set.contains(0));

        Object[] arr = set.toArray();
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(Object ele : arr){
            System.out.print(ele+" ");
        }
    }

}
