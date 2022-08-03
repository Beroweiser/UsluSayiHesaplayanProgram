/**
 * UsluSayiHesaplayanProgram
 */
 import java.util.Scanner;

public class UsluSayiHesaplayanProgram {

    public static void main(String[] args) {
        int n,k,total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alinacak sayı : ");
        n = inp.nextInt();

        System.out.print("üs olacak sayı : ");
        k = inp.nextInt();

        //3^4 = 3 * 3 * 3 * 3 
        for (int i = 1; i <= k; i++){
            total *= n; 
        }
        System.out.println(n + " üzeri " + k + " : " + total);

        inp.close();

    }
}