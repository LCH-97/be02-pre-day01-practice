package day01;

public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */
        Integer num1;
        num1 = 10;
           while(num1 > 5){
            System.out.println("*****");
                 num1 = num1 - 1;
        }


        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */
        Integer num2;
        num2 = 1;

        if (num2 < 6){
            System.out.println("*");
            num2 = num2 + 1;}

        if (num2 < 6){
            System.out.println("**");
            num2 = num2 + 1;}

        if (num2 < 6){
            System.out.println("***");
            num2 = num2 + 1;}

        if (num2 < 6){
            System.out.println("****");
            num2 = num2 + 1;}

        if (num2 < 6){
            System.out.println("*****");
            num2 = num2 + 1;}


        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
         */

        Integer num3;
        num3 = 1;
        if (num3 < 6){
            System.out.println("    *    ");
            num3 = num3 + 1;}

        if (num3 < 6){
            System.out.println("   ***   ");
            num3 = num3 + 1;}

        if (num3 < 6){
            System.out.println("  *****  ");
            num3 = num3 + 1;}

        if (num3 < 6){
            System.out.println(" ******* ");

            num3 = num3 + 1;}

        if (num3 < 6){
            System.out.println("*********");
            num3 = num3 + 1;}


    }
}
