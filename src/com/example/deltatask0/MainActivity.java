package com.example.deltatask0;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Random;

import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void jumbleThis(View v) {
    	TextView t = (TextView)findViewById(R.id.textView1);
    	String word=t.getText().toString();
    	ArrayList<Character> al = new ArrayList<Character>();
        for (int i = 0; i < word.length(); i++) {
            al.add(word.charAt(i));
        }
        Collections.shuffle(al);
        String result = "";
        for (Character character : al) {
            result += character;
        }
        t.setText(result);
    }

}
