/** Class that prints the Collatz sequence starting from a given number.
 *  @author linf
 */
public class Collatz {

    /**
     * Buggy implementation of nextNumber!
     *
     * @return
     */
    public static int nextNumber(int n) {
        /** If n is even, the next number is n/2 */
        if (n % 2 == 0) {
            return n/2;
        /** If n is odd, the next number is 3n + 1 */
        } else if (n % 2 == 1)  {
            return 3 * n + 1;
        } else {
            return 0;
        }


    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

