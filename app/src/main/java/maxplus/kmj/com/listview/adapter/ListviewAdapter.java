package maxplus.kmj.com.listview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import maxplus.kmj.com.listview.Data;
import maxplus.kmj.com.listview.R;

public class ListviewAdapter extends BaseAdapter {
    ArrayList<Data> item;

    public ListviewAdapter(ArrayList<Data> item) {
        this.item=item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int i) {
        return item.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View v;
        v=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null);
        TextView t1=v.findViewById(R.id.item_t1);
        TextView t2=v.findViewById(R.id.item_t2);
        TextView t3=v.findViewById(R.id.item_t3);
        TextView t4=v.findViewById(R.id.item_t4);
        t1.setText(item.get(i).getTitle());
        t2.setText(item.get(i).getContent());
        t3.setText(String.valueOf(item.get(i).getPeopleCount()));
        t4.setText(item.get(i).getWhen());
        return v;
    }
}
