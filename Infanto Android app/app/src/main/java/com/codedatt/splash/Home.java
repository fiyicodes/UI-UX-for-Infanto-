package com.codedatt.splash;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class Home extends AppCompatActivity  implements  View.OnClickListener{
    private CardView  Toys, Diapers, Clothe, Shoe, Bottle, Food, Bed, Lotion, Powder, Stroller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Defining cards
        Toys = (CardView) findViewById(R.id.toys);
        Diapers = (CardView) findViewById(R.id.diapers);
        Clothe = (CardView) findViewById(R.id.clothe);
        Shoe = (CardView) findViewById(R.id.shoe);
        Bottle = (CardView) findViewById(R.id.bottle);
        Food = (CardView) findViewById(R.id.food);
//        Bed = (CardView) findViewById(R.id.bed);
//        Lotion = (CardView) findViewById(R.id.lotion);
//        Powder = (CardView) findViewById(R.id.powder);
//        Stroller = (CardView) findViewById(R.id.stroller);
        // Add Click Listener to the cards
        Toys.setOnClickListener(this);
        Diapers.setOnClickListener(this);
        Clothe.setOnClickListener(this);
        Shoe.setOnClickListener(this);
        Bottle.setOnClickListener(this);
        Food.setOnClickListener(this);
//        Bed.setOnClickListener(this);
//        Lotion.setOnClickListener(this);
//        Powder.setOnClickListener(this);
//        Stroller.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.toys : i = new Intent(this, toy.class); startActivity(i); break ;
            case R.id.diapers : i = new Intent(this, diaper.class);  startActivity(i); break ;
            case R.id.clothe : i = new Intent(this, clothe.class);  startActivity(i); break ;
            case R.id.shoe : i = new Intent(this, shoe.class) ;  startActivity(i); break ;
            case R.id.bottle : i = new Intent(this, bottle.class);  startActivity(i); break ;
            case R.id.food : i = new Intent(this, food.class);  startActivity(i); break ;
//            case R.id.bed : i = new Intent(this, bed.class);  startActivity(i);break ;
//            case R.id.lotion : i = new Intent(this, lotion.class); startActivity(i); break ;
//            case R.id.powder: i = new Intent(this, powder.class);  startActivity(i);break ;
//            case R.id.stroller : i = new Intent(this, stroller.class);  startActivity(i);break ;
            default: break;
        }

    }
}
