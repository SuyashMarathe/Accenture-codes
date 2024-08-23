import java.util.Scanner;

public class Accenturecodes {
    public static int CountSpecificNumbers(int m, int n){
        if(m>n){
            return -1;
        }
        int count = 0;
        for(int i=m;i<=n;i++){
            int num = i , flag = -1;
            while(num!=0){
                int a = num %10;
                num = num/10;
                if(a==1||a==4||a==9){
                    flag=1;
                }
                else{
                    flag = 0;
                    break;
                }
            }
            if(flag==1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(CountSpecificNumbers(m,n));
        sc.close();
    }
}