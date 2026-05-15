public class Main {
    public static void main(String[] args){
    
    
  int num  = 123;
  int original = num;
  int sum = 0;
  
  
  
  while(num > 0){
      
      int digit = num % 10;
      sum = sum + (digit*digit*digit);
      num = num / 10;
      
      
      
  }
 if(original == sum){
     System.out.println("its amstrong num");
     
 }
 else{
     System.out.println("its not amstrong");
 }
    
    
    }
}