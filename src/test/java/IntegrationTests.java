import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by Charat.Kakkar on 8/14/2017.
 */
public class IntegrationTests {

    @Test
    public void test1(){
        boolean testVaribale= true;
        Random rand = new Random();
        if(!rand.nextBoolean()){
            testVaribale=false;
        }

        Assert.assertTrue("testVariable is set to false", testVaribale);

    }

}