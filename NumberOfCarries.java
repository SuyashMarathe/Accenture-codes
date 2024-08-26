public class NumberOfCarries {

    public static int numberOfCarries(int num1 , int num2){
        int carry = 0;
        int car = 0;
        while(num1>0||num2>0){
            int temp1 = num1%10;
            int temp2 = num2%10;
            if(temp1+temp2+car>=10){
                carry++;
                car = 1;
            }
            else{
                car=0;
            }
            num1=num1/10;
            num2=num2/10;
        }
        return carry;
    }
    public static void main(String[] args) {
        System.out.println(numberOfCarries(23,563));
    }
}
