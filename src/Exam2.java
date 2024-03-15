public class Exam2 {
    public static void main(String[] args) {

        // 높이 : 3

        /*

         *
         ***
         *****

         */

//        for (int i = 0; i < 2; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
//        for (int i = 0; i < 1; i++) {
//            System.out.print(" ");
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//        for (int i = 0; i < 5; i++) {
//            System.out.print("*");
//        }
//
//
//        // 높이 : 5
//
//        // 출력
//
//        /*
//
//         *
//         ***
//         *****
//         *******
//         *********
//
//         */
//
//        for (int i = 0; i < 2; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
//        for (int i = 0; i < 1; i++) {
//            System.out.print(" ");
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//        for (int i = 0; i < 5; i++) {
//            System.out.print("*");
//        }


        // 높이 : 7
        for(int i = 0; i < 7; i++){
            if(i==6){
                System.out.println("*");
            }
            System.out.print(" ");
        }
        for(int j = 0; j < 9; j++){
            if(j >= 4 && j <= 6){
                System.out.println("*");
            }
            System.out.print(" ");
        }
        System.out.println("       *");
        // 출력

        /*

               *
              ***
             *****
            *******
           *********
          ***********
         *************

         */


    }
}
