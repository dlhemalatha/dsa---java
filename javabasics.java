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


//operators
/* Arithmatic operator are +,-,*,/,%
    and we have three types urnary ,binary, thernary*/
int A = 10;
int B = 5;

System.out.println(A+B);
System.out.println(A*B);
//output 15 , 50

int a = 10;
int b = ++a;

System.out.println(a);
System.out.println(b);
//output 11,11

//  Relational operator are ==,!=,<,>,<=,>=,

// Logical operator &&,||,!
System.out.println((3>2) && (5<0));
//output = false

int A = 10;
A += 10;//A = A + 10
int B = 5;
B -= 5;//B = B - 5
System.out.println(A);
System.out.println(B);

  }
}
//conditional statements if-else,else-if

//print largest of 3

public class JavaBasics {

    public static void main(String args[]) {

        int A = 1, B = 3, C = 6;

        if ((A >= B) && (A >= C)) {
            System.out.println("Largest is A");
        }
        else if (B >= C) {
            System.out.println("Largest is B");
        }
        else {
            System.out.println("Largest is C");
        }

    }
}

public class conditionalstatements {
    
 public static void main(String args[]) {

        int age = 15;

        if(age >= 18) {
            System.out.println("adult : drive, vote");
        }
         if(age>13 && age<18) {
            System.out.println("teenager");
        }
            else {
            System.out.println("not adult");
        }

    }
}
