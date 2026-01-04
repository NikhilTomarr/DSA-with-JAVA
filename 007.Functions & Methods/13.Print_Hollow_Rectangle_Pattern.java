public class JavaBasics {
    public static void hallow_rectangle(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hallow_rectangle(4, 5);
    }
}
