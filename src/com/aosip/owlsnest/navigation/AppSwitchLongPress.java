package com.aosip.owlsnest.navigation;

import android.provider.Settings;
import android.view.View;
import android.widget.ListView;

import com.aosip.support.preference.AppPicker;

public class AppSwitchLongPress extends AppPicker {

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String mAppString = applist.get(position).packageName;
        String mFriendlyAppString = (String) applist.get(position).loadLabel(packageManager);

        Settings.System.putString(
                getContentResolver(), Settings.System.KEY_APP_SWITCH_LONG_PRESS_CUSTOM_APP, mAppString);
        Settings.System.putString(
                getContentResolver(), Settings.System.KEY_APP_SWITCH_LONG_PRESS_CUSTOM_APP_FR_NAME,
                mFriendlyAppString);
        finish();
    }
}
