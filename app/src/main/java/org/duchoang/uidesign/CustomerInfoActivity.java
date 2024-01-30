package org.duchoang.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CustomerInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_info);
    }
    public void onBackTelephoneClick(View view) {
        Intent intent = new Intent(this, TelePhoneDirecActivity.class);
        startActivity(intent);
    }
}