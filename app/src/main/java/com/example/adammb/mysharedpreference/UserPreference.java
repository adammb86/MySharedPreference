package com.example.adammb.mysharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

public class UserPreference {

    private String KEY_NAME = "name";
    private String KEY_EMAIL = "email";
    private String KEY_LOVE_HARRY_POTTER = "love_harry_potter";
    private String KEY_PHONE_NUMBER = "phone_number";
    private String KEY_AGE="Age";

    private SharedPreferences preferences;

    public UserPreference(Context context) {
        String PREFS_NAME = "UserPref";
        preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public void setName(String name){
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString(KEY_NAME, name);
        editor.apply();
    }

    public String getName(){
        return preferences.getString(KEY_NAME,null);
    }

    public void setEmail(String email){
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString(KEY_EMAIL,email);
        editor.apply();
    }

    public String getEmail(){
        return preferences.getString(KEY_EMAIL,null);
    }

    public void setLoveHarryPotter(boolean status){
        SharedPreferences.Editor editor=preferences.edit();
        editor.putBoolean(KEY_LOVE_HARRY_POTTER,status);
        editor.apply();
    }

    public boolean isHarryPotter(){
        return preferences.getBoolean(KEY_LOVE_HARRY_POTTER,false);
    }

    void setPhoneNumber(String phoneNumber) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(KEY_PHONE_NUMBER, phoneNumber);
        editor.apply();
    }

    public String getPhoneNumber() {
        return preferences.getString(KEY_PHONE_NUMBER, null);
    }

    void setAge(int age) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(KEY_AGE, age);
        editor.apply();
    }

    public int getAge() {
        return preferences.getInt(KEY_AGE, 0);
    }
}
