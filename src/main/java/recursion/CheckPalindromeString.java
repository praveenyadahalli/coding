package recursion;

public class CheckPalindromeString {
    static boolean checkPalin(String s, int i){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return checkPalin(s,i+1);
    }

    public static void main(String[] args) {
        String s="asaraa";
        System.out.println(checkPalin(s,0));
    }
}
