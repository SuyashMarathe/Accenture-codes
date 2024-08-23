public class Songcount {
    public static int maxSong(String s ,int k){
        int currentcount = 0;
        int maxcount = 0;
        for(int i=0;i<k;i++){
                if(s.charAt(i)=='a'){
                    currentcount++;
            }

        }
        maxcount = currentcount;

        for(int i =k;i<s.length();i++){
            if(s.charAt(i-k)=='a'){
                currentcount--;
            }
            if (s.charAt(i)=='a'){
                currentcount++;
            }
            maxcount = Math.max(currentcount,maxcount);
        }
        return maxcount;
    }
    public static void main(String[] args) {
        System.out.println(maxSong("baabaab",4));
    }
}
