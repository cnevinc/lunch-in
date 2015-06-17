package com.github.androidatelier.lunchin.model;

import android.content.SharedPreferences;

/**
 * Created by brenda on 6/13/15.
 */


public class Setting {
    public static final int GROUP_APP_SETTINGS = 0;
    public static final int GROUP_USER_PREFERENCES = 1;
    public static final int GROUP_GOAL_SETTINGS = 2;

    public static final String TITLE_WIFI_WORK = "Work Wifi";
    public static final String TITLE_WIFI_HOME = "Home Wifi";
    public static final String TITLE_NOTIFICATIONS = "Notifications";
    public static final String TITLE_LUNCH_TIME = "Lunch Meal Time";
    public static final String TITLE_DINNER_TIME= "Dinner Meal Time";
    public static final String TITLE_LUNCH_DURATION = "Lunch Duration";
    public static final String TITLE_DINNER_DURATION = "Dinner Duration";
    public static final String TITLE_LUNCH_AVG_COST = "Average Lunch Cost";
    public static final String TITLE_DINNER_AVG_COST= "Average Dinner Cost";
    public static final String TITLE_MY_GOAL= "My Goal";

    private String title;
    private String description;
    private int icon;
    private int group;

    private Object value;
    private Object defaultSetting;
    private SharedPreferences sharedPreference;
    private boolean isSet;

    private Setting() {};
    public Setting(int group, String title, String description, int icon) {
        this.title = title;
        this.description = description;
        this.icon = icon;
        this.group = group;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public int getIcon() {
        return this.icon;
    }

    public int getGroup() {
        return this.group;
    }

    public Object getDefaultSetting() {
        return defaultSetting;
    }

    public SharedPreferences getSharedPreference() {
        return this.sharedPreference;
    }

    public boolean isSet() {
        return this.isSet;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


}