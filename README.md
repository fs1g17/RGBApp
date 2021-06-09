# RGBApp
I was presented with the following challenge:

**RGB Slider Application**

* Feel free to write this in Java or Kotlin.
* Please produce an application with a background that changes colour based on user input. 
* Do this by producing three sliders, for the RGB values respectively.
* Please display the current RGB value as the sliders are altered. The background colour of the application should be the current RGB colour.
* Produce a document that explains your choices in designing this toy application. Then include instructions to build and install your app.

## My Implementation 
I wrote this app in Java. Using ConstraintLayout, I placed three sliders representing red, green, and blue values at the bottom of the screen. I decided to also add a TextView to the top of the screen, that displays the current HEX value of the color selected. Following minimal design philosophy, I set the colors of the sliders to red, green, and blue respectively, to save me having to provide captions for them. Below is a screenshot of the design: 

![](/images/RGBApp_screenshot.png)

## Building the Project 
I used Android Studio to build the APK. It can be done very simply by cloning the project in Android Studio, then clicking Build -> Build Bundle(s)/APK(s) -> Build APK(s). 

![](/images/build.PNG)

The APK can be located using the hyperlink that pops up in the bottom right of Android Studio.

![](/images/locate.PNG)

## GitHub APK
Alternatively, you can find a pre-built APK [here](/APK/).
