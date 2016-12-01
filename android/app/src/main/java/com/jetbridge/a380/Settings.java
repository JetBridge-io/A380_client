/*
 * Copyright (c) 2016-present JET BRIDGE LLC.
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.jetbridge.A380;

import android.content.Context;
import android.content.SharedPreferences;

public class Settings {
    private SharedPreferences mSetting = null;
    private static Settings instance = new Settings();

    public static Settings Get() {
        return instance;
    }

    public Settings init(Context aContext) {
        mSetting = aContext.getSharedPreferences(A380Constants.PREFERENCES, 0);
        return instance;
    }

    public void clear() {
        mSetting.edit().clear().commit();
    }

    public String getBundleVersion() {
        return mSetting.getString(A380Constants.BUNDLE_VERSION, "0");
    }

    public Settings setBundleVersion(String aBundleVersion) {
        mSetting.edit().putString(A380Constants.BUNDLE_VERSION, aBundleVersion).commit();
        return instance;
    }

    public String getBuildID() {
        return mSetting.getString(A380Constants.BUILD_ID, "0");
    }

    public Settings setBuildID(String aBuildID) {
        mSetting.edit().putString(A380Constants.BUILD_ID, aBuildID).commit();
        return instance;
    }

    public String getVersionKey() {
        return mSetting.getString(A380Constants.BUNDLE_VERSION_KEY, "0");
    }

    public Settings setVersionKey(String aVersionKey) {
        mSetting.edit().putString(A380Constants.BUNDLE_VERSION_KEY, aVersionKey).commit();
        return instance;
    }

    public long getTimeStamp() {
        return mSetting.getLong(A380Constants.TIMESTAMP, 0L);
    }

    public Settings setTimeStamp(long aTimeStamp) {
        mSetting.edit().putLong(A380Constants.TIMESTAMP, aTimeStamp).commit();
        return instance;
    }

    public String getBundleUpdateState() {
        return mSetting.getString(A380Constants.BUNDLE_UPDATE_STATE, "");
    }

    public Settings setBundleUpdateState(String aState) {
        mSetting.edit().putString(A380Constants.BUNDLE_UPDATE_STATE, aState).commit();
        return instance;
    }

    public Settings setBundleName(String aBundleName) {
        mSetting.edit().putString(A380Constants.INSTALLED_BUNDLE_NAME, aBundleName).commit();
        return instance;
    }

    public String getBundleName() {
        return mSetting.getString(A380Constants.INSTALLED_BUNDLE_NAME, "");
    }
}
