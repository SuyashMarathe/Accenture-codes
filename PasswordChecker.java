/* You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input 1:
aA1_67
Input 2:
a987 abC012

Output 1:
1
Output 2:
0
*/

public class PasswordChecker {
    public static int checkPassword(char []str, int n){
        boolean num = false;
        boolean character = false;
        boolean slash = false;
        for(int i=0;i<n;i++){
            if(str[i]=='0'||str[i]=='1'||str[i]=='2'||str[i]=='3'||str[i]=='4'||str[i]=='5'||str[i]=='6'||str[i]=='7'||str[i]=='8'||str[i]=='9'){
                num = true;
            }
            if(str[i]>='A'&&str[i]<='Z'){
                character = true;
            }
            if(str[i]!='/'){
                slash = true;
            }
        }

        if(n<4){
            return  0;
        }
        if(str[0]==' '){
            return 0;
        }
        if(character&&num&&slash){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        char[] arr = {'a','A','1','_','6','7'};
        System.out.println(checkPassword(arr,6));
    }
}
