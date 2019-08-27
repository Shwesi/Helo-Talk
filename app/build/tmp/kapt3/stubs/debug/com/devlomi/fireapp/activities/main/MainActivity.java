package com.devlomi.fireapp.activities.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 i2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001iB\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\tJ\u0010\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020\u000fH\u0016J\u0010\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020\tH\u0003J\u0010\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020\u000fH\u0002J\b\u00107\u001a\u00020\u000fH\u0002J\b\u00108\u001a\u00020/H\u0002J\b\u00109\u001a\u00020/H\u0002J\b\u0010:\u001a\u00020\u000fH\u0016J\u0006\u0010;\u001a\u00020/J\b\u0010<\u001a\u00020/H\u0002J\u0006\u0010=\u001a\u00020/J\b\u0010>\u001a\u00020/H\u0016J\n\u0010?\u001a\u0004\u0018\u00010@H\u0002J\b\u0010A\u001a\u00020/H\u0002J\b\u0010B\u001a\u00020/H\u0002J\b\u0010C\u001a\u00020/H\u0002J\u0006\u0010D\u001a\u00020/J\"\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\t2\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\b\u0010J\u001a\u00020/H\u0016J\u0012\u0010K\u001a\u00020/2\b\u0010L\u001a\u0004\u0018\u00010MH\u0014J\u0010\u0010N\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020SH\u0016J\b\u0010T\u001a\u00020/H\u0014J\u0010\u0010U\u001a\u00020/2\u0006\u00104\u001a\u00020\tH\u0016J\b\u0010V\u001a\u00020/H\u0016J\b\u0010W\u001a\u00020/H\u0002J\u0010\u0010X\u001a\u00020/2\u0006\u0010Y\u001a\u00020\u000fH\u0002J\u0010\u0010Z\u001a\u00020/2\u0006\u0010[\u001a\u00020\tH\u0002J\b\u0010\\\u001a\u00020/H\u0002J\b\u0010]\u001a\u00020/H\u0002J\b\u0010^\u001a\u00020/H\u0002J\b\u0010_\u001a\u00020/H\u0002J\u0010\u0010`\u001a\u00020/2\u0006\u0010a\u001a\u00020bH\u0016J\b\u0010c\u001a\u00020/H\u0002J\u001a\u0010d\u001a\u00020/2\b\u0010e\u001a\u0004\u0018\u00010S2\u0006\u0010f\u001a\u00020\u000fH\u0002J\u000e\u0010g\u001a\u00020/2\u0006\u0010h\u001a\u00020)R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006j"}, d2 = {"Lcom/devlomi/fireapp/activities/main/MainActivity;", "Lcom/devlomi/fireapp/activities/BaseActivity;", "Lcom/devlomi/fireapp/utils/FabRotationAnimation$RotateAnimationListener;", "Lcom/devlomi/fireapp/interfaces/FragmentCallback;", "Lcom/devlomi/fireapp/interfaces/StatusFragmentCallbacks;", "()V", "adapter", "Lcom/devlomi/fireapp/adapters/ViewPagerAdapter;", "currentPage", "", "fab", "Landroid/support/design/widget/FloatingActionButton;", "fireListener", "Lcom/devlomi/fireapp/utils/FireListener;", "isHasGroupItem", "", "()Z", "isHasMutedItem", "isInActionMode", "setInActionMode", "(Z)V", "isInSearchMode", "root", "Landroid/support/design/widget/CoordinatorLayout;", "rotationAnimation", "Lcom/devlomi/fireapp/utils/FabRotationAnimation;", "searchView", "Landroid/support/v7/widget/SearchView;", "selectedItems", "", "Lcom/devlomi/fireapp/model/realms/Chat;", "getSelectedItems", "()Ljava/util/List;", "tabLayout", "Landroid/support/design/widget/TabLayout;", "textStatusFab", "toolbar", "Landroid/support/v7/widget/Toolbar;", "tvSelectedChatCount", "Landroid/widget/TextView;", "users", "Lcom/devlomi/fireapp/model/realms/User;", "viewModel", "Lcom/devlomi/fireapp/activities/main/MainViewModel;", "viewPager", "Landroid/support/v4/view/ViewPager;", "addItemToActionMode", "", "itemsCount", "addMarginToFab", "isAdShowing", "animateFab", "drawable", "animateTextStatusFab", "show", "areAllOfChatsGroups", "createGroupClicked", "deleteItemClicked", "enablePresence", "exitActionMode", "exitGroupClicked", "exitSearchMode", "fetchStatuses", "getAdapter", "Lcom/devlomi/fireapp/adapters/ChatsAdapter;", "init", "initTabLayout", "muteItemClicked", "onActionModeStarted", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onRotationAnimationEnd", "openCamera", "searchItemClicked", "setMenuItemVisibility", "b", "setTabsTitles", "tabsSize", "settingsItemClicked", "showBatteryOptimizationDialog", "startCamera", "startServices", "startTheActionMode", "callback", "Landroid/view/ActionMode$Callback;", "updateGroupItems", "updateMutedIcon", "menuItem", "isMuted", "userProfileClicked", "user", "Companion", "app_debug"})
public final class MainActivity extends com.devlomi.fireapp.activities.BaseActivity implements com.devlomi.fireapp.utils.FabRotationAnimation.RotateAnimationListener, com.devlomi.fireapp.interfaces.FragmentCallback, com.devlomi.fireapp.interfaces.StatusFragmentCallbacks {
    private boolean isInActionMode;
    private boolean isInSearchMode;
    private android.support.design.widget.FloatingActionButton fab;
    private android.support.design.widget.FloatingActionButton textStatusFab;
    private android.support.v7.widget.Toolbar toolbar;
    private android.widget.TextView tvSelectedChatCount;
    private android.support.v7.widget.SearchView searchView;
    private android.support.v4.view.ViewPager viewPager;
    private android.support.design.widget.TabLayout tabLayout;
    private java.util.List<? extends com.devlomi.fireapp.model.realms.User> users;
    private com.devlomi.fireapp.utils.FireListener fireListener;
    private com.devlomi.fireapp.adapters.ViewPagerAdapter adapter;
    private com.devlomi.fireapp.utils.FabRotationAnimation rotationAnimation;
    private android.support.design.widget.CoordinatorLayout root;
    private int currentPage;
    private com.devlomi.fireapp.activities.main.MainViewModel viewModel;
    private static final int CAMERA_REQUEST = 9514;
    private static final int REQUEST_CODE_TEXT_STATUS = 9145;
    public static final com.devlomi.fireapp.activities.main.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isInActionMode() {
        return false;
    }
    
    public final void setInActionMode(boolean p0) {
    }
    
    private final boolean isHasMutedItem() {
        return false;
    }
    
    private final boolean isHasGroupItem() {
        return false;
    }
    
    private final java.util.List<com.devlomi.fireapp.model.realms.Chat> getSelectedItems() {
        return null;
    }
    
    @java.lang.Override()
    public boolean enablePresence() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showBatteryOptimizationDialog() {
    }
    
    private final void startCamera() {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void animateFab(int drawable) {
    }
    
    private final void animateTextStatusFab(boolean show) {
    }
    
    @java.lang.Override()
    public void fetchStatuses() {
    }
    
    private final void startServices() {
    }
    
    private final void init() {
    }
    
    private final void initTabLayout() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void exitGroupClicked() {
    }
    
    private final void createGroupClicked() {
    }
    
    private final void searchItemClicked() {
    }
    
    private final void updateMutedIcon(android.view.MenuItem menuItem, boolean isMuted) {
    }
    
    private final void settingsItemClicked() {
    }
    
    private final void muteItemClicked() {
    }
    
    private final void deleteItemClicked() {
    }
    
    public final void addItemToActionMode(int itemsCount) {
    }
    
    private final void setMenuItemVisibility(boolean b) {
    }
    
    private final boolean areAllOfChatsGroups() {
        return false;
    }
    
    public final void onActionModeStarted() {
    }
    
    private final void updateGroupItems() {
    }
    
    public final void exitActionMode() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void userProfileClicked(@org.jetbrains.annotations.NotNull()
    com.devlomi.fireapp.model.realms.User user) {
    }
    
    public final void exitSearchMode() {
    }
    
    private final void setTabsTitles(int tabsSize) {
    }
    
    private final com.devlomi.fireapp.adapters.ChatsAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onRotationAnimationEnd(int drawable) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void addMarginToFab(boolean isAdShowing) {
    }
    
    @java.lang.Override()
    public void openCamera() {
    }
    
    @java.lang.Override()
    public void startTheActionMode(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode.Callback callback) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/devlomi/fireapp/activities/main/MainActivity$Companion;", "", "()V", "CAMERA_REQUEST", "", "REQUEST_CODE_TEXT_STATUS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}