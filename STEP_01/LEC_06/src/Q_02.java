/* Highest Occurring Element in an Array
Given an array nums of n integers, find the most frequent element in it i.e., the element that occurs the
maximum number of times. If there are multiple elements that appear a maximum number of times, find the smallest of them.
*/
import java.util.*;

public class Q_02 {
    public static void main(String[] args) {
        int []nums = {4, 4, 5, 5, 6};
        boolean []visited = new boolean[nums.length];

        int maxKey = Integer.MIN_VALUE, maxVal = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!visited[i]) {
                int cuKey = nums[i], cuVal = 1;
                visited[i] = true;
                for(int j = i + 1; j < nums.length; j++) {
                    if(nums[i] == nums[j] && !visited[j]) {
                       cuVal = cuVal + 1;
                       visited[j] = true;
                    }
                }
                if(maxVal == cuVal && maxKey != Integer.MIN_VALUE && maxKey < cuKey) {
                    continue;
                }
                else if(cuVal > maxVal) {
                    maxKey = cuKey;
                    maxVal = cuVal;
                }
            }
        }
        System.out.println(STR."Key - \{maxKey}");
        System.out.println(STR."Value - \{maxVal}");
    }
}
