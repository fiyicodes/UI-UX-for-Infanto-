package com.codedatt.splash;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class toy extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"FROGGIE", "BOXUBE", "ROLUE", "TORTUSE", "BALLIE"};
    String mDescription[] = {"Fun fun, play with me", "Rolling on floor, yay!", "Lets have some fun", "I love to play, it keeps me happy", "Fun stuffs for your baby"};
    int images[] = {R.drawable.toy_1, R.drawable.toy_2, R.drawable.toy_3, R.drawable.toy_4, R.drawable.toy_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toy);

        listView = findViewById(R.id.listView);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
       // toyaa = (ListView) findViewById(R.id.toyA);
        //toyA.setOnClickListener(this);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(toy.this, toy1.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(toy.this, toy2.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(toy.this, toy3.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(toy.this, toy4.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(toy.this, toy5.class);
                    startActivity(intent);
                }
            }
        });
        // so item click is done now check list view
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.activity_toy_row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.activity_toy_row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;
        }
    }
}

