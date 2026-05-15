public class Main {
    public static void main(String[] args){
    
    
    int num = 112218;
    String s = String.valueOf(num);
    String rev = "";
    
    int i = 0;
    while(i < s.length()){
        rev = s.charAt(i) + rev;
        i++;
    }
    if(s.equals(rev)){
        System.out.println("its palindrom");
    }
    else{
        System.out.println("its not palindrom");
    }
    
    }
}