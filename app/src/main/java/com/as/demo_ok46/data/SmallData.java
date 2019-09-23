package com.as.demo_ok46.data;

/**
 * -----------------------------
 * Created by zqf on 2019/9/23.
 * ---------------------------
 */
public class SmallData  {

    private boolean isShow;
    private int drawable;

    public SmallData(boolean isShow, int drawable) {
        this.isShow = isShow;
        this.drawable = drawable;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
