package com.hocompany.hogle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.test_input);
        final int BASE_CODE = 0xAC00;   // '가' 44032
        final int BASE_INIT = 0x1100;   // 'ㄱ' 4352
        final int BASE_VOWEL = 0x1161;  // 'ㅏ' 4449

        char a = (char) BASE_INIT;
        char b = (char) BASE_VOWEL;
        String test = (int) a + " " + (int) b;
        editText.setText(test);
    }
}
