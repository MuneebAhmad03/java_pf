public class Loops {
    public static void main (String [] args){

        //........FOR LOOP.............
        System.out.print("FOR LOOP : ");

        for (int i = 0; i < 10; i++ ){   //initialization; condition; increment/decrement

            System.out.print(i+ " ");
        }

        //...........WHILE............
        System.out.print(" WHILE LOOP : ");

        int i = 0;

        while (i<10){                //Condition
            System.out.print(i + " ");
            i++;
        }

        //..........DO WHILE LOOP..........
        System.out.print(" DO WHILE LOOP : ");
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);


    }
}
