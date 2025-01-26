import java.util.*;
public class BMI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in meters: ");
        float height = sc.nextFloat();
        System.out.print("Enter weight in kgs: ");
        float weight = sc.nextFloat();
        float BMI = weight/((height)*(height));
        System.out.println("Your Body Mass Index is: "+ BMI);
        if(BMI < 18.5){
           System.out.println("Underweight");
        }else if(18.5 <= BMI && BMI <= 24.9){
            System.out.println("Normal weight");
        }else if(25 <= BMI && BMI <= 29.9){
            System.out.println("Over weight");
        }else{
            System.out.println("Obese weight");
        }
        
    }
}
