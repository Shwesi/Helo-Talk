package com.devlomi.fireapp.activities.placespicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/devlomi/fireapp/activities/placespicker/PlacesWebService;", "", "getNearbyPlaces", "Lkotlinx/coroutines/Deferred;", "Lcom/devlomi/fireapp/activities/placespicker/model/PlacesResponse;", "latLng", "", "Companion", "app_release"})
public abstract interface PlacesWebService {
    public static final com.devlomi.fireapp.activities.placespicker.PlacesWebService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/")
    public abstract kotlinx.coroutines.Deferred<com.devlomi.fireapp.activities.placespicker.model.PlacesResponse> getNearbyPlaces(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ll")
    java.lang.String latLng);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/devlomi/fireapp/activities/placespicker/PlacesWebService$Companion;", "", "()V", "invoke", "Lcom/devlomi/fireapp/activities/placespicker/PlacesWebService;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.devlomi.fireapp.activities.placespicker.PlacesWebService invoke() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}