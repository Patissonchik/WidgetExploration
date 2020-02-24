package com.example.widgetexploration;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup  group = (RadioGroup) findViewById(R.id.group);
        final RadioButton buttonLondon = (RadioButton) findViewById(R.id.radioButtonLondon);
        final RadioButton buttonNewYork = (RadioButton)findViewById(R.id.radioButtonNewYork);
        final RadioButton buttonMoscow = (RadioButton)findViewById(R.id.radioButtonMoscow);
        final RadioButton buttonParis = (RadioButton) findViewById(R.id.radioButtonParis);
        final CheckBox tint = (CheckBox) findViewById(R.id.checkBoxTint);
        final CheckBox resize = (CheckBox) findViewById(R.id.checkBoxResize);
        final CheckBox transparency = (CheckBox) findViewById(R.id.checkBoxTransparency);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        final EditText editText = (EditText)findViewById(R.id.editText);


        tint.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    imageView.setColorFilter(Color.argb(125, 255, 0, 0));
                }else{
                    imageView.setColorFilter(Color.argb(0,0,0,0));
                }
            }
        });
        resize.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    imageView.setScaleX(2);
                    imageView.setScaleY(2);
                }else {
                    imageView.setScaleX(1);
                    imageView.setScaleY(1);
                }
            }
        });
        transparency.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    imageView.setVisibility(View.INVISIBLE);
                }
                else{
                    imageView.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
