package examples.com.listgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewSimpleActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_simple);

        listView = (ListView) findViewById(R.id.ListView);

        //Datos a mostrar
        List<String> names = new ArrayList<String>();

        names.add("Manuel");
        names.add("Yasmery");
        names.add("Harrinson");
        names.add("Haderson");
        names.add("Haidelyn");
        names.add("DIego");
        names.add("Arianny");
        names.add("Mathias");
        names.add("Juan");
        names.add("Katherine");

        //Adaptador, la forma visual en que mostraremos nuestros datos
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        //Enlazamos el adaptador con nuestro listview
        listView.setAdapter(adapter);

    }
}
