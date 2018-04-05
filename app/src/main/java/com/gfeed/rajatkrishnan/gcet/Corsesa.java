package com.gfeed.rajatkrishnan.gcet;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;




import br.com.bloder.magic.view.MagicButton;


/**
 * Created by user on 09-09-2017.
 */
public class Corsesa extends AppCompatActivity {
   MagicButton magicButton,magiz;
    Button ba;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.corsesa);
        ba=(Button)findViewById(R.id.mb4);
 magicButton=(MagicButton)findViewById(R.id.mb);
       magiz=(MagicButton)findViewById(R.id.mb1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bnm);
        ba.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
        magicButton.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Corsesa.this, free.class);
                startActivity(p);
            }
        });
        magiz.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(Corsesa.this, certified.class);
                startActivity(q);
            }
        });


        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}



