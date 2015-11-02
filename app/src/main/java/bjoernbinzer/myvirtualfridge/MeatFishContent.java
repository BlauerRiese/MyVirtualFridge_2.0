package bjoernbinzer.myvirtualfridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MeatFishContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat_fish_content);

        Intent intent = getIntent();

        LinearLayout meatFishButton = (LinearLayout) findViewById(R.id.rightUpperFridge);
        meatFishButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMeatFishContent(view);
            }
        });
    }

    public void openMeatFishContent(View view) {
        Intent intent = new Intent(this, MeatFishContent.class);
        startActivity(intent);
    }
}