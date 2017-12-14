package net.angrycode.soundrangebar;

import android.content.Context;

/**
 * Created by pc on 2017/11/27.
 */

public class DimensionUtils {
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
