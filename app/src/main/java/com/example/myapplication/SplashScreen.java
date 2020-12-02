package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * -Crea un activity con una animacion y arranca el login
 * @author Ivi
 * @see LoginActivity
 */

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TextView myTitle = (TextView)findViewById(R.id.textView3);
        TextView mySubtitle = (TextView)findViewById(R.id.textView4);
        ImageView myImage = (ImageView)findViewById(R.id.imageView);

//        // sets a Pretty Custom Font
//        Typeface myFont = Typeface.createFromAsset(getAssets(), "bromello.otf");
//        myTitle.setTypeface(myFont);

        //Typeface typeface = getResources().getFont(R.font.bromello);
        //myTitle.setTypeface(typeface);

        //implements and starts animation
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.shake);

        myImage.startAnimation(myanim);
        mySubtitle.startAnimation(myanim2);
        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }

}
