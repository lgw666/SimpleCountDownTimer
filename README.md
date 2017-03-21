# SimpleCountDownTimer

 * A simple h，min，sec and ms count down timer.
 * Author： Luo Guowen Email:<a href="#">luoguowen123@qq.com</a>
 
 ![image](https://github.com/lgw666/SimpleCountDownTimerDemo/blob/master/SimpleCountDownTimerDemo.gif)

 * Setup

   Step 1. Add the JitPack repository to your build file Add it in your root build.gradle at the end of repositories:
            
             allprojects {
                    		repositories {
                    			...
                    			maven { url 'https://jitpack.io' }
                    		}
                    	}
                    	
   Step 2. Add the dependency：
   
             dependencies {
             	        compile 'com.github.lgw666:SimpleCountDownTimer:1.1'
             	}
 * Usage

   Simple show :

   `new SimpleCountDownTimer(totalTime,textView).start();`

   Custom interval time:

   `new SimpleCountDownTimer(totalTime,intervalTime,textView).start();`

   Do something after finished:
   ```
   new SimpleCountDownTimer(totalTime, tvDisplay).setOnFinishListener(new SimpleCountDownTimer.OnFinishListener() {
             @Override
             public void onFinish() {
             do something...
             }
         }).start();
   ```
 * Other methods
 
   synchronized final CountDownTimer start(); Start the countdown.

   final void cancel(); Cancel the countdown.
   
   <h4>If you want to know more:</h4>[More details](https://developer.android.google.cn/reference/android/os/CountDownTimer.html)

 
         