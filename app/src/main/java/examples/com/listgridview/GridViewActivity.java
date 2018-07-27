package examples.com.listgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static examples.com.listgridview.R.menu.action_bar_menu;

public class GridViewActivity extends AppCompatActivity {

    private GridView gridView;
    private List<String> names;
    private MyAdapter myAdapter;

    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = (GridView) findViewById(R.id.gridView);

        //Datos a mostrar
        names = new ArrayList<String>();

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
        myAdapter = new MyAdapter(this, R.layout.activity_grid_view, names);

        //Enlazamos el adaptador personalizado con nuestro listview
        gridView.setAdapter(myAdapter);

        //Capturar el evento click sobre los item del listview
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long ld) {
                Toast.makeText(GridViewActivity.this, "Clicked: "+ names.get(position), Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.add_item:
                //Añadimos nuevo nombre
                this.names.add("Added n#:"+(++counter));
                //Notificamos al adaptador del cambio producido
                this.myAdapter.notifyDataSetChanged();
                return true;
            default:
                super.onOptionsItemSelected(item);
        }

        return true;

    }
}
