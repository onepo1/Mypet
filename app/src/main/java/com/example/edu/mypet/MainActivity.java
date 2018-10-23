package com.example.edu.mypet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chkAgree;
    RadioGroup rGroup;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnOK;
    TextView textView1, text2;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.chkAgree = (CheckBox)findViewById(R.id.chkAgree);
        this.textView1= (TextView)findViewById(R.id.textView1);
        this.text2= (TextView)findViewById(R.id.text2);
        this.rGroup= (RadioGroup)findViewById(R.id.rGroup);
        this.rdoDog= (RadioButton)findViewById(R.id.rdoDog);
        this.rdoCat= (RadioButton)findViewById(R.id.rdoCat);
        this.rdoRabbit= (RadioButton)findViewById(R.id.rdoRabbit);
        this.btnOK= (Button)findViewById(R.id.btnOK);
        this.imgPet= (ImageView)findViewById(R.id.imgPet);
        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked()){
                    text2.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (rGroup.getCheckedRadioButtonId()){
                    case R.id.rdoDog:
                        imgPet.setImageResource(android.R.drawable.dog);break;
                    case R.id.rdoCat:
                        imgPet.setImageResource(android.R.drawable.cat);break;
                    case R.id.rdoRabbit:
                        imgPet.setImageResource(android.R.drawable.rabbit);break;
                        default:
                            Toast.makeText(getApplicationContext(),"동물을 선택하세요",Toast.LENGTH_SHORT)
                                    .show();
                }
            }
        });


    }
}
