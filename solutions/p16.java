import java.math.BigInteger;

public class p16 {
  public static void main(String[] args) {
    int j=1000;
    BigInteger result=new BigInteger("2").pow(j);
    BigInteger sum=new BigInteger("0");
    BigInteger limit=new BigInteger("10");
    while(result.compareTo(limit)>-1){
      sum=sum.add(result.divideAndRemainder(limit)[1]);
      result=result.divide(limit);
    }
    sum=sum.add(result);
    System.out.println(sum);
  }
}
