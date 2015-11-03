package bjoernbinzer.myvirtualfridge;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FridgeDB.createFridgeDB(this);
        Typeface robotoRegular = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Regular.ttf");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddFridgeItem(view);
            }
        });

        LinearLayout vegetableButton = (LinearLayout)findViewById(R.id.linearLayoutVegetables);
        vegetableButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = ((TextView) findViewById(R.id.textViewVegetables)).getText().toString();
                openListItem(view, category);
            }
        });

        LinearLayout fruitButton = (LinearLayout)findViewById(R.id.linearLayoutFruits);
        fruitButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = ((TextView) findViewById(R.id.textViewFruits)).getText().toString();
                openListItem(view, category);
            }
        });

        LinearLayout meatFishButton = (LinearLayout)findViewById(R.id.linearLayoutMeat);
        meatFishButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = ((TextView) findViewById(R.id.textViewMeat)).getText().toString();
                openListItem(view, category);
            }
        });

        LinearLayout beveragesButton = (LinearLayout)findViewById(R.id.linearLayoutBeverages);
        beveragesButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = ((TextView) findViewById(R.id.textViewBeverages)).getText().toString();
                openListItem(view, category);
            }
        });

        LinearLayout spiceryButton = (LinearLayout)findViewById(R.id.linearLayoutSpicery);
        spiceryButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = ((TextView) findViewById(R.id.textViewSpicery)).getText().toString();
                openListItem(view, category);
            }
        });

        LinearLayout frozenButton = (LinearLayout)findViewById(R.id.linearLayoutFrozen);
        frozenButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = ((TextView) findViewById(R.id.textViewFrozen)).getText().toString();
                openListItem(view, category);
            }
        });

        LinearLayout dressingsButton = (LinearLayout)findViewById(R.id.linearLayoutDressings);
        dressingsButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = ((TextView) findViewById(R.id.textViewDressings)).getText().toString();
                openListItem(view, category);
            }
        });

        LinearLayout cerealsButton = (LinearLayout)findViewById(R.id.linearLayoutCereals);
        cerealsButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = ((TextView) findViewById(R.id.textViewCereals)).getText().toString();
                openListItem(view, category);
            }
        });

        LinearLayout snacksButton = (LinearLayout)findViewById(R.id.linearLayoutSnacks);
        snacksButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = ((TextView) findViewById(R.id.textViewSnacks)).getText().toString();
                openListItem(view, category);
            }
        });

        LinearLayout milkButton = (LinearLayout)findViewById(R.id.linearLayoutMilk);
        milkButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = ((TextView) findViewById(R.id.textViewMilk)).getText().toString();
                openListItem(view, category);
            }
        });

        LinearLayout othersButton = (LinearLayout)findViewById(R.id.linearLayoutOthers);
        othersButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = ((TextView) findViewById(R.id.textViewOthers)).getText().toString();
                openListItem(view, category);
            }
        });
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
        Intent intent = new Intent(this, GroupContents.FruitContent.class);
        startActivity(intent);
    }
    public void openMeatFishContent(View view) {
        Intent intent = new Intent(this, GroupContents.MeatFishContent.class);
        startActivity(intent);
    }
    public void openBeveragesContent(View view) {
        Intent intent = new Intent(this, GroupContents.BeveragesContent.class);
        startActivity(intent);
    }

    public void openListItem(View view, String category) {
        Intent intent = new Intent(this, ItemList.class);
        intent.putExtra(new String("Button"), category);
        startActivity(intent);
    }
}
