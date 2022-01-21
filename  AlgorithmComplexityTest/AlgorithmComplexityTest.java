import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();


        int[] frequentChar = new int[255];                         //{1}
        for (int i = 0; i < inputString.length(); i++) {           //{2}
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = (int) inputString.charAt(i);               //{3}
            /* Tăng giá trị tần suất */
            frequentChar[ascii] += 1;                              //{4}
        }

        int max = 0;                                             //{5}
        char character = (char) 255; /* empty character */      //{6}
        for (int j = 0; j < 255; j++) {                         //{7}
            if (frequentChar[j] > max) {                        //{8}
                max = frequentChar[j];                          //{9}
                character = (char) j;                           //{10}
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");

        /*
            T {1}  =          O(1)
            T {2}  =            O(n)
            T {3}  =            O(1)
            T {4}  =            O(1)
            T {5}  =            O(1)
            T {6}  =            O(1)
            T {7}  =            O(n)
            T {8}  =            O(1)
            T {9}  =            O(1)
            T {10}  =            O(1)
            T = T1 + T2*(T3+T4) + T5 + T6 + T7*(T8+T9+T10)
            T =         0(n)       +      O(n)
            T = O(n)
         */
    }
}
