package com.example.kobar.quiz;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {
    Button[] buttons = new Button[4];
    QuizManager manager;
    private TextView result;
    private TextView mondai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        buttons[0] = (Button) findViewById(R.id.button1);
        buttons[1] = (Button) findViewById(R.id.button2);
        buttons[2] = (Button) findViewById(R.id.button3);
        buttons[3] = (Button) findViewById(R.id.button4);
        manager = new QuizManager();
        manager.init(); // creaete quizzes
        mondai = (TextView) findViewById(R.id.mondai);
        result = (TextView) findViewById(R.id.result);
        mondai.setText(manager.getQuiz(0).qString);


        buttons[0].setText(manager.getQuiz(0).choices[0]);
        buttons[1].setText(manager.getQuiz(0).choices[1]);
        buttons[2].setText(manager.getQuiz(0).choices[2]);
        buttons[3].setText(manager.getQuiz(0).choices[3]);
    }

    public void answer(View v) {

        TextView tv = (TextView) v;
        String text = tv.getText().toString();
        Log.d("Log", text);

//        boolean isOk = text.equals("最上義光");
        QuizManager.Quiz q = manager.getQuiz(0);
        boolean isOk = text.equals(q.choices[q.answerIndex]);
        if (isOk) {
            Toast.makeText(this, "正解！", Toast.LENGTH_SHORT).show();
            result.setText("正解！");
        } else {
            result.setText("不正解！");
        }
    }

    public void next(View v) {
        result.setText("");

    }
}




