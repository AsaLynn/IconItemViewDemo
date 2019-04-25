package com.zxn.iconitemview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * 条目view.
 * Created by zxn on 2019/4/25.
 */
public class IconItemView extends RelativeLayout {
    protected TextView tvText;
    protected View vLine;
    private Drawable mLeftIconDrawable;
    private Drawable mRightIconDrawable;
    private String mText;
    private int mLineColor;
    private int mTextColor;
    private int mLeftIconPadding;
    private int mRightIconPadding;
    private int mLeftMargin;
    private int mMinimumWidth;

    public IconItemView(Context context) {
        this(context, null);
    }

    public IconItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public IconItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
        initAttributeSet(attrs);
        refreshView();
    }

    private void refreshView() {
        tvText.setCompoundDrawables(mLeftIconDrawable, null, mRightIconDrawable, null);
        if (!TextUtils.isEmpty(mText)) {
            tvText.setText(mText);
        }
        tvText.setTextColor(mTextColor);
        vLine.setBackgroundColor(mLineColor);
        tvText.setCompoundDrawablePadding(mLeftIconPadding);
        tvText.setPadding(0, 0, mRightIconPadding, 0);


        RelativeLayout.LayoutParams layoutParams = (LayoutParams) vLine.getLayoutParams();
        ViewGroup.LayoutParams params = getLayoutParams();
        if (params instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (MarginLayoutParams) params;
            mLeftMargin = marginLayoutParams.leftMargin;
        }
        //int paddingLeft = this.getPaddingLeft();
        int drawablePadding = tvText.getCompoundDrawablePadding();
        layoutParams.leftMargin = mMinimumWidth + drawablePadding + mLeftMargin;
    }

    private void initAttributeSet(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.IconItemView);
        if (null != typedArray) {
            mLeftIconDrawable = typedArray.getDrawable(R.styleable.IconItemView_leftIcon);
            if (null != mLeftIconDrawable) {
                mMinimumWidth = mLeftIconDrawable.getMinimumWidth();
                mLeftIconDrawable.setBounds(0, 0, mLeftIconDrawable.getMinimumWidth(), mLeftIconDrawable.getMinimumHeight());
            }
            mRightIconDrawable = typedArray.getDrawable(R.styleable.IconItemView_rightIcon);
            if (null != mRightIconDrawable) {
                mRightIconDrawable.setBounds(0, 0, mRightIconDrawable.getMinimumWidth(), mRightIconDrawable.getMinimumHeight());
            }
            mText = typedArray.getString(R.styleable.IconItemView_text);
            mLineColor = typedArray.getColor(R.styleable.IconItemView_lineColor, Color.WHITE);
            mTextColor = typedArray.getColor(R.styleable.IconItemView_textColor, Color.BLACK);
            mLeftIconPadding = typedArray.getDimensionPixelSize(R.styleable.IconItemView_leftIconPadding, 0);
            mRightIconPadding = typedArray.getDimensionPixelSize(R.styleable.IconItemView_rightIconPadding, 0);
            typedArray.recycle();
        }

    }

    private void initView() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout_icon_item_view, this);
        tvText = (TextView) findViewById(R.id.tv_text);
        vLine = (View) findViewById(R.id.v_line);
//        isClickable()
//        setClickable(true);
        if (getBackground() == null) {
            setBackgroundResource(R.drawable.bg_d_sc_default);
        }
    }
}
