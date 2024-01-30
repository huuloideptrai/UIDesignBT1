package org.duchoang.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelePhoneDirecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele_phone);
    }
    public void onBackLoginClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void onCustomerInfoClick(View view) {
        Intent intent = new Intent(this, CustomerInfoActivity.class);
        startActivity(intent);
    }
}