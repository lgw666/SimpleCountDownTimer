# SimpleCountDownTimer

 * 一个简单的 时、分、秒，毫秒倒计时。
 * 作者： 罗国文 Email:<a href="#">luoguowen123@qq.com</a>
 
 ![image](https://github.com/lgw666/SimpleCountDownTimerDemo/blob/master/SimpleCountDownTimerDemo.gif)
 * ### 设置
   Step 1. 添加JitPack到你的Project的build.gradle:
            
             allprojects {
                    		repositories {
                    			...
                    			maven { url 'https://jitpack.io' }
                    		}
                    	}
                    	
   Step 2. 添加依赖：
   
             dependencies {
             	        compile 'com.github.lgw666:SimpleCountDownTimer:1.1'
             	}
 * ### 使用方法
   简单显示:

   `new SimpleCountDownTimer(totalTime,textView).start();`

   自定义间隔时间:

   `new SimpleCountDownTimer(totalTime,intervalTime,textView).start();`

   设置倒计时结束时要做的事:
   ```
   new SimpleCountDownTimer(totalTime, tvDisplay).setOnFinishListener(new SimpleCountDownTimer.OnFinishListener() {
             @Override
             public void onFinish() {
             do something...
             }
         }).start();
   ```
 * ### 其他方法
 
   synchronized final CountDownTimer start(); 开始倒计时。

   final void cancel(); 关闭倒计时。
   
   ### [查看更多](https://developer.android.google.cn/reference/android/os/CountDownTimer.html)

 
         
