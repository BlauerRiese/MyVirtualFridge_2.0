package bjoernbinzer.myvirtualfridge;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class FruitContent extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_fruit_content);

        Intent intent = getIntent();

        LinearLayout fruitButton = (LinearLayout)findViewById(R.id.leftUpperMiddleFridge);
        fruitButton.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFruitContent(view);
            }
        });
    }

    public void openFruitContent(View view) {
        Intent intent = new Intent(this, FruitContent.class);
        startActivity(intent);
    }
}
