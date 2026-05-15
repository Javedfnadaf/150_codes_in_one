public class Main {
    public static void main(String[] args){
    
    int i = 2;
    while( i <= 100){
        int count = 0;
        
        int j = 2;
        while(j < i){
            
            if(i % j == 0){
                
                count++;
            
            }
            j++;
        }
        if(count == 0){
            System.out.println(i);
        }
        i++;
    }
    
 
    
    
    }
}