package com.example.kobar.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class QuizAppActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_app);
    }

    public void openQuiz(View v) {
        // show instant message
        Toast.makeText(this, "クイズ　開始!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);

    }
}
