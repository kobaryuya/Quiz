package com.example.kobar.quiz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kobar on 2018/06/17.
 */
public class QuizManager {
    private List<Quiz> quizzes = new ArrayList(); // クイズのList
    // -> アプリの中でつかう、クイズ一覧。


    // 問題の登録(ここでは1問のみ)
    public void init() {
        // 第一問目をつくる。つくって、quizzes に登録する（add する）。
        quizzes.add(new Quiz(0, "これはだれ？", R.drawable.oda, new String[]{"最上義光", "織田信長", "徳川家康","伊達政宗"}, 0));
        quizzes.add(new Quiz(0, "第2問", R.drawable.oda, new String[]{"イタリア22", "フランス2", "ロシア", "オランダ"}, 1));
    }

    // 問題を取得する
    public Quiz getQuiz(int num) {
        if (num >= quizzes.size()) {
            return null;
        }
        return quizzes.get(num);

    }

    public class Quiz implements Serializable {
        int qNum; // 問題番号
        String qString; // 第○問というString
        int image; // 画像ID
        String[] choices = new String[4]; // 選択肢
        int answerIndex; // 正解の選択肢

        private Quiz(int q_num, String q_string, int image, String[] choices, int answer_index) {
            this.qNum = q_num;
            this.qString = q_string;
            this.image = image;
            this.choices = choices;
            this.answerIndex = answer_index;
        }
    }

}
