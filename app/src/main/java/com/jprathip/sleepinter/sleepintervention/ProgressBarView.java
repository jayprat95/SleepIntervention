package com.jprathip.sleepinter.sleepintervention;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class ProgressBarView extends View {


    private Paint mCirclePaint;
    private Paint mRectPaint;

    public ProgressBarView(Context context) {
        super(context);
        init();
    }


    public ProgressBarView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    public ProgressBarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        init();

    }

    private void init() {
        Context context = getContext();
        int circleColor =  ContextCompat.getColor(context, android.R.color.holo_blue_light);
        int rectColor =  ContextCompat.getColor(context, android.R.color.darker_gray);

        mCirclePaint = new Paint();
        mCirclePaint.setColor(circleColor);

        mRectPaint = new Paint();
        mRectPaint.setColor(rectColor);
    }




    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Context context = getContext();

        int contentWidth = getWidth();
        int rectStartX = 0;
        int rectStartY = 12;
        int rectWidth = contentWidth/2;
        int rectHeight = 25;
        canvas.save();
        canvas.clipRect(
                rectStartX,
                rectStartY,
                rectStartX + rectWidth,
                rectStartY + rectHeight);
        canvas.translate(rectStartX, rectStartY);

        // Draw the visual element
        canvas.drawRect(0, 0, rectWidth, rectHeight, mRectPaint);

        canvas.restore();

        canvas.drawCircle(25, 25, 25, mCirclePaint);

        canvas.drawCircle(50, 25, 25, mCirclePaint);

        canvas.drawCircle(25, 25, 25, mCirclePaint);




    }

}
