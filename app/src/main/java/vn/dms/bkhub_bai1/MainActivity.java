package vn.dms.bkhub_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a, b;
    boolean cong = false;
    int tong = 0;
    String text="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final TextView tv_Hello = findViewById(R.id.tvHello);

        final Button btn1 = findViewById(R.id.button1);

        final Button btn2 = findViewById(R.id.button2);

        Button btnCong = findViewById(R.id.buttonCong);

        Button btnBang = findViewById(R.id.buttonBang);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(btn1.getText().toString());
                text = text.concat(btn1.getText().toString());
                tv_Hello.setText(text);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = Integer.parseInt(btn2.getText().toString());
                text = text.concat(btn2.getText().toString());
                tv_Hello.setText(text);
            }
        });

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cong = true;
            }
        });

        btnBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cong == true){
                    tong =  tinhTong(a,b);
                    tv_Hello.setText(tong + "");
                }
            }
        });



    }

    private int tinhTong(int a, int b){
        return  a + b;
    }

}
