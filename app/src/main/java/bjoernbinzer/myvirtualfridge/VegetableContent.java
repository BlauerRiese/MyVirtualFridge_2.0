package bjoernbinzer.myvirtualfridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class VegetableContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable_content);

        Intent intent = getIntent();

        Button vegetableButton = (Button)findViewById(R.id.buttonVegetable);
        vegetableButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVegetableContent(view);
            }
        });
    }

    public void openVegetableContent(View view) {
        Intent intent = new Intent(this, VegetableContent.class);
        startActivity(intent);
    }
}
