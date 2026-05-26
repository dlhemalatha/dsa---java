
import java.util.*;

// Average of 3 numbers
 
/*public class practiceqs1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int average= (A+B+C) /3;
        System.out.println("average is : "+average);
    }
}*/

// Bill of Items
 public class practiceqs1{
 public static void main(String args[]) {
 Scanner sc=new Scanner(System.in);

float pencil=sc.nextFloat();
 float pen=sc.nextFloat();
 float eraser=sc.nextFloat();
 float total=pencil+pen+eraser;

 System.out.println("Bill is : "+total);
 //Add on - with 18% tax
 float newTotal=total+ (0.18f*total);
System.out.println("Bill with 18% tax : "+newTotal);
}
}
