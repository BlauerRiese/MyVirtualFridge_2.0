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
        getSupportActionBar().setTitle(button);

        if (button.equals(getString(R.string.text_box01))) {
            toolbar.setBackgroundColor(Color.parseColor("#64dd17"));
        }
        else if (button.equals(getString(R.string.text_box02))) {
            toolbar.setBackgroundColor(Color.parseColor("#fdbc0a"));
        }
        else if (button.equals(getString(R.string.text_box03))) {
            toolbar.setBackgroundColor(Color.parseColor("#d50000"));
        }
        else if (button.equals(getString(R.string.text_box04))) {
            toolbar.setBackgroundColor(Color.parseColor("#03a9f4"));
        }
        else if (button.equals(getString(R.string.text_box05))) {
            toolbar.setBackgroundColor(Color.parseColor("#ce93d8"));
        }
        else if (button.equals(getString(R.string.text_box06))) {
            toolbar.setBackgroundColor(Color.parseColor("#00e5ff"));
        }
        else if (button.equals(getString(R.string.text_box07))) {
            toolbar.setBackgroundColor(Color.parseColor("#cddc39"));
        }
        else if (button.equals(getString(R.string.text_box08))) {
            toolbar.setBackgroundColor(Color.parseColor("#ffff00"));
        }
        else if (button.equals(getString(R.string.text_box09))) {
            toolbar.setBackgroundColor(Color.parseColor("#ff80ab"));
        }
        else if (button.equals(getString(R.string.text_box10))) {
            toolbar.setBackgroundColor(Color.parseColor("#b0bec5"));
        }
        else if (button.equals(getString(R.string.text_box11))) {
            toolbar.setBackgroundColor(Color.parseColor("#1de9b6"));
        }
    }
}
