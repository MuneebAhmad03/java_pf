public class Array {
    public static void main (String[] args){


        //....... Single Dimensional ..........

        int a[] = new int[5];

        a[0] = 10;
        a[1] = 15;
        a[2] = 20;
        a[3] = 25;
        a[4] = 30;


        for (int i = 0 ; i<a.length; i++) {

            System.out.println(a[i]);
        }

            int b [] = {1,2,3,4,5};

            for (int j = 0 ; j< b.length ; j++ ){
            System.out.println(b[j]);

        }

//            ............Multidimensional.........

        int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

            for (int i = 0; i< 3; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }




    }
}