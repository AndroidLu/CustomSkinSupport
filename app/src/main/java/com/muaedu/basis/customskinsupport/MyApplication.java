package com.muaedu.basis.customskinsupport;

import android.app.Application;

/**
 * @package com.muaedu.basis.customskinsupport
 * @date on  2018/12/19 17:15
 * @describe TODO
 */
public class MyApplication extends Application {
    public static SkinUtil skin;

    @Override
    public void onCreate() {
        super.onCreate();
        skin = new SkinUtil(getApplicationContext());
    }
}
