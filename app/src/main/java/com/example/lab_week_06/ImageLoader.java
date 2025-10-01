package com.example.lab_week_06;

import android.widget.ImageView;

// File: ImageLoader.java
public interface ImageLoader {
    // Diperbaiki: Mengubah sintaks parameter dari gaya Kotlin ke gaya Java
    void loadImage(String imageUrl, ImageView imageView);
}