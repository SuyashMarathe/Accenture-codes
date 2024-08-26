public class MoveHypen {
 public static String MoveHyphen(String str , int n){
    if(n==0){return null;}
        String strans = "";
    for(int i = 0;i<n;i++){

        if(str.charAt(i)=='-'){
            strans=str.charAt(i)+strans;
        }
        else{
            strans=strans + str.charAt(i);
        }

    }
    return strans;
 }
    public static void main(String[] args) {
        System.out.println(MoveHyphen("String-Compare",14));
    }
}
