// The function accepts an integer array ‘arr’ of size ‘n’ as its argument.
// Each element of ‘arr’ represents the number of chocolates distributed to a person. The function needs to return the minimum number of
// chocolates that need to be distributed to each person so that the difference between the chocolates of any two people is minimized.
public class ChoclateDistribution {
    public static int choclate(int[]arr,int n){
        int mindif = Integer.MAX_VALUE;
        int diff = 0;
        for(int i=0;i<=n-2;i++){
            diff = arr[i+1]-arr[i];
            if(diff<mindif){
                mindif=diff;
            }
        }
        return mindif;
    }
    public static void main(String[] args) {
        int [] arr = {3,5,10,15,32};
        System.out.println(choclate(arr,arr.length));
    }
}
