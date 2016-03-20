package de.jonasrottmann.realmbrowser;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmObject;

public final class RealmBrowser {

    private static final RealmBrowser sInstance = new RealmBrowser();
    private final List<Class<? extends RealmObject>> mRealmModelList;

    private RealmBrowser() {
        mRealmModelList = new ArrayList<>();
    }

    public static RealmBrowser getInstance() {
        return sInstance;
    }


    public static void startRealmFilesActivity(Context context) {

    }


    public static void startRealmModelsActivity(Context context, String realmFileName) {

    }


    public static void showRealmFilesNotification(Context context) {

    }


    private static void showRealmNotification(Context context, Class activityClass) {

    }


    public List<Class<? extends RealmObject>> getRealmModelList() {
        return mRealmModelList;
    }


    @SafeVarargs
    public final void addRealmModel(Class<? extends RealmObject>... arr) {

    }
}
