import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String prefix = arr[0];

        for (int i = 1; i < n; i++) {
            int j = 0;
            while (j < prefix.length() && j < arr[i].length()
                   && prefix.charAt(j) == arr[i].charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);
        }

        if (prefix.length() == 0) {
            System.out.print("-1");
        } else {
            System.out.print(prefix);
        }
    }
}