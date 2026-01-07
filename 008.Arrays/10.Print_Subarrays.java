// #Print Subarrays : a contiguous part of an array

//  ______________________
// | 2 | 4  | 6 | 8  | 10 |
// '----------------------'
//Output:

// 2 
// 2 4
// 2 4 6
// 2 4 6 8
// 2 4 6 8 10

// 4
// 4 6
// 4 6 8
// 4 6 8 10

// 6
// 6 8
// 6 8 10

// 8
// 8 10

// 10

public class JavaBasics {
    public static void  printSubarrays(int num[]) {
        int totalsubarrays = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {//print
                    System.out.print(num[k]+" ");//subarray
                }
                totalsubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays="+totalsubarrays);
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        printSubarrays(num);
    }
}
