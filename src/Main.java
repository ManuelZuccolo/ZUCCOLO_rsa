import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        RSA rsa = new RSA();

        System.out.println("Chiave pubblica (n, e): " + rsa.getN() + ", " + rsa.getE());

        System.out.print("Numero da cifrare (< n): ");
        BigInteger message = input.nextBigInteger();

        BigInteger cipher = rsa.encrypt(message);
        System.out.println("Messaggio cifrato: " + cipher);

        BigInteger decrypted = rsa.decrypt(cipher);
        System.out.println("Messaggio decifrato: " + decrypted);

        input.close();
    }
}