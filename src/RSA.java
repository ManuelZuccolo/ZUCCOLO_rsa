import java.math.BigInteger;
import java.util.Scanner;

public class RSA
{
    private BigInteger n, e, d;

    public RSA()
    {
        BigInteger p = BigInteger.valueOf(61);
        BigInteger q = BigInteger.valueOf(53);

        n = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE))
                .multiply(q.subtract(BigInteger.ONE));

        e = BigInteger.valueOf(17); //Pubblica
        d = e.modInverse(phi);      //Privata
    }

    public BigInteger encrypt(BigInteger msg) {
        return msg.modPow(e, n);
    }

    public BigInteger decrypt(BigInteger cipher) {
        return cipher.modPow(d, n);
    }

    public BigInteger getN() { return n; }
    public BigInteger getE() { return e; }
}
