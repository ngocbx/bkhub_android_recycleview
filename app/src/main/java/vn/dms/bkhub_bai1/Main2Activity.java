package vn.dms.bkhub_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView dotoList = findViewById(R.id.lv_todoList);

        listItem = getResources().getStringArray(R.array.array_technology);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.item_todolist, R.id.content, listItem);

        dotoList.setAdapter(adapter);
        Toast.makeText(this,"Khởi tạo mới", Toast.LENGTH_LONG).show();
        dotoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                        String item_name = listItem[position];
//                        Bundle bundle = new Bundle();
//                        bundle.putString("item", item_name);
                Intent c_Intent = new Intent(Main2Activity.this, DetailActivity.class);
                c_Intent.putExtra("item", item_name);
                startActivity(c_Intent);
                TextView txtContent = view.findViewById(R.id.content);
                txtContent.setTextColor(Color.RED);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Quay lại màn hình chính", Toast.LENGTH_LONG).show();
    }
}
