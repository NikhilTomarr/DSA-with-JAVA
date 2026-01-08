// #Max Subarrays Sum (Prefix Sum Approach)
// Time Complexity: O(n^2)
//  ______________________
// | 1 | -2  | 6 | -1 | 3 |
// '----------------------'

// Prefix Sum Array: prefix[i-1] + arr[i]
// [ 1, -1, 5, 4, 7 ]

public class JavaBasics {
    public static void  maxSubarraysSum(int num[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        //calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
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
