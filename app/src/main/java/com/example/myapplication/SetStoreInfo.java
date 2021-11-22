package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**This activity allows Store Owner to set up basic information about their store
 * (ie: Store name, descriptions...)
 * Only accessible after the user chose Store Owner in ChooseAccountRole activity.
 * ChooseAccountRole activity sends an Intent containing account ID for updates.
 */

// TODO: Implement this activity.

public class SetStoreInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_store_info);
    }
}