package examples.com.listgridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_list_view_simple;

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

    }

    private void getUI(){

        btn_list_view_simple = (Button) findViewById(R.id.btn_list_view_simple);


    }
}
