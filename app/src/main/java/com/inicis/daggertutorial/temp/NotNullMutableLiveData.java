package com.inicis.daggertutorial.temp;

import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.Nullable;

public class NotNullMutableLiveData<T> extends MutableLiveData<T> {
    public NotNullMutableLiveData(T defaultValue) {
        setValue(defaultValue);
    }

    @Nullable
    @Override
    public T getValue() {
        return super.getValue();
    }
}
