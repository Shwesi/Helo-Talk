package com.devlomi.fireapp.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/devlomi/fireapp/common/ScopedViewModel;", "Landroid/arch/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "jobTracker", "Lkotlinx/coroutines/Job;", "getJobTracker", "()Lkotlinx/coroutines/Job;", "setJobTracker", "(Lkotlinx/coroutines/Job;)V", "getUiContext", "app_release"})
public abstract class ScopedViewModel extends android.arch.lifecycle.ViewModel implements kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.Job jobTracker;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext uiContext = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.Job getJobTracker() {
        return null;
    }
    
    protected final void setJobTracker(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlin.coroutines.CoroutineContext getUiContext() {
        return null;
    }
    
    public ScopedViewModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext uiContext) {
        super();
    }
}