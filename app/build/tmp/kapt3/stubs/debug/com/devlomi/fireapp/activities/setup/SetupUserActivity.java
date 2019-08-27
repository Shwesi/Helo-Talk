package com.devlomi.fireapp.activities.setup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\nH\u0002J2\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002J\"\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0012\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\'\u001a\u00020\u0010H\u0014J\b\u0010(\u001a\u00020\u0010H\u0014J\b\u0010)\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020\u0010H\u0002J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0010H\u0002J\b\u0010/\u001a\u00020\u0010H\u0002J\u0010\u00100\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\nH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/devlomi/fireapp/activities/setup/SetupUserActivity;", "Lcom/devlomi/fireapp/common/ScopedActivity;", "()V", "choosenPhoto", "", "getChoosenPhoto$app_debug", "()Ljava/lang/String;", "setChoosenPhoto$app_debug", "(Ljava/lang/String;)V", "progressDialog", "Landroid/app/ProgressDialog;", "storedPhotoUrl", "getStoredPhotoUrl$app_debug", "setStoredPhotoUrl$app_debug", "thumbImg", "completeSetup", "", "fetchUserPhoto", "fetchingGroupsAndBroadcastsComplete", "event", "Lcom/devlomi/fireapp/events/FetchingUserGroupsAndBroadcastsFinished;", "getDefaultUserProfilePhoto", "dialog", "getUserImage", "getUserInfoHashmap", "Ljava/util/HashMap;", "", "userName", "photoUrl", "filePath", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "pickImage", "saveCountryCode", "saveUserInfo", "photoFile", "Ljava/io/File;", "showSnackbar", "startMainActivity", "uploadUserPhoto", "app_debug"})
public final class SetupUserActivity extends com.devlomi.fireapp.common.ScopedActivity {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String storedPhotoUrl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String choosenPhoto;
    private java.lang.String thumbImg;
    private android.app.ProgressDialog progressDialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStoredPhotoUrl$app_debug() {
        return null;
    }
    
    public final void setStoredPhotoUrl$app_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChoosenPhoto$app_debug() {
        return null;
    }
    
    public final void setChoosenPhoto$app_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fetchUserPhoto() {
    }
    
    private final void completeSetup() {
    }
    
    private final void uploadUserPhoto(android.app.ProgressDialog dialog) {
    }
    
    private final void getUserImage(android.app.ProgressDialog dialog) {
    }
    
    private final void getDefaultUserProfilePhoto(android.app.ProgressDialog dialog) {
    }
    
    private final void showSnackbar() {
    }
    
    private final java.util.HashMap<java.lang.String, java.lang.Object> getUserInfoHashmap(java.lang.String userName, java.lang.String photoUrl, java.lang.String filePath) {
        return null;
    }
    
    private final void saveUserInfo(java.io.File photoFile) {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void fetchingGroupsAndBroadcastsComplete(@org.jetbrains.annotations.NotNull()
    com.devlomi.fireapp.events.FetchingUserGroupsAndBroadcastsFinished event) {
    }
    
    private final void saveCountryCode() {
    }
    
    private final void pickImage() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void startMainActivity() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public SetupUserActivity() {
        super();
    }
}