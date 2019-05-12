package com.example.explicitintent;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;


public class Second extends AppCompatActivity {
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.age)
    TextView age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            name.setText(bundle.getString("name"));
            age.setText(String.valueOf(bundle.getInt("age")));
        }

    }

}
