import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.NameAlreadyBoundException;
public class Hcn {
    public static void rectangle() {
         int m;     
         int n;
       
      
        try{
       
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập chiều rộng: ");
    m = scanner.nextInt();
    int M[] = new int[m];
  
    

    System.out.println("Nhập chiều dài: ");
    n = scanner.nextInt();
    int N[] = new int[n];
      
    System.out.println("Ma trận A vừa nhập:");
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
} catch (InputMismatchException e1) {
    System.out.println("Chiều rộng và chiều dài phải nhập là số");
}catch (NegativeArraySizeException e2){
    System.out.println("Chiều rộng và chiều dài phải là số dương");
}
         System.out.println("------------------------------------------------------------------------------------------");
   }
}
    