package hnmn3.mechanic.optimist.portfolio;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    //BSpotify,BSuper_Duo,BBuild_It_Bigger,BXYZ_Reader,BCapstone;

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView) findViewById(R.id.tvTitle);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "myfont.ttf");
        title.setTypeface(myTypeface);
    }

    public void BSpotify(View v){
        Toast.makeText(MainActivity.this, "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT).show();
    }

    public void BSuper_Duo(View v){
        Toast.makeText(MainActivity.this, "This button will launch my Super Duo app!", Toast.LENGTH_SHORT).show();
    }

    public void BBuild_It_Bigger(View v){
        Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();
    }

    public void BXYZ_Reader(View v){
        Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
    }

    public void BCapstone(View v){
        Toast.makeText(MainActivity.this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
