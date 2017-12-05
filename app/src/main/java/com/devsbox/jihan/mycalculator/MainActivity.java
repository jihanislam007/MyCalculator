package com.devsbox.jihan.mycalculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.TextKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.evgenii.jsevaluator.JsEvaluator;
import com.evgenii.jsevaluator.interfaces.JsCallback;

public class MainActivity extends AppCompatActivity {

    TextView liveTextView;
    TextView ViewTextView;
    JsEvaluator jsEvaluator = new JsEvaluator(this);

    Button ClearButton,
            SqrRootButton,
            PercentageButton,

    PlusButton,
            MinusButton,
            MultiButton,
            DivButton,
            ExitButton,

            MemoryButton,
            MemoryAddButton,

    DotButton,
            ZeroButton,
            DoubleZeroButton,
            OneButton,
            TwoButton,
            ThreeButton,
            FourButton,
            FiveButton,
            SixButton,
            SevenButton,
            EightButton,
            NineButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liveTextView = findViewById(R.id.liveTextView);
        ViewTextView = findViewById(R.id.ViewTextView);

        ClearButton = findViewById(R.id.ClearButton);
        SqrRootButton = findViewById(R.id.SqrRootButton);
        PercentageButton = findViewById(R.id.PercentageButton);
        PlusButton = findViewById(R.id.PlusButton);
        MinusButton = findViewById(R.id.MinusButton);
        MultiButton = findViewById(R.id.MultiButton);
        DivButton = findViewById(R.id.DivButton);
        ExitButton = findViewById(R.id.EqualButton);
        MemoryButton = findViewById(R.id.MemoryClearButton);
        MemoryAddButton = findViewById(R.id.MemoryAddButton);
        DotButton = findViewById(R.id.DotButton);
        ZeroButton = findViewById(R.id.ZeroButton);
        DoubleZeroButton = findViewById(R.id.DoubleZeroButton);
        OneButton = findViewById(R.id.OneButton);
        TwoButton = findViewById(R.id.TwoButton);
        ThreeButton = findViewById(R.id.ThreeButton);
        FourButton = findViewById(R.id.FourButton);
        FiveButton = findViewById(R.id.FiveButton);
        SixButton = findViewById(R.id.SixButton);
        SevenButton = findViewById(R.id.SevenButton);
        EightButton = findViewById(R.id.EightButton);
        NineButton = findViewById(R.id.NineButton);

        OneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "1");
            }
        });

        TwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "2");
            }
        });

        ThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "3");
            }
        });

        FourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "4");
            }
        });

        FiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "5");
            }
        });

        SixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "6");
            }
        });

        SevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "7");
            }
        });

        EightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "8");
            }
        });

        NineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "9");
            }
        });

        ZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "0");
            }
        });

        DoubleZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "00");
            }
        });

        DotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + ".");
            }
        });


        PlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "+");

            }
        });

        MinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "-");
                /*mValueOne = Float.parseFloat(ViewTextView.getText() + "");
                Subtract = true;*/
            }
        });

        MultiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "X");
            }
        });

        DivButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "/");
            }
        });

        SqrRootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   liveTextView.setText("");
                liveTextView.setText(ViewTextView.getText() + "²" );

                CharSequence x = ViewTextView.getText();

                Double xconv = Double.parseDouble(x.toString());
                /*Math.sqrt(xconv);*/
                xconv=Math.pow(xconv,2);
                String answer = Double.toString(xconv);
                ViewTextView.setText(answer);


            }
        });





        PercentageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText(liveTextView.getText() + "%");
            }
        });

        ClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveTextView.setText("");
                ViewTextView.setText("");
            }
        });

        ExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        liveTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.toString().contains("%")){

                    String[] twoWord=charSequence.toString().split("%");
                    if(twoWord.length==2){
                        try {
                            double res=Double.parseDouble(twoWord[0])*(Double.parseDouble(twoWord[1])/100);
                            ViewTextView.setText(res+"");
                        } catch (NumberFormatException e) {
                            Toast.makeText(MainActivity.this, "Percentage support only two operand", Toast.LENGTH_SHORT).show();
                        }
                    }

                }else{
                    calculation(charSequence.toString());
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



    }
    public void calculation(String s){
        s=s.replaceAll("X","*");

        jsEvaluator.evaluate(s, new JsCallback() {
            @Override
            public void onResult(String s) {
               ViewTextView.setText(s);


            }

            @Override
            public void onError(String s) {

            }
        });

        MemoryAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences = getSharedPreferences("ju_pmit", Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString("live_Value" , liveTextView.getText().toString());
                editor.putString("result" , ViewTextView.getText().toString());

                editor.apply();

                Toast.makeText(MainActivity.this , ViewTextView.getText() , Toast.LENGTH_LONG).show();

            }
        });

        MemoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("ju_pmit", Context.MODE_PRIVATE);

                String live = sharedPreferences.getString("live_Value","Empty Data");
                String result = sharedPreferences.getString("result","Empty Data");

                liveTextView.setText(live);
                ViewTextView.setText(result);
            }
        });
    }

    /*public String replaceWord(String originalString,String findWord,String firstAppend,String lastAppend){
        StringBuilder sb=new StringBuilder(originalString);
        for (int i = 0; i < originalString.length(); i++) {
            int index=originalString.indexOf(findWord);
            if(index<i){
                sb.insert(i,firstAppend);
                for (int j = 0; j < originalString.length(); j++) {
                }
            }
            i=index;

        }
    }*/
}
