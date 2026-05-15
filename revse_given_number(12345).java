public class Main {
    public static void main(String[] args){
        
        
        int n = 12345;
        String s = String.valueOf(n);
        String rev = "";
        
        int i = 0;
        while(i<s.length()){
            rev = s.charAt(i) + rev;
            i++;
        }
        System.out.println(rev);
    }
}