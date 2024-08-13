public class CharNum {
    public static char numberAdder(char a,int num){
        char answer = 'a';

        int ans = (a-'a'+num)%26;
        ans = (ans+26)%26;
        answer= (char)('a'+ ans);
        return answer;
    }
    public static void main(String[] args) {
        int num = 30;
        char key = 'e';
        System.out.println(numberAdder(key,num));
    }
}
