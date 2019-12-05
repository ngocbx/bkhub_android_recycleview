package vn.dms.bkhub_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String content = getIntent().getStringExtra("item");
        Toast.makeText(this,content, Toast.LENGTH_LONG).show();
    }
}
