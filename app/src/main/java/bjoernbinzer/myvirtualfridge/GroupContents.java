package bjoernbinzer.myvirtualfridge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class GroupContents{

    public class FruitContent extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            this.setContentView(R.layout.activity_fruit_content);

            Intent intent = getIntent();
        }
    }
    public class VegetableContent extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_vegetable_content);

            Intent intent = getIntent();
        }
    }
    public class MeatFishContent extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_meat_fish_content);

            Intent intent = getIntent();
        }
    }
    public class BeveragesContent extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_beverages_content);

            Intent intent = getIntent();
        }
    }
    public class SpiceryContent extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_spicery_content);

            Intent intent = getIntent();
        }
    }
}
