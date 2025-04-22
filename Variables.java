public class Variables {
public static void main (String[] args){


    //   ....SIMPLE VARIABLE IN JAVA....

    String myName = "Muneeb";
    int myNumber = 1;
    float myFloatNum = 2.33f;
    double myDoubleNum = 2.345353d;
    char myLetter = 'M';
    boolean myBool = true;

    System.out.println("Name : " + myName);   // NON PRIMITIVE TYPE
    System.out.println("int Number : " + myNumber);
    System.out.println("Float Number : " + myFloatNum);
    System.out.println("Double Number : " +myDoubleNum);
    System.out.println("Char : "+ myLetter );
    System.out.println("Boolean : " + myBool);

    // ....OVERWRITE PREVIOUS VALUE....

    myNumber = 5;
    System.out.println("int Number (Overwrite) : " + myNumber);

    // .....FINAL VARIABLE....

    final int myNum1 = 20;
    System.out.println("Final int  : " + myNum1); // VALUE REMAIN SAME (CANT CHANGE THE VALUE)

    // .....MATHEMATICAL OPERATIONS....

    System.out.println("Adding two int values : " + myNumber + myNum1 );
    System.out.println("Multiplying two decimal number :  " + myFloatNum * myDoubleNum);

    // .... 1 VARIABLE MULTIPLE VALUES .....

    int x ;
    int y ;
    int z ;

    x=y=z = 20;
    System.out.println("1 Variable Multiple values :  "  + x+y+z);


    // .... REAL WORLD EXAMPLE .....

    String studentName = "John Doe";
    int studentID = 15;
    int studentAge = 23;
    float studentFee = 75.25f;
    char studentGrade = 'B';


    System.out.println("Student name: " + studentName);
    System.out.println("Student id: " + studentID);
    System.out.println("Student age: " + studentAge);
    System.out.println("Student fee: " + studentFee);
    System.out.println("Student grade: " + studentGrade);


}
}