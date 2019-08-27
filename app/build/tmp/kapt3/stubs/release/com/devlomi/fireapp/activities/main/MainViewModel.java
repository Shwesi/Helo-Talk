package com.devlomi.fireapp.activities.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J-\u0010\u001c\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\b\u0010 \u001a\u00020\u0010H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/devlomi/fireapp/activities/main/MainViewModel;", "Lcom/devlomi/fireapp/common/ScopedViewModel;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "lastSyncTime", "", "getLastSyncTime", "()J", "setLastSyncTime", "(J)V", "realmHelper", "Lcom/devlomi/fireapp/utils/RealmHelper;", "kotlin.jvm.PlatformType", "statusLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "", "getStatusLiveData", "()Landroid/arch/lifecycle/MutableLiveData;", "fetchImageAndVideosStatuses", "users", "", "Lcom/devlomi/fireapp/model/realms/User;", "statusesIds", "", "", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchStatuses", "fetchTextStatuses", "handleStatus", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "updateUi", "Companion", "app_release"})
public final class MainViewModel extends com.devlomi.fireapp.common.ScopedViewModel {
    private final com.devlomi.fireapp.utils.RealmHelper realmHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<kotlin.Unit> statusLiveData = null;
    private long lastSyncTime;
    public static final int WAIT_TIME = 15000;
    public static final com.devlomi.fireapp.activities.main.MainViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<kotlin.Unit> getStatusLiveData() {
        return null;
    }
    
    public final long getLastSyncTime() {
        return 0L;
    }
    
    public final void setLastSyncTime(long p0) {
    }
    
    public final void fetchStatuses(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.devlomi.fireapp.model.realms.User> users) {
    }
    
    private final void updateUi() {
    }
    
    private final void handleStatus(com.google.firebase.database.DataSnapshot dataSnapshot, java.util.List<java.lang.String> statusesIds) {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext uiContext) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/devlomi/fireapp/activities/main/MainViewModel$Companion;", "", "()V", "WAIT_TIME", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}