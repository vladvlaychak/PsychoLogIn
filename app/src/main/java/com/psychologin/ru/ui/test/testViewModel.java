package com.psychologin.ru.ui.test;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class testViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public testViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Данное приложение было созданно на основе курсовой работы");
    }

    public LiveData<String> getText() {
        return mText;
    }
}