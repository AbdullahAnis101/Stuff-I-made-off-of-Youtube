import java.math.BigInteger;
// BigInteger are immutable classes. Therefore the number is never changing
public class BigIntegerExample {
   public static void main(String [] args){
       BigInteger b = new BigInteger("81290384210985091284091841");
       //This only works if it falls into 64 bits
       BigInteger bigInteger = BigInteger.valueOf(37892379532L);
       // A big Integer thats a mod.
       BigInteger mod = BigInteger.TEN;
       // works only with constants
      // BigInteger num = BigInteger.TEN);
    // basic operations of Big Integer
       // creating a new BigInteger to multiply
    bigInteger.multiply(new BigInteger("12312424"));
       System.out.println(bigInteger);
       c%k;
       c.mod(new BigInteger("k"));
       BigInteger result = c.modInverse(new BigInteger("k"));

   }

    /**
     *
     * @param n the number
     * @return n!
     */
    private BigInteger factorial(int n){
    BigInteger result = BigInteger.one;
    for(int i = 0; i < n)
    }
}
