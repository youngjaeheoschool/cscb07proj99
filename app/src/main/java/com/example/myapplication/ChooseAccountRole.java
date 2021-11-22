package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**This activity allows app user to choose what role their account will be (customer or storeOwner).
*  Only accessible after going through the Register Activity.
*  Register activity must sends an Intent containing the account ID for role update.
*/

// TODO: add the extra key to retrieve account ID at EXTRA_ACCOUNT_ID.

public class ChooseAccountRole extends AppCompatActivity implements View.OnClickListener {

    private final String EXTRA_ACCOUNT_ID = "";
    private int accountId;
    private Button customerBut;
    private Button storeOwnerBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_account_role);

        Intent intent = getIntent();
        // Get account ID, default ID is -1
        accountId = intent.getIntExtra(EXTRA_ACCOUNT_ID, -1);

        customerBut = findViewById(R.id.customerButton);
        storeOwnerBut = findViewById(R.id.storeOwnerButton);
        customerBut.setOnClickListener(this);
        storeOwnerBut.setOnClickListener(this);

    }

    /** Response to the clicked Button*/
    @Override
    public void onClick(View v) {
        int buttonID = v.getId();

        if (buttonID == R.id.customerButton) {
            updateRole(this.accountId, "Customer");

            // TODO : Go to Main menu
        }
        else {
            updateRole(this.accountId, role);
            // go to SetStoreInfo activity
            Intent intent = new Intent(this, SetStoreInfo.class);
            // pass on the accountId
            intent.putExtra(EXTRA_ACCOUNT_ID, this.accountId);
            startActivity(intent);
        }


    }

    /** Access Firebase to update account role */
    protected void updateRole(int accountID, String role){
        // TODO : update the role of the account using 'role'
    }
}