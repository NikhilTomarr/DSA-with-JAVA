// #Binary Search  --- time complexity O(logn)

// prerequisite: sorted array
//                            key = 10
//  _________________________________
// | 2 | 4  | 6 | 8  |  10 | 12 | 14 |
// '---------------------------------'
//   '--------'   |      '---------'
//       |       mid          |
//      start                end

// Pseudocode:

// start = 0, end = n-1
// while(start <= end)
// find mid = (start + end) / 2
// compare mid & key
// mid==key  -> found
// mid>key  -> left search
// mid<key -> right search

public class JavaBasics{

    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparison
            if (numbers[mid] == key) {
                return mid;
            }
            else if (numbers[mid] < key) {
                start = mid + 1; // right search
            }
            else {
                end = mid - 1; // left search
            }
        }
        return -1; // key not found
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("index of key: " + binarySearch(numbers, key));
    }
}
