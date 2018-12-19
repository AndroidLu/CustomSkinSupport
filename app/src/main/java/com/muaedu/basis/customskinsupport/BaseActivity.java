package com.muaedu.basis.customskinsupport;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * @package com.muaedu.basis.customskinsupport
 * @date on  2018/12/19 17:15
 * @describe TODO
 */
public abstract class BaseActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        setSkin();
    }

    protected abstract void initView();
    protected abstract void setSkin();

    @Override
    public void onClick(View v) {
    }

}
