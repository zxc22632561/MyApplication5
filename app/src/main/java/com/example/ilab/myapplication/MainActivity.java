package com.example.ilab.myapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast t = Toast.makeText(MainActivity.this,"text",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP|Gravity.CENTER,10,100);
                t.show();*/

                /*NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this);
                builder.setSmallIcon(R.mipmap.ic_launcher);
                builder.setContentTitle("hello world");
                builder.setContentText("hi ......");
                Notification notification = builder.build();
                NotificationManager notificationManager = (NotificationManager)
                        getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(256,notification);*/

                Toast t = Toast.makeText(MainActivity.this,"text",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP|Gravity.CENTER,10,100);
                View view =getLayoutInflater().inflate(R.layout.test, (ViewGroup) findViewById(R.id.ToastLayout));
                t.setView(view);
                t.show();

            }
        });
    }
}
