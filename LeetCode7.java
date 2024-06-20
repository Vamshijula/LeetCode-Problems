public class LeetCode7 {

    public static void main(String[] args) {
        int num = 123;
        int ans = reverse(num);
        System.out.println(ans);
        
    }

    public static int reverse(int x){

        int temp;
        long reverse = 0;

        while(x > 0){
            temp =  x % 10;
            reverse = reverse*10+temp;
            x = x/10;

            if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)reverse;
    }
    
}
