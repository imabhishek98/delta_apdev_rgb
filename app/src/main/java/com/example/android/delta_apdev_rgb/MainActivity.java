package com.example.android.delta_apdev_rgb;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    int r = 0, g = 0, b = 0;


    public static final String PREFS_NAME = "MyPrefsFile";
    public static final String PREFS_NAME2 = "MyPrefsFile2";
    public static final String PREFS_NAME3 = "MyPrefsFile3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        SharedPreferences color1 = getSharedPreferences(PREFS_NAME, 0);


        r=color1.getInt("r",r);
        SharedPreferences color2 = getSharedPreferences(PREFS_NAME2, 0);
        g=color2.getInt("g",g);
        SharedPreferences color3 = getSharedPreferences(PREFS_NAME3, 0);
        b= color3.getInt("b",b);




        String rr = "" + r;
        Button rb = (Button) findViewById(R.id.rvalue);
        rb.setText(rr);
        String gg = "" + g;
        Button gb = (Button) findViewById(R.id.gvalue);
        gb.setText(gg);
        String bb = "" + b;
        Button bbb = (Button) findViewById(R.id.bvalue);
        bbb.setText(bb);


        LinearLayout back2= (LinearLayout) findViewById(R.id.mainview);

        back2.setBackgroundColor(Color.rgb(r,g,b));
    }


    public  void red_change(View v){
            if(r== 255)
                r= -40;

        r+=40;

        if(r>256)
            r=255;

        LinearLayout back2= (LinearLayout) findViewById(R.id.mainview);

        back2.setBackgroundColor(Color.rgb(r,g,b));
        rDisplay();

    SharedPreferences color1 = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = color1.edit();
        editor.putInt("r",r);
        editor.commit();


    }

    public  void green_change(View v){

            if(g == 255)
                g = -40;
        g+=40;

        if(g>256)
            g=255;
        LinearLayout back2= (LinearLayout) findViewById(R.id.mainview);

        back2.setBackgroundColor(Color.rgb(r,g,b));

        gDisplay();

        SharedPreferences color2 = getSharedPreferences(PREFS_NAME2, 0);
        SharedPreferences.Editor editor2 = color2.edit();
        editor2.putInt("g",g);
        editor2.commit();


    }

    public  void blue_change(View v){

        if(b==255)
            b=-40;
        b+=40;

        if(b>256)
            b=255;
        LinearLayout back2= (LinearLayout) findViewById(R.id.mainview);

        back2.setBackgroundColor(Color.rgb(r,g,b));

        bDisplay();

        SharedPreferences color3 = getSharedPreferences(PREFS_NAME3,0);
        SharedPreferences.Editor editor3 = color3.edit();
        editor3.putInt("b",b);
        editor3.commit();
    }
    public void reset(View v){
        r=g=b=0;

        rDisplay();
        gDisplay();
        bDisplay();
        LinearLayout back2= (LinearLayout) findViewById(R.id.mainview);

        back2.setBackgroundColor(Color.rgb(r,g,b));

        SharedPreferences color1 = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = color1.edit();
        editor.putInt("r",r);
        editor.commit();
        SharedPreferences color2 = getSharedPreferences(PREFS_NAME2, 0);
        SharedPreferences.Editor editor2 = color2.edit();
        editor2.putInt("g",g);
        editor2.commit();
        SharedPreferences color3 = getSharedPreferences(PREFS_NAME3,0);
        SharedPreferences.Editor editor3 = color3.edit();
        editor3.putInt("b",b);
        editor3.commit();
    }

    private void rDisplay()
    {
        String rr = "" + r;
        Button rb = (Button) findViewById(R.id.rvalue);
        rb.setText(rr);

    }

    private void gDisplay()
    {
        String gg = "" + g;
        Button gb = (Button) findViewById(R.id.gvalue);
        gb.setText(gg);
    }

    private void bDisplay()
    {
        String bb = "" + b;
        Button bbb = (Button) findViewById(R.id.bvalue);
        bbb.setText(bb);
    }


}
