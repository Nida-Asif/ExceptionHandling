import java.util.InputMismatchException;
import java.util.Scanner;


    public class Demo {
        public static void main(String[] args) {
            int a;
            int b;
//
        a=10;
        b=10;
            int[] array = {1, 2, 3, 4};
        System.out.println(array[5]);
            Scanner input = new Scanner(System.in);
        System.out.println("a/b="+a/b);
        a=input.nextInt();
        b=input.nextInt();
            try{
                a=input.nextInt();
                b=input.nextInt();
                System.out.println("a/b="+a/b);
                System.out.println(array[5]);
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticException");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }
            catch (InputMismatchException e){
                System.out.println("InputMismatchException");


            }
            finally {
                System.out.println("this could be the message");
            }
            System.out.println("this is the message");
        }
        }
//        int exceptionCheck( a,b){
//            int division;
//            division=a/b;
//            try {
//                System.out.println(division);
//            }
//            catch (ArithmeticException e){
//                System.out.println("ArithmeticException");
//
//            }
//            return division;
//        }
//

