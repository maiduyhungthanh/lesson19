import java.util.InputMismatchException;
import java.util.Scanner;

public  class  Bmi {
    public void input() {
            //    while (true) {
            
            //Ex1 : tính BMI kg/cm^2
            Scanner sc = new Scanner(System.in);
            System.out.println("Ex1 : tính BMI");
            try {
                    System.out.println("Cân nặng (kg) = ");
                    double kg = sc.nextDouble(); 
                    int Kg = (int) kg;
                    int[] kG = new int[Kg];
                

                   System.out.println("Chiều cao (cm)= ");
                   double cm = sc.nextDouble();
                   int Cm = (int) cm;
                      int[] cM = new int[Cm];
                
                double BMI = kg / (Math.pow(cm / 100, 2));
                
                System.out.printf("Chỉ số BMI của bạn: %.5f \n", BMI);

                if (BMI < 18.5) {
                    System.out.println("NGƯỜI GẦY");
                }
                if (BMI >= 18.5 && BMI <= 24.9) {
                    System.out.println("NGƯỜI BÌNH THƯỜNG");
                }
                if (BMI > 24.9) {
                    System.out.println("NGƯỜI BÉO");
                }
            } catch (NegativeArraySizeException e1) {
            System.out.println("Cân nặng và chiều cao phải là một số dương");
        } catch (InputMismatchException e2) {
            System.out.println("Cân nặng và chiều cao phải nhập bằng số");
        }
        System.out.println("------------------------------------------------------------------------------------------");
        // }
    }
}
