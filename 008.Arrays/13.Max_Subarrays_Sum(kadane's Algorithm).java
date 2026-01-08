// #Max Subarrays Sum (kadane's Algorithm) : 

// -ve numbers allowed
// -ve = 0
// Time Complexity: O(n)
//  _____________________________________
// | -2 | -3  | 4 | -1 | -2 | 1 | 5 | -3 |
// '-------------------------------------'
//Current Sum = 0 | 0 | 4 | 3 | 1 | 2 | 7 | 4
//Max Sum     = 0 | 0 | 4 | 4 | 4 | 4 | 7 | 7


public class JavaBasics {
    public static void  kadanes(int num[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        //calculate prefix array
        for (int i = 1; i < num.length; i++) {
        currentSum += num[i];
        if (currentSum < 0) {
            currentSum = 0;
        }
        maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Max Subarray Sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(num);
    }
}
