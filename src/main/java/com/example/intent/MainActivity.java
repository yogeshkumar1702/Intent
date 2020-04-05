package com.example.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private final int INFO_REQUEST_CODE = 6162;
    ImageView ProfilePhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProfilePhoto = findViewById(R.id.imageview_profile_photo);
        ProfilePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this,infoActivity.class),INFO_REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == INFO_REQUEST_CODE){
            if(resultCode == RESULT_OK){
                Log.d(getApplication().toString(),"SUCCESSFULL REQUEST");
            }else{
                Log.e(getApplication().toString(),"SOMETHING WENT WRONG");
            }
        }

    }
}
