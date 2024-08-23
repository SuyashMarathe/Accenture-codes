public class DifferenceofSum {
    public static int differenceofSum(int n,int  m){
        int sumofdivisible = 0;
        int notdivisible = 0;
        for(int i = 1; i<=m;i++){
            if(i%n==0){
                sumofdivisible+=i;
            }
            else {
                notdivisible+=i;
            }
        }
        return notdivisible-sumofdivisible;
    }

    public static void main(String[] args) {

        System.out.println(differenceofSum(4,20));
    }
}
