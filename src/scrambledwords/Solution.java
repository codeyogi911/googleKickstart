package scrambledwords;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            int retval = 0;
            int lengthDictnry = scanner.nextInt();
            scanner.nextLine();
            List<String> dictionary = Arrays.asList(scanner.nextLine().split(" "));
            dictionary.forEach(word-> System.out.println(word));

        }
    }
}
