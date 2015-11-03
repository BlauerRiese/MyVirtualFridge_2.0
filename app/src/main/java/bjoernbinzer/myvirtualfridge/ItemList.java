package bjoernbinzer.myvirtualfridge;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ItemList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String button = intent.getStringExtra("Button");

        switch(button){
            case "Gemüse":
                toolbar.setBackgroundColor(Color.parseColor("#64dd17"));
                break;
            case "Obst":
                toolbar.setBackgroundColor(Color.parseColor("#fdbc0a"));
                break;
            case "Fleisch und Fisch":
                toolbar.setBackgroundColor(Color.parseColor("#d50000"));
                break;
            case "Milch- und Eierprodukte":
                toolbar.setBackgroundColor(Color.parseColor("#b0bec5"));
                break;
            case "Tiefkühl":
                toolbar.setBackgroundColor(Color.parseColor("#00e5ff"));
                break;
            case "Getreide- und Kornprodukte":
                toolbar.setBackgroundColor(Color.parseColor("#ffff00"));
                break;
            case "Saucen, Dressings, Öle":
                toolbar.setBackgroundColor(Color.parseColor("#cddc39"));
                break;
            case "Gewürze":
                toolbar.setBackgroundColor(Color.parseColor("#ce93d8"));
                break;
            case "Getränke":
                toolbar.setBackgroundColor(Color.parseColor("#03a9f4"));
                break;
            case "Snacks":
                toolbar.setBackgroundColor(Color.parseColor("#ff80ab"));
                break;
            case "Sonstiges":
                toolbar.setBackgroundColor(Color.parseColor("#1de9b6"));
                break;

        }
    }
}
