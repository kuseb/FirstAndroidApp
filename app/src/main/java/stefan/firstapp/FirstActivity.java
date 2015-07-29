package stefan.firstapp;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FirstActivity extends ActionBarActivity {

    private  FactBook fB=new FactBook();
    private ColorWheel cW=new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        final Toast t=Toast.makeText(this, "Toast", Toast.LENGTH_LONG);
        // Declare our view variables
        final TextView factLabel=(TextView) findViewById(R.id.factTextView);
        Button showFactButton= (Button) findViewById(R.id.showFactButton);
        final RelativeLayout rL=(RelativeLayout) findViewById(R.id.relativeLayout);

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // update fact label

                factLabel.setText(fB.getFact());

                rL.setBackgroundColor(cW.getColor());
                t.show();
            }
        });

    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
