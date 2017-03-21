# SimpleCountDownTimer

 ### [中文版]( https://github.com/lgw666/SimpleCountDownTimer/blob/master/README-CN.md)

 * A simple h，min，sec and ms count down timer.
 * Author： Luo Guowen Email:<a href="#">luoguowen123@qq.com</a>
 
  
 ![image](https://github.com/lgw666/SimpleCountDownTimerDemo/blob/master/SimpleCountDownTimerDemo.gif)
 
 * ### Setup

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
 * ### Usage

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
   
 * ### Params-unit: ms


   long totalTime;
  
   The number of millis in the future from the call to start() until the countdown is done and onFinish() is called.
   
   long intervalTime;
   
   The interval time of count down.
   
   TextView textView;
   
   A text view used to display count down time.
   
 * ### Other methods
 
   synchronized final CountDownTimer start(); Start the countdown.

   final void cancel(); Cancel the countdown.
   
   ### [More details](https://developer.android.google.cn/reference/android/os/CountDownTimer.html)

 
         
