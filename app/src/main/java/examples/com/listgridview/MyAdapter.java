package examples.com.listgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<String> names;

    public MyAdapter(Context context, int layout, List<String> names){

        this.context = context;
        this.layout = layout;
        this.names = names;

    }

    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int postition) {
        return this.names.get(postition);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int postition, View convertView, ViewGroup viewGroup) {

        ViewHolder holder;

        if(convertView == null){
            //inflamos la vista que nos ha llegado con nuestro layout personalizado
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(this.layout, null);

            holder = new ViewHolder();
            holder.nameTextView = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }


        //Nos traemos el valor actual dependiente de la posición
        String currentName = names.get(postition);
        //Asi tambien se puede acceder a un item del array
        //currentName = (String) getItem(postition);

        //Referenciamos el o los elementos a modificar y lo rellenamos
        holder.nameTextView.setText(currentName);

        //Devolvemos la vista inflada y modificada con nuestros datos
        return convertView;
    }

    static class ViewHolder {
        private TextView nameTextView;
    }
}
