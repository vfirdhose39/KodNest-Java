public class Dowhileloop {
     public static void main(String[] args) {
        int i = 0; 
        
        do {
            int j = 0; 
            
            do {
                System.out.println(j);
                j++; 
            } while (j <= 5); 
            
            System.out.println();
            i++; 
        } while (i <= 5); 
    }
}

