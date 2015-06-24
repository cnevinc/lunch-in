package com.github.androidatelier.lunchin.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.OvershootInterpolator;
import android.util.Log;

import com.github.androidatelier.lunchin.R;

/**
 * Created by brenda on 6/17/15.
 */
public class MyGoalFragment extends Fragment {
    private static final String TAG = "MyGoalFragment";
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my_goal, container, false);

        imageView = (ImageView) v.findViewById(R.id.dollarView);

        // animation type selection buttons
        // TODO: demo for selecting which animation to use
        Button zoomButton = (Button) v.findViewById(R.id.button1);
        zoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoom(v);
            }
        });

        Button clockwiseButton = (Button) v.findViewById(R.id.button2);
        clockwiseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clockwise(v);
            }
        });

        Button fadeButton = (Button) v.findViewById(R.id.button3);
        fadeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fade(v);
            }
        });

        Button blinkButton = (Button) v.findViewById(R.id.button4);
        blinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blink(v);
            }
        });


        final Button scaleButton = (Button) v.findViewById(R.id.button5);
        // Listener on Button sendButton
        scaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scaleAnimateSelectImageView(imageView);
            }
        });

/*
        // Frame by frame animation
        // Type casting the Image View
        final ImageView animationView=(ImageView)v.findViewById(R.id.raining_money);

        // Do not show animated images
        animationView.setVisibility(ImageView.INVISIBLE);

        // Setting animation_list.xml as the background of the image view
       // animationView.setBackgroundResource(R.drawable.animation_list);

        final AnimationDrawable rainingMoneyAnimation=(AnimationDrawable)animationView.getBackground();

        Button showButton = (Button) v.findViewById(R.id.visible_button);
        // Listener on Button sendButton
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the animated images visible
                animationView.setVisibility(ImageView.VISIBLE);
            }
        });
        Button hideButton = (Button) v.findViewById(R.id.invisible_button);
        // Listener on Button sendButton
        hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the animated images visible
                animationView.setVisibility(ImageView.INVISIBLE);
            }
        });

        // Animation On Button
        Button onButton = (Button) v.findViewById(R.id.on_button);
        // Listener on Button sendButton
        onButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!rainingMoneyAnimation.isRunning())
                    rainingMoneyAnimation.start();
            }
        });
        // Animation Off Button
        Button offButton = (Button) v.findViewById(R.id.off_button);
        // Listener on Button sendButton
        offButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rainingMoneyAnimation.isRunning())
                    rainingMoneyAnimation.stop();
            }
        });
*/
        return v;
    }

    // animation
    public void zoom(View view) {
        //ImageView image = (ImageView)view.findViewById(R.id.dollarView);
        Animation animation = AnimationUtils.loadAnimation(view.getContext().getApplicationContext(), R.anim.zoom);
        imageView.startAnimation(animation);
    }

    public void clockwise(View view) {
        //ImageView image = (ImageView)view.findViewById(R.id.imageView);
        Animation animation1 = AnimationUtils.loadAnimation(view.getContext().getApplicationContext(), R.anim.clockwise);
        imageView.startAnimation(animation1);
    }

    public void fade(View view) {
        //ImageView image = (ImageView)view.findViewById(R.id.imageView);
        Animation animation1 = AnimationUtils.loadAnimation(view.getContext().getApplicationContext(), R.anim.fade);
        imageView.startAnimation(animation1);
    }

    public void blink(View view) {
        //ImageView image = (ImageView)view.findViewById(R.id.imageView);
        Animation animation1 = AnimationUtils.loadAnimation(view.getContext().getApplicationContext(), R.anim.blink);
        imageView.startAnimation(animation1);

    }

    private void scaleAnimateSelectImageView(ImageView imageView)
    {
        Log.v(TAG, "animateSelectButton");
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.2f, 0.1f, 1.2f, Animation.RELATIVE_TO_SELF, (float)0.5, Animation.RELATIVE_TO_SELF, (float)0.5);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setFillEnabled(true);
        scaleAnimation.setDuration(800);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
        scaleAnimation.setRepeatMode(Animation.RESTART);
        scaleAnimation.setInterpolator(new OvershootInterpolator(6f));
        imageView.startAnimation(scaleAnimation);
    }
}