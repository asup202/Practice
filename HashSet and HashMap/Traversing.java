package HashSet_And_HashMap;

import java.util.Arrays;
import java.util.HashSet;

public class HashsetImplementatiion {
    public static void main(String[] args) {
//        Integer[] arr = {1,2,3,4,5,6,67,4,6};
//        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));

          int[] arr = {1,2,3,4,5,6,67,4,6};
          HashSet<Integer> set = new HashSet<>();

          for(int ele : arr){
              set.add(ele);
          }

        System.out.println(set);
    }
}
