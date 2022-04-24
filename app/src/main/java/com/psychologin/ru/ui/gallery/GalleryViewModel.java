package com.psychologin.ru.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Здесь предоставлены основные термины использующиеся в психологии");
    }

    public LiveData<String> getText() {
        return mText;
    }
}