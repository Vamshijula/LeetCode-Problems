public class LeetCode9 {
    
    public static void main(String[] args) {
        int num = 121;
        boolean ans = isPalindrome(num);
        System.out.println(ans);
        
    }

    public static boolean isPalindrome(int x){

        int temp = x;
        int reverse = 0;

        if(x==0){
            return true;
        }

        if(x < 0 || x % 10 == 0){
            return false;
        }

        while(x > 0){
            int digit = x % 10;
            reverse = reverse*10 + digit;
            x = x / 10;
        }

        if(reverse == temp){
            return true;
        }else{
            return false;
        }
    }

    
}
