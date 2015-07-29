package stefan.firstapp;

import java.util.Random;

/**
 * Created by Sebastian on 2015-07-27.
 */
public class FactBook {
    public String[] facts={"Spierdalaj", "bo sie wylacze", "pa"};

    public String getFact()
    {

        Random randomGenerator=new Random();
        int randomNumber=randomGenerator.nextInt(3);

        return facts[randomNumber];
    }
}
