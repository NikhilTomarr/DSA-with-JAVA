public class JavaBasics {
    public static boolean isPrime(int n) {
        // 1. Handle numbers less than or equal to 1
        if (n <= 1) {
            return false;
        }

        // 2. Optimized loop: Math.sqrt(n) tak chalao
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Direct false return karo, extra variable ki zaroorat nahi
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(11)); // Output: true
        System.out.println(isPrime(1));  // Output: false
    }
}    
