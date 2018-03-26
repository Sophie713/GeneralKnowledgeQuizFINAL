package com.example.sophie.generalknowledgequiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

/**
 * Created by Sophie on 3/3/2018.
 */

public class Quiz extends AppCompatActivity {

    String user_name;
    //initialize all the fields in my layouts
    //Checkbox
    TextView CBquestion;
    CheckBox CB1;
    CheckBox CB2;
    CheckBox CB3;
    CheckBox CB4;
    //RadioButton
    TextView RBquestion;
    RadioButton RB1;
    RadioButton RB2;
    RadioButton RB3;
    RadioButton RB4;
    //EditText
    TextView ETquestion;
    EditText ETanswer;
    //button
    Button submit1;
    Button submit2;
    Button submit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_button_four);
//find all the fields in my views
        //RadioButton
        RBquestion = findViewById(R.id.RBquestion);
        RB1 = findViewById(R.id.RBanswer1);
        RB2 = findViewById(R.id.RBanswer2);
        RB3 = findViewById(R.id.RBanswer3);
        RB4 = findViewById(R.id.RBanswer4);
        //prepare my first view
        RBquestion.setText(R.string.question_1);
        RB1.setText(R.string.writ1);
        RB2.setText(R.string.writ2);
        RB3.setText(R.string.writ3);
        RB4.setText(R.string.writ4);
        //get the name
        Intent intent = getIntent();
        user_name = intent.getStringExtra("user_name");

    }

    //initialize score and question
    int score = 0;
    //first question is already uploaded
    int question = 2;

    //make my switch
    public void submit(View view) {

        switch (question++) {
            case 2:
                //update score
                if (RB2.isChecked()) {
                    score++;
                }
                //clear checked buttons
                clearChoices();
                //fill a new view
                setContentView(R.layout.edit_text);
                find_views();
                ETquestion.setText(R.string.question_2);
                //Toast message
                Toast.makeText(this, "Charles Dickens", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                //update score
                if (ETanswer.getText().toString().toLowerCase().equals("vidi")) {
                    score++;
                }
                //clear last view
                ETanswer.setText("");
                //fill a new view
                ETquestion.setText(R.string.question_3);
                //Toast message
                Toast.makeText(this, "Veni, vidi, vici.", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                //update score
                if (ETanswer.getText().toString().equals("1945")) {
                    score++;
                }
                //fill a new view
                setContentView(R.layout.radio_button_four);
                find_views();
                RBquestion.setText(R.string.question_4);
                RB1.setText(R.string.yes);
                RB2.setText(R.string.no);
                RB3.setText(R.string.sometimes);
                RB4.setVisibility(View.INVISIBLE);
                //Toast message
                Toast.makeText(this, "It ended in 1945 (september 2).", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                //update score
                if (RB2.isChecked()) {
                    score++;
                }
                //clear checked buttons
                clearChoices();
                //fill a new view
                RBquestion.setText(R.string.question_5);
                RB1.setText(R.string.dir1);
                RB2.setText(R.string.dir2);
                RB3.setText(R.string.dir3);
                RB4.setVisibility(View.VISIBLE);
                RB4.setText(R.string.dir4);
                //Toast message
                Toast.makeText(this, "Plant is the same, the preparation differs.", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                //update score
                if (RB4.isChecked()) {
                    score++;
                }
                //clear checked buttons
                clearChoices();
                //fill a new view
                RBquestion.setText(R.string.question_6);
                RB1.setText(R.string.paint1);
                RB2.setText(R.string.paint2);
                RB3.setText(R.string.paint3);
                RB4.setText(R.string.paint4);
                //Toast message
                Toast.makeText(this, "Tim Burton", Toast.LENGTH_SHORT).show();
                break;
            case 7:
                //update score
                if (RB1.isChecked()) {
                    score++;
                }
                //fill a new view
                setContentView(R.layout.edit_text);
                find_views();
                ETquestion.setText(R.string.question_7);
                //Toast message
                Toast.makeText(this, "Leonardo DaVinci", Toast.LENGTH_SHORT).show();
                break;
            case 8:
                //update score
                if (ETanswer.getText().toString().toLowerCase().equals("canberra")) {
                    score++;
                }
                //fill a new view
                setContentView(R.layout.check_box);
                find_views();
                CBquestion.setText(R.string.question_8);
                CB1.setText(R.string.enst1);
                CB2.setText(R.string.enst2);
                CB3.setText(R.string.enst3);
                CB4.setText(R.string.enst4);
                //Toast message
                Toast.makeText(this, "It\'s Canberra (not Sydney)", Toast.LENGTH_SHORT).show();
                break;
            case 9:
                //update score
                if (CB1.isChecked() && CB4.isChecked() && !CB2.isChecked() && !CB3.isChecked()) {
                    score = score + 2;
                } else if ((CB1.isChecked() || CB4.isChecked()) && !CB2.isChecked() && !CB3.isChecked()) {
                    score++;
                }//redundant else to meet rexirements and show I can use it
                else {
                    Log.e("Tag", "else");
                }
                //fill a new view
                setContentView(R.layout.edit_text);
                find_views();
                ETquestion.setText(R.string.question_9);
                //Toast message
                Toast.makeText(this, "He was born in Ulm in Germany", Toast.LENGTH_SHORT).show();
                break;
            case 10:
                //update score
                if (ETanswer.getText().toString().toLowerCase().equals("fleming")) {
                    score++;
                }
                //fill a new view
                setContentView(R.layout.check_box);
                find_views();
                CBquestion.setText(R.string.question_10);
                CB1.setText(R.string.famNam1);
                CB2.setText(R.string.famNam2);
                CB3.setText(R.string.famNam3);
                CB4.setText(R.string.famNam4);
                //Toast message
                Toast.makeText(this, "Fleming (Alexander)", Toast.LENGTH_SHORT).show();
                break;
            default:
                //update last score
                if (CB4.isChecked() && CB3.isChecked() && !CB1.isChecked() && !CB2.isChecked()) {
                    score = score + 2;
                } else if ((CB4.isChecked() || CB3.isChecked()) && !CB1.isChecked() && !CB2.isChecked()) {
                    score++;
                } //redundant else to meet rexirements and show I can use it
                else {
                    Log.e("Tag", "else");
                }
                //Toast message
                Toast.makeText(this, "The roles are: blamer, placater, computer, distractor and leveller.", Toast.LENGTH_SHORT).show();

                //Toast message with the score to meet requirements
                Toast.makeText(this, "Your final score is " + score + "/12.", Toast.LENGTH_SHORT).show();
                //go to result class
                //put in name and score
                Intent intent = new Intent(this, com.example.sophie.generalknowledgequiz.Result.class);
                intent.putExtra("user_name", user_name);
                intent.putExtra("score", score);
                startActivity(intent);
        }
    }

    public void find_views() {
        //find all the fields in my views
        //button
        submit1 = findViewById(R.id.submit_btn1);
        submit2 = findViewById(R.id.submit_btn2);
        submit3 = findViewById(R.id.submit_btn3);
        //Checkbox - find
        CBquestion = findViewById(R.id.CBquestion);
        CB1 = findViewById(R.id.CBanswer1);
        CB2 = findViewById(R.id.CBanswer2);
        CB3 = findViewById(R.id.CBanswer3);
        CB4 = findViewById(R.id.CBanswer4);
        //RadioButton
        RBquestion = findViewById(R.id.RBquestion);
        RB1 = findViewById(R.id.RBanswer1);
        RB2 = findViewById(R.id.RBanswer2);
        RB3 = findViewById(R.id.RBanswer3);
        RB4 = findViewById(R.id.RBanswer4);
        //EditText
        ETquestion = findViewById(R.id.ETquestion);
        ETanswer = findViewById(R.id.ETanswer);
    }

    public void clearChoices() {
        find_views();
        RB1.setChecked(false);
        RB2.setChecked(false);
        RB3.setChecked(false);
        RB4.setChecked(false);

    }


}
