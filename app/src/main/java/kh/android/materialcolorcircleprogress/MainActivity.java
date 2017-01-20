package kh.android.materialcolorcircleprogress;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import kh.android.colorcircleprogress.ColorCircleProgress;

public class MainActivity extends Activity implements View.OnClickListener{
    private ColorCircleProgress mProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgress = (ColorCircleProgress)findViewById(R.id.progress);
        findViewById(R.id.button_color_black).setOnClickListener(this);
        findViewById(R.id.button_color_colorful).setOnClickListener(this);
        findViewById(R.id.button_start).setOnClickListener(this);
        findViewById(R.id.button_stop).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_color_black :
                mProgress.setColors(Color.BLACK);
                break;
            case R.id.button_color_colorful :
                mProgress.setColors(ColorCircleProgress.MATERIAL_COLOR);
                break;
            case R.id.button_start :
                mProgress.start();
                break;
            case R.id.button_stop :
                mProgress.stop();
                break;
        }
    }
}
