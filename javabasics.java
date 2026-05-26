public class javabasics {
    public static void main(String[] args) {
        System.out.println("i am Hema");
        System.out.println("****\n***\n**\n*" );
    }
    
}


//variables
public class variables {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        String name= "tony shark";
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);

    }
}
//data types
public class datatypes {
    public static void main(String[] args) {
        int number=2;
        float price=10.5f;
        char ch='a';
        boolean var=true;
        byte b=8;
        //long
        //float
        short n=220;
        System.out.println(number);
        System.out.println(price);
        System.out.println(ch);
        System.out.println(var);
        System.out.println(b);
        System.out.println(n);
     }
    
}


//inputs in java
import java.util.*;

public class inputtypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      //  String input = sc.next();
      //  System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);

        
        int number = sc.nextInt();
        System.out.println(number);
       
        // sum of two numbers
          int a=sc.nextInt();
          int b=sc.nextInt();
          int sum=a+b;
          System.out.println(sum);

          //Area of the circle
          float rad=sc.nextFloat();
          float area=3.14f*rad*rad;
          System.out.println(area);
          sc.close();
        
        

    }
}

// Types conversion
import java.util.*;

public class typesconversions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float b=sc.nextInt();
        System.out.println(b);
        //output=2.0

 // Type casting
        float a=25.12f;
        int b =(int)a;
        System.out.println(b);
        sc.close();
        //output=25
 
 //Types promotion in expression
        byte a=5;
        short b=10;
        char ch='c';
        System.out.println(a+b+ch);
        sc.close();
    //output=114
    }
}

