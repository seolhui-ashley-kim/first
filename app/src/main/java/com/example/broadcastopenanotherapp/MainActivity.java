package com.example.broadcastopenanotherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_go = findViewById(R.id.btn_go);

        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_MAIN);
//                intent.setComponent(new ComponentName(
//                        "com.example.servicemusicplayerpractice","com.example.servicemusicplayerpractice.MainActivity"));
//                startActivity(intent);


                Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.example.servicemusicplayerpractice");//pass the packagename of app you want to open
                startActivity( LaunchIntent );
            }
        });
    }
}