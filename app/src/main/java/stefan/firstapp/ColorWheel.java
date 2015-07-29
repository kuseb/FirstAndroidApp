package stefan.firstapp;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Sebastian on 2015-07-27.
 */
public class ColorWheel {
    public String[] colors={"#39add1", "#3079ab","#b7c0c7"};

    public int getColor()
    {
        Random r=new Random();
        return Color.parseColor(colors[r.nextInt(colors.length)]);
    }
}
