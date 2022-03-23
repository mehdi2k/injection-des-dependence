package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void testsomme(){
        Calcul calcul =new Calcul();
        int a=5,b=6;
        int expected =11;
        int res=calcul.somme(a,b);
        Assert.assertTrue(res==expected);

    }
}
