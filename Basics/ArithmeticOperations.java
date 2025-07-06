import java.util.Arrays;
class ArithmeticOperations {
    public int[] computeOperations(int x, int y) {
        if (y == 0) {
            return new int[]{x + y, x - y, x * y, Integer.MAX_VALUE, Integer.MAX_VALUE};
        }
        int p = x + y;
        int q = x - y;
        int r = x * y;
        int s = x / y;
        int t = x % y;
        return new int[]{p, q, r, s, t};
    }
    public static void main(String[] args) {
        ArithmeticOperations obj=new ArithmeticOperations();
        int x = 10;
        int y = 3;
        int[] result = obj.computeOperations(x, y);
        System.out.println("Results: (Addition, Subtraction, Multiplication, Division, Modulus):");
        System.out.println(Arrays.toString(result));
    }
}
