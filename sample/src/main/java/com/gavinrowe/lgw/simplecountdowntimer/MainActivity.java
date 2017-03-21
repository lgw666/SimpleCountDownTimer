package com.gavinrowe.lgw.simplecountdowntimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 倒计时Demo
 *
 * @author Luo Guowen Email:<a href="#">luoguowen123@qq.com</a>
 *         <p>
 *         精确到毫秒
 */
public class MainActivity extends AppCompatActivity {

    // 倒计时间隔
    private static final long INTERVAL = 100L;

    private TextView tvDisplay;
    private EditText etTotalTime;
    private SimpleCountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = (TextView) findViewById(R.id.tv_display);
        etTotalTime = (EditText) findViewById(R.id.et_total_time);
        // 总时间
        long totalTime = 5000;
        // 初始化并启动倒计时
        new SimpleCountDownTimer(totalTime, tvDisplay).setOnFinishListener(new SimpleCountDownTimer.OnFinishListener() {
            @Override
            public void onFinish() {

            }
        }).start();
    }

    // Start按钮点击时间
    public void onStartClick(View view) {
        // 获取输入的总时间
        String strTotalTime = etTotalTime.getText().toString();
        if (!strTotalTime.isEmpty()) {
            long totalTime = Long.parseLong(strTotalTime);
            countDownTimer.cancel();
            countDownTimer = new SimpleCountDownTimer(totalTime, tvDisplay);
            countDownTimer.start();
        } else {
            Toast.makeText(this, "请输入正确的时间！", Toast.LENGTH_SHORT).show();
        }
    }
}
