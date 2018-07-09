package com.star.snackbartest;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShow = findViewById(R.id.show_snackbar);
        mShow.setOnClickListener(this::showSnackbar);
    }

    private void showSnackbar(View view) {

        Snackbar
                .make(view, "标题", Snackbar.LENGTH_LONG)
                .setAction("点击事件",
                        v -> Toast.makeText(this, "Toast",
                                Toast.LENGTH_LONG).show())
                .setDuration(Snackbar.LENGTH_LONG).show();
    }
}
