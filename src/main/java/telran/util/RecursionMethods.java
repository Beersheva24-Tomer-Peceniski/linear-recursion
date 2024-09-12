package telran.util;

public class RecursionMethods {
    public static void f(int a) {
        if (a > 3) {
            f(a - 1);
        }
    }
    public static long factorial(int n) {
        //n! = 1 * 2 * 3 *.....*n
        if(n < 0) {
            n = -n;
        }
        return n == 0 ? 1 : n * factorial(n - 1);
    }
    /**
     * 
     * @param num - any integer number
     * @param degree - any positive number
     * @return num ^ degree
     * limitations:
     * 1. no cycles allowed
     * 2. arithmetic operators + ; - are allowed only
     * 3. bitwise operators like >>, <<, &&, etc disallowe
     */
    public static long pow(int num, int degree){
        if (degree < 0) {
            throw new IllegalArgumentException();
        }
        return degree == 0 ? 1 : multiply(num, pow(num, degree - 1));
    }

    private static long multiply(long num, long times) {
        if(times < 0) {
            times = -times;
            num = -num;
        }
        return times == 0 ? 0 : num + multiply(num, times - 1);
    }


    public static int sum(int [] array) {

        return sum(array, array.length);
    }
    private static int sum(int[] array, int length) {
        return length == 0 ? 0 : array[length - 1] + sum(array, length - 1);
    }
    /**
     * 
     * @param x
     * @return x ^ 2
     * limitations:
     * 1. no cycles
     * 2. arithemetic operators only + ; -
     * 3. no bitwise operators
     * 4. no standard and additional methods are allowed
     * 5. no additional fields of the class RecursionMethods are allowed
     */
    public static int square(int x) {
        int res = 0;
        if(x < 0) {
            x = - x;
        }
        if(x != 0) {
            res = x + (square(x - 1) + (x - 1));
        } 
        return res;
    }

    /**
     * 
     * @param string
     * @param subString
     * @return true if subString is actually substring of the given string
     * limitations:
     * 1. no cycles
     * 2. the allowed methods of class String are
     *     2.1 charAt(int index)
     *     2.2 length()
     *     2.3 substring(int beginIndex)
     */
    public static boolean isSubstring(String string, String subString) {
        if (subString.length() > string.length()) {
            return false;
        }
        if(string.charAt(0) == subString.charAt(0)) {
            return substringCheck(string, subString, 0);
        }
        return isSubstring(string.substring(1), subString);
    }

    private static boolean substringCheck(String string, String subString, int index) {
        if(string.charAt(index) != subString.charAt(index)) {
            return false;
        } else if (index == subString.length() - 1) {
            return true;
        } else {
            return substringCheck(string, subString, index + 1);
        } 
    }
}