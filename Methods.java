public class Methods {
    //......Methods.....

    static void myMethod(){

        System.out.println("Simple Method Print Only.");
    }
// ........ Parameter in a Method.......

    static void name(String fname){

        System.out.println(fname + " is a Student.");
    }
    static void studentId(String name,int age ,String university){

        System.out.println("Student Name : " + name + "\nStudent age : " + age + "\nStudent University : " + university );
}

//............ Return Values..............

    static int add5(int x){
        return 5 + x;
    }
//............. Method Overloading ..........

    static void add(int a, int b ){
        System.out.println(a + b);
    }
    static void add(double a , double b){
        System.out.println(a + b);
    }


    public static void main (String [] args){

        myMethod();
        name("Muneeb");
        name("Ahmad");
        studentId("Muneeb", 18,"Comsat University");
        studentId("Ali", 19,"Comsat University");
        System.out.println("This will add 5 and give the result " +add5(3));
        add(5,10);
        add(5.0,10.0);
    }
}
