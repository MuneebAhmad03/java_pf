import java.sql.SQLOutput;

public class Conditional_Statement {
    public static void main(String []args){

    /* Use if to specify a block of code to be executed, if a specified condition is true
       Use else to specify a block of code to be executed, if the same condition is false
       Use else if to specify a new condition to test, if the first condition is false
       Use switch to specify many alternative blocks of code to be executed */


        //.....IF Condition.....

        int i = 5;

        if (i < 10){

            // if the condition is true it will run all the statement in the block
            // if the condition is false no statement in the block will run

            System.out.println("i is Greater  ");
            System.out.println("It will also run ");
        }


        //....IF ELSE.....

        if(i > 10 ) {
            //if this condition is false the else condition will run
            //if this condition is true then else condition won't run
            System.out.println("i is Greater ");
        }else {
            System.out.println("i is lesser ");
        }


        //......nested if......

        if( i == 10 || i <15 ){

            if(i < 15){
                System.out.println("i is lesser than 15");

                if (i > 11)
                    System.out.println("i is lesser than 15");
            }else {
                System.out.println("i is Greater than 15");
            }
        }


        //..... if-else-if ladder.....

        if (i < 20){
            System.out.println("i is lesser than 20");
        } else if (i < 15) {
            System.out.println("i is lesser than 15");
        } else if (i < 11) {
            System.out.println("i is lesser ");
        }else {
            System.out.println("NONE");
        }

        int num = 5;

        switch (num){
            case 1:
                System.out.println("it is 1");
                break;
            case 2:
                System.out.println("it is 2");
                break;
            case 3:
                System.out.println("it is 3");
                break;
            case 4:
                System.out.println("it is 4");
                break;
            case 5:
                System.out.println("it is 5");  //this condition is true so it prints
                break;
            default:
                System.out.println("None of above ");

        }
        
    }
}
