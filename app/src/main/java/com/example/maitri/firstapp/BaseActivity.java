package com.example.maitri.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by maitri on 10/15/2016.
 */

public class BaseActivity extends AppCompatActivity {


    protected void showToast(String message){
        Toast.makeText(BaseActivity.this,message,Toast.LENGTH_SHORT).show();
    }
}
