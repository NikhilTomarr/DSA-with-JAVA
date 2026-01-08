// #Max Subarrays Sum (Brute Force Approach)
// Time Complexity: O(n^3)
//  ______________________
// | 1 | -2  | 6 | -1 | 3 |
// '----------------------'


public class JavaBasics {
    public static void  maxSubarraysSum(int num[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {//print
                    currentSum += num[k];
                }
                System.out.println(currentSum);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("max sum="+maxSum);
    }

    public static void main(String[] args) {
        int num[] = {1, -2, 6, -1, 3};
        maxSubarraysSum(num);
    }
}
