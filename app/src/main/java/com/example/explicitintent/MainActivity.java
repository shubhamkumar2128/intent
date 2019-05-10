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
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.button3)
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void click1(View v) {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:19.076,72,8777"));
        chooser = Intent.createChooser(intent, "Launch Map");
        startActivity(chooser);
    }

    @OnClick(R.id.button2)
    public void click2(View v) {

        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.androidhive.info/2017/10/android-working-with-butterknife-viewbinding-library/"));
        chooser = Intent.createChooser(intent, "Action perform");
        startActivity(chooser);
    }

    @OnClick(R.id.button3)
    public void clic3(View v) {
       //Uri uri= Uri.parse("android.resourse://com.example.explicitintent/drawable/" + R.drawable.ic_launcher_background);
       intent=new Intent(Intent.ACTION_SEND);
       intent.putExtra(Intent.EXTRA_TEXT,"image");
       chooser=Intent.createChooser(intent,"Select");
       startActivity(chooser);
    }

}
