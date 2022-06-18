import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {

        int a,b,c ;
        Scanner input = new Scanner(System.in);

        System.out.println("A değerini giriniz :");
        a = input.nextInt();

        System.out.println("B değerini giriniz :");
        b = input.nextInt();

        System.out.println("C değerini giriniz :");
        c = input.nextInt();

        if ((a>b)&&(a>c)){
            if (b>c){
                System.out.println("a > b > c");
            }
        }
        else if ((a<b)&&(a<c)){
            if (b<c){
                System.out.println("a < b < c");
            }
        }
        else if ((a>b)&&(a<c)){
            if (b<c){
                System.out.println("c > a > b");
            }
        }
        else if ((a<b)&&(a>c)){
            if (b>c){
                System.out.println("b > a > c");
            }
        }
        else if ((a<b)&&(a<c)){
            if (b>c){
                System.out.println("b > c > a");
            }
        }
        else if ((a>b)&&(a>c)){
            if (b<c){
                System.out.println("a > c > b");
            }
        }


    }
}