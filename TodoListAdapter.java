package com.example.ruotong.amytodolist;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ruotong.amytodolist.models.Todo;

import java.util.List;

public class TodoListAdapter extends BaseAdapter{
    private Context context;//zhuti
    private List<Todo> data;

    public TodoListAdapter(Context context, List<Todo> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh;
        if (convertView == null) {//huishou jizhi//0~9
            Log.d("amy_todo", "NEW    position: " + position);
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
            vh = new ViewHolder();
            vh.todoText = (TextView) convertView.findViewById(R.id.todo_list_item_text);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        Todo todo = data.get(position);
        Log.d("amy_todo", "position: " + position);
        vh.todoText.setText(todo.text);
        ((TextView) convertView.findViewById(R.id.todo_list_item_text)).setText(todo.text);
        return convertView;
    }
}
