package com.commit451.nativestackblur.sample;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.commit451.nativestackblur.NativeStackBlur;

import java.nio.charset.Charset;
import java.security.MessageDigest;

class MyTransformation extends BitmapTransformation {
    private static final String ID = "com.bumptech.glide.transformations.MyTransformation";
    private static final byte[] ID_BYTES = ID.getBytes(Charset.forName("UTF-8"));

    private int mBlurRadius;

    public MyTransformation(int blurRadius) {
        mBlurRadius = blurRadius;
    }

    @Override
    protected Bitmap transform(@NonNull BitmapPool pool, @NonNull Bitmap toTransform, int outWidth, int outHeight) {
        Bitmap bm = NativeStackBlur.process(toTransform, mBlurRadius);
        return bm;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof MyTransformation;
    }

    @Override
    public int hashCode() {
        return ID.hashCode();
    }

    @Override
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }
}
