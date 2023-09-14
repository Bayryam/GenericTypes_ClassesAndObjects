package NumberSuming;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Summator
{
    public static int sum(int first,int second){
        return first+second;
    }
    public static float sum(float first,float second){
        return first+second;
    }
    public static String sum(String first,String second){
        if (first == null || second == null)
            return null;
        return first+second;
    }
    public static BigInteger sum(BigInteger first, BigInteger second){
        if (first == null || second == null)
            return null;
        return first.add(second);
    }
    public static BigDecimal sum(BigDecimal first, BigDecimal second){
        if (first == null || second == null)
            return null;

        return first.add(second);
    }

}
