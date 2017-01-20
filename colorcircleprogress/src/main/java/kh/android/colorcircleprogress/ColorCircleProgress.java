package kh.android.colorcircleprogress;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by liangyuteng0927 on 17-1-20.
 * Email: liangyuteng12345@gmail.com
 */

public class ColorCircleProgress extends ImageView{
    private MaterialProgressDrawable mProgress;
    private boolean mUserStartState = true;
    public static final int[] MATERIAL_COLOR = {
            Color.parseColor("#FFC93437")
            , Color.parseColor("#FF375BF1")
            , Color.parseColor("#FFF7D23E")
            , Color.parseColor("#FF34A350")
    };

    public ColorCircleProgress(Context context) {
        super(context);
        start();
    }

    public ColorCircleProgress(Context context, AttributeSet attrs) {
        super(context, attrs);
        start();
    }

    public void setColors (@ColorInt int... colors) {
        mProgress.setColorSchemeColors(colors);
    }
    public void start () {
        if (mProgress == null)
            mProgress = new MaterialProgressDrawable(getContext(), this);
        mProgress.setAlpha(255);
        mProgress.updateSizes(MaterialProgressDrawable.HUGE);
        mProgress.start();
        setImageDrawable(mProgress);
        mUserStartState = true;
    }
    public void stop () {
        if (mProgress == null)
            mProgress = new MaterialProgressDrawable(getContext(), this);
        mUserStartState = false;
        mProgress.stop();
    }
    @Override
    public void setVisibility (int visibility) {
        super.setVisibility(visibility);
        if (visibility == View.VISIBLE) {
            if (mUserStartState)
                mProgress.start();
        } else {
            if (!mUserStartState)
                mProgress.stop();
        }
    }
}
