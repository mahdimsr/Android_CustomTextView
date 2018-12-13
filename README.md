# Android_CustomTextView
============

android textview for less java code and avoid codes in vain...Enjoy it :)



Overview
--------
**CustomTextView** provides the following advantages:

[![](https://jitpack.io/v/mahdimsr/Android_CustomTextView.svg)](https://jitpack.io/#mahdimsr/Android_CustomTextView)



* **set font in xml**: you dont need to define a typeface and set it to your textview, just write the your target font path which is in assets folder in **app:fontPath=""** attribute;

* **see how does font look**: also you can see how does font look after set the path in attribute;


change log
---------

**Latest version: 1.0.0**

Gradle integration
------------------

```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
	
	
```groovy
dependencies {
    implementation 'com.github.mahdimsr:Android_CustomTextView:1.0.1'
}
```

Basic usage
-----------

*For a working implementation, see the `CustomTextViewExample/` folder.*

The simplest way to use **CustomTextView** is implementation lib in project
adding a view to an XML layout file and also put your font in **assets** folder by **ttf** format:

```xml
<mahdi.app.com.customtextview.CustomTextView
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:textColor="#000000"
		android:textSize="30sp"
		android:text="you can set font from xml"
		android:gravity="center"
		app:fontPath="Elfar.ttf"/>
```
![from assets directly](https://github.com/mahdimsr/Android_CustomTextView/blob/master/assets_directly.png)


```xml
<mahdi.app.com.customtextview.CustomTextView
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:textColor="#000000"
		android:textSize="30sp"
		android:text="you can set font from xml"
		android:gravity="center"
		app:fontPath="fonts/Elgar.ttf"/>
```

![from folder in assets](https://github.com/mahdimsr/Android_CustomTextView/blob/master/folder_in_assets.png)




