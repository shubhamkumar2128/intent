package com.example.explicitintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    Intent intent, chooser;

    @BindView(R.id.buttonmap)
    Button mapbtn;
    @BindView(R.id.buttonweb)
    Button webbtn;
    @BindView(R.id.intentbtn)
    Button intentbtn;
    @BindView(R.id.datasend)
    Button datasendbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.datasend)
    public void dataSend(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("name", "Shubham");
        bundle.putInt("age", 21);

        intent = new Intent(this, Second.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @OnClick(R.id.intentbtn)
    public void intent(View v) {
        //intent=new Intent(this,Second.class);
        intent = new Intent();
        intent.setClassName("com.example.explicitintent", "com.example.explicitintent.Second");
        startActivity(intent);
    }

    @OnClick(R.id.buttonmap)
    public void map(View v) {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:19.076,72,8777"));
        chooser = Intent.createChooser(intent, "Launch Map");
        startActivity(chooser);
    }

    @OnClick(R.id.buttonweb)
    public void browser(View v) {

        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com"));
        chooser = Intent.createChooser(intent, "Action perform");
        startActivity(chooser);
    }


}
