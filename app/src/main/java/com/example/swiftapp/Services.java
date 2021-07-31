package com.example.swiftapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class Services extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid){
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final  int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Services.this,ActivityOne.class);
                    intent.putExtra("info","This is activity from card item index" +finalI);
                    startActivity(intent);
                }
            });
        }
    }

}



