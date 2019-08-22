package com.commit451.nativestackblur.sample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import hugo.weaving.DebugLog;
import io.alterac.blurkit.BlurKit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    ImageView mImage;
    ImageView mBlurredImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImage = (ImageView) findViewById(R.id.image);
        mBlurredImage = (ImageView) findViewById(R.id.blurredImage);
        Glide.with(this)
                .load("https://www.androidcentral.com/sites/androidcentral.com/files/styles/large/public/article_images/2014/10/lollipop-statue-2.jpg")
                .transform(new MyTransformation2(25))
                .into(mImage);

        Glide.with(this)
                .load("https://www.androidcentral.com/sites/androidcentral.com/files/styles/large/public/article_images/2014/10/lollipop-statue-2.jpg")
                .transform(new MyTransformation(25))
                .into(mBlurredImage);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
