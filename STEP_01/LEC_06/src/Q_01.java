// Counting Frequencies of Array Elements

import java.util.*;

public class Q_01 {
    public static void main(String[] args) {
        int []nums = {1, 2, 2, 1, 3};

//        boolean []visited = new boolean[nums.length];
//        List<List<Integer>> o = new ArrayList<>();
//
//        for(int i = 0; i < nums.length; i++) {
//            if(!visited[i]) {
//                ArrayList<Integer> cu = new ArrayList<>();
//                cu.add(nums[i]);
//                int count = 1;
//                visited[i] = true;
//
//                for(int j = i + 1; j < nums.length; j++) {
//                    if(nums[j] == nums[i] && !visited[j]) {
//                        count = count + 1;
//                        visited[j] = true;
//                    }
//                }
//
//                cu.add(count);
//                o.add(cu);
//            }
//        }
//        System.out.println(o);

        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(h.containsKey(nums[i])) {
                h.put(nums[i], h.get(nums[i]) + 1);
            }
            else {
                h.put(nums[i], 1);
            }
        }
        System.out.println(h);
    }
}
