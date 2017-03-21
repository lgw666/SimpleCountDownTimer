package com.gavinrowe.lgw.simplecountdowntimer;

import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * 简单 时，分，秒，毫秒倒计时
 *
 * @author Luo Guowen Email:<a href="#">luoguowen123@qq.com</a>
 *         <p>
 *         精确到毫秒
 */

public class SimpleCountDownTimer extends CountDownTimer {
    // 默认倒计时间隔
    private static final long DEFAULT_INTERVAL = 100L;

    /**
     * 秒，分，时对应的毫秒数
     */
    private int sec = 1000, min = sec * 60, hr = min * 60;

    /**
     * 显示时间的视图
     */
    private TextView tvDisplay;

    /**
     * 结束监听
     */
    private static OnFinishListener onFinishListener;

    /**
     * @param millisInFuture    倒计时总时间 单位：毫秒
     *                          The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval 倒计时间隔 单位：毫秒
     *                          The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     * @param tvDisplay         显示时间的视图
     */
    public SimpleCountDownTimer(long millisInFuture, long countDownInterval, TextView tvDisplay) {
        super(millisInFuture, countDownInterval);
        this.tvDisplay = tvDisplay;
    }

    /**
     * @param millisInFuture    倒计时总时间 单位：毫秒
     *                          The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     *
     * @param tvDisplay         显示时间的视图
     */
    public SimpleCountDownTimer(long millisInFuture, TextView tvDisplay) {
        super(millisInFuture, DEFAULT_INTERVAL);
        this.tvDisplay = tvDisplay;
    }

    /**
     * 每一次间隔时间到后调用
     *
     * @param millisUntilFinished 剩余总时间 单位：毫秒
     */
    @Override
    public void onTick(long millisUntilFinished) {
        // 剩余的小时，分钟，秒，毫秒
        long lHr = millisUntilFinished / hr;
        long lMin = (millisUntilFinished - lHr * hr) / min;
        long lSec = (millisUntilFinished - lHr * hr - lMin * min) / sec;
        long lMs = millisUntilFinished - lHr * hr - lMin * min - lSec * sec;
        String strLHr = getTime(lHr);
        String strLMin = getTime(lMin);
        String strLSec = getTime(lSec);
        String strLMs = getMs(lMs);
        // 依次拼接时间 时:分:秒:毫秒
        tvDisplay.setText(strLHr + ":" + strLMin + ":" + strLSec + ":" + strLMs);

    }

    /**
     * 根据毫秒换算成相应单位后是否大于10来返回相应时间
     */
    private String getTime(long time) {
        return time > 10 ? String.valueOf(time) : "0" + time;
    }

    /**
     * 获取毫秒
     */
    private String getMs(long time) {
        String strMs = String.valueOf(time);
        return time > 100 ? strMs.substring(0, strMs.length() - 1) : "00";
    }

    /**
     * 结束监听，可以在倒计时结束时做一些事
     */
    public interface OnFinishListener {
        void onFinish();
    }

    /**
     * 设置结束监听
     *
     * @param onFinishListener 结束监听对象
     */
    public SimpleCountDownTimer setOnFinishListener(OnFinishListener onFinishListener) {
        SimpleCountDownTimer.onFinishListener = onFinishListener;
        return this;
    }

    /**
     * 倒计时结束时调用
     */
    @Override
    public void onFinish() {
        tvDisplay.setText(R.string.default_time);
        if (onFinishListener != null)
            onFinishListener.onFinish();
    }


}
