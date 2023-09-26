package arreglonumeros;
import java.util.Scanner;
public class Arreglonumeros {
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       int[] num = new int[9];
        for(int i=0;i<9;i++){
            System.out.print("ingresa un numero: ");
            num[i]=sn.nextInt();
            System.out.println();
            }
    }
}
