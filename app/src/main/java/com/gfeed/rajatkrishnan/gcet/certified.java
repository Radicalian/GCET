package com.gfeed.rajatkrishnan.gcet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;



import br.com.bloder.magic.view.MagicButton;

/**
 * Created by user on 09-09-2017.
 */
public class certified extends AppCompatActivity {
    MagicButton magicButtona,magiza,z;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.certified);
        z=(MagicButton)findViewById(R.id.action_button);
        magicButtona=(MagicButton)findViewById(R.id.action_button1);
        magiza=(MagicButton)findViewById(R.id.action_button2);

        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }
        z.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(certified.this, Courses.class);
                startActivity(c);
            }
        });
        magicButtona.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(certified.this, udemy.class);
                startActivity(p);
            }
        });
        magiza.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(certified.this,upskill.class);
                startActivity(q);
            }
        });

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
