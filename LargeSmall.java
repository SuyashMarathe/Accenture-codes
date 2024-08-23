public class LargeSmall {
    public static int LargeSmallSum(int[] arr) {
        int secondLargestEven = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondSmallestOdd = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length;i = i + 2) {
            if (arr[i] > largest) {
                secondLargestEven = largest;
                largest = arr[i];
            }
            else if (arr[i]>secondLargestEven) {
                secondLargestEven=arr[i];
            }
        }
        for(int j = 1;j < arr.length;j = j + 2){
                if (arr[j] < smallest) {
                    secondSmallestOdd = smallest;
                    smallest = arr[j];
                }
                else if (arr[j]<secondSmallestOdd) {
                    secondSmallestOdd=arr[j];
                }
            }
            return secondLargestEven + secondSmallestOdd;
        }
        public static void main (String[]args){
            int[] arr = {8, 0, 2, 3, 5, 6};
            System.out.println(LargeSmallSum(arr));
        }
    }

