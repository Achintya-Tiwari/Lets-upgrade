import java.util.*;

public class Majority {
    public static int majorityElement(int []v) {
        int n = v.length;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (v[j] == v[i]) {
                    cnt++;
                }
            }
            if (cnt > (n / 2))
                return v[i];
        }

        return -1;
    }

    public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }
        int[] arr = new int[arr_size];
        System.out.println(
            "Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
 
        sc.close();
        
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }

} 