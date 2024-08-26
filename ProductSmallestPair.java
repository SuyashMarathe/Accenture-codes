import java.util.Arrays;

public class ProductSmallestPair {
    public static int ProdSmallPair(int sum, int[] arr,int n) {
        if (n <= 2)
            return -1;
        int ans, temp, check;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        check = arr[0] + arr[1];

        if (check <= sum)
            return arr[0] * arr[1];
        else
            return 0; // Return 0 if no valid pairs are found
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 3, -7, 3, 9};
        System.out.println(ProdSmallPair(4, arr,6)); // Expected Output: -21
    }
}
