package com.example.android.applicationfrommybrain;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openDoor (View view ) {
        ImageView beforeDoorImageView = (ImageView) findViewById(R.id.before_image_view);
        beforeDoorImageView.setImageResource(R.drawable.after);
        TextView statusFirstTextView = (TextView) findViewById(R.id.status_text_view);
        statusFirstTextView.setText("The door is opened");
    }
    public void openDoorBlack(View view) {
        ImageView beforeDoorImageView2 = (ImageView) findViewById(R.id.before_black_image_view);
        beforeDoorImageView2.setImageResource(R.drawable.after_blackdoor);
        TextView statusSecondTextView = (TextView) findViewById(R.id.status_text_view);
        statusSecondTextView.setText("The black door is opened");
    }
    public void openDoorRed(View view) {
        ImageView beforeDoor3ImageView = (ImageView) findViewById(R.id.before_red_image_view);
        beforeDoor3ImageView.setImageResource(R.drawable.after_reddoor);
        TextView status3FirstTextView = (TextView) findViewById(R.id.status_text_view);
        status3FirstTextView.setText("The red door is opened");
    }
    public void openWhiteDoor (View view ) {
        ImageView beforeDoorImageView4 = (ImageView) findViewById(R.id.before_white_image_view);
        beforeDoorImageView4.setImageResource(R.drawable.after_whitedoor);
        TextView statusSecondTextView4 = (TextView) findViewById(R.id.status_text_view);
        statusSecondTextView4.setText("The white door is opened");


    }
}
