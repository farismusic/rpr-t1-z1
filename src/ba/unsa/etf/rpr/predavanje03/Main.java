package ba.unsa.etf.rpr.predavanje03;
import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int suma=0, c;
        while(n!=0){
            c=n%10;
            suma+=c;
            n/=10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.print("Unesi broj n: ");
        Scanner ulaz=new Scanner(System.in);
        int n=ulaz.nextInt();
        for(int i=1; i<=n; i++){
            if(i%sumaCifara(i)==0){
                System.out.println(i);
            }
        }

    }
}
