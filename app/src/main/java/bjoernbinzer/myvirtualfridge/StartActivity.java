package bjoernbinzer.myvirtualfridge;

import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddFridgeItem(view);
            }
        });
        FridgeDB.createFridgeDB(this);

        Button vegetableButton = (Button)findViewById(R.id.leftUpperFridge);
        vegetableButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVegetableContent(view);
            }
        });

        Button fruitButton = (Button)findViewById(R.id.leftUpperMiddleFridge);
        fruitButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFruitContent(view);
            }
        });

        Typeface robotoRegular = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Regular.ttf");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);
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

    public void openAddFridgeItem(View view) {
        Intent intent = new Intent(this, AddFridgeItem.class);
        startActivity(intent);
    }
    public void openVegetableContent(View view) {
        Intent intent = new Intent(this, VegetableContent.class);
        startActivity(intent);
    }
    public void openFruitContent(View view) {
        Intent intent = new Intent(this, VegetableContent.class);
        startActivity(intent);
    }
}
