package Arrays;

public class EnhancedforLoop {
    private static int[] arr;

    public static void main(String[] args){
        int total = 0;
        for(int x : arr) {
            total += x;
        }
    }
}
