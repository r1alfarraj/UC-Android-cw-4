package com.example.day4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student>myList = new ArrayList<>();
    int currentStudent=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView studName , studAge;
        ImageView studPic;
        Button Nextstud;


        studName = findViewById(R.id.textView);
        studAge = findViewById(R.id.textView2);
        studPic = findViewById(R.id.imageView);
        Nextstud = findViewById(R.id.button);


        Student firstStudent = new Student("ali", 20 ,R.drawable.img1);
        Student secondStudent = new Student("sara",23,R.drawable.img1);
        Student thirdStudent = new Student("rawan",25,R.drawable.img1);

        myList.add(firstStudent);
        myList.add(secondStudent);
        myList.add(thirdStudent);

     studName.setText(myList.get(currentStudent).getStudentName());
     studAge.setText(myList.get(currentStudent).getStudentAge()+"");
     studPic.setImageResource(myList.get(currentStudent).getStudentImg());



    Nextstud.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            currentStudent++;
            if (currentStudent == myList.size()){
                currentStudent=0;
            }
            studName.setText(myList.get(currentStudent).getStudentName());
            studAge.setText(myList.get(currentStudent).getStudentAge()+"");
            studPic.setImageResource(myList.get(currentStudent).getStudentImg());

        }
    });









    }
}