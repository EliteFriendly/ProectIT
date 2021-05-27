package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.awt.*;
import java.applet.*;

public class MainActivity extends AppCompatActivity {
    int a[][] = new int[2][2];
    int i = 1, j = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a[1][1] = 2;
    }


    public void ButtonUp(View view) {
        a[i][j] = 0;
        a[i + 1][j] = 2;
        i += 1;
    }

    public void ButtonRight(View view) {
        a[i][j] = 0;
        a[i][j + 1] = 2;
        j += 1;
    }

    public void ButtonDown(View view) {
        a[i][j] = 0;
        a[i - 1][j] = 2;
        i -= 1;
    }

    public void ButtonLeft(View view) {
        a[i][j] = 0;
        a[i][j - 1] = 2;
        j -= 1;
    }

    public void ButtonWall(View view) {
        a[i][j] = 1;

    }


    }


