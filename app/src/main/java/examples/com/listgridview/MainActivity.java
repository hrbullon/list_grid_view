package examples.com.listgridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_list_view_simple, btn_list_view_custom_basic, btn_grid_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Capturo los elementos de la UI
        getUI();

        btn_list_view_simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListViewSimpleActivity.class);
                startActivity(intent);
            }
        });

        btn_list_view_custom_basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListViewCustomBasicActivity.class);
                startActivity(intent);
            }
        });

        btn_grid_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GridViewActivity.class);
                startActivity(intent);
            }
        });

    }

    private void getUI(){

        btn_list_view_simple = (Button) findViewById(R.id.btn_list_view_simple);
        btn_list_view_custom_basic = (Button) findViewById(R.id.btn_list_view_custom_basic);
        btn_grid_view = (Button) findViewById(R.id.btn_grid_view);

    }
}
