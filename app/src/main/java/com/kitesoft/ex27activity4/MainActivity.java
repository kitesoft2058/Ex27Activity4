package com.kitesoft.ex27activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtn(View view) {

        //SecondActivity실행하기 위한 Intent객체 생성[단, 명시적으로 SecondActivity명을 지정하지 않음]
        Intent intent= new Intent();

        //Intent객체에게 실행할 Activity의 클래스명을 직접 기입하지 않고 그 액티비티가 인식할 수 있는 임의의 문자열 값을 지정
        // 실행될 액티비티는 AndroidManifest.xml에 이 "aaa"문자열 액션값을 인식할 수 있도록 <intent-filter>가 <activity>에 지정되어 있어야 함.
        intent.setAction("aaa");
//        intent.setAction("bbb");

        // 디바이스에 설치된 모든 앱들중에서 "aaa"를 인식할 수 있는 <intent-filter>를 가진 Activity를 찾아 실행
        startActivity(intent);
    }
}
