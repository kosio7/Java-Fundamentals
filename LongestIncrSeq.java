import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncrSeq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int[] arr = new int[input.length];
        List<Integer> longList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1)) {
                if (arr[i - 1] < arr[i]) {
                    System.out.print(arr[i]);
                    currList.add(arr[i]);
                    if (currList.size() > longList.size()) {
                        longList = currList;
                    }
                }
                else {
                    System.out.print(arr[i]);
                    if (currList.size() > longList.size()) {
                        longList = currList;
                    }
                    currList.clear();
                    currList.add(arr[i]);
                }
            } else if (arr[i] < arr[i + 1]) {
                System.out.print(arr[i] + " ");
                currList.add(arr[i]);
            } else {
                System.out.println(arr[i]);
                if (currList.size() > longList.size()) {
                    longList = currList;
                }
                currList.clear();
            }
        }

        System.out.printf("\r\nLongest: ");
        for (int i = 0; i < longList.size(); i++) {
            System.out.print(longList.get(i) + " ");
        }
    }
}
