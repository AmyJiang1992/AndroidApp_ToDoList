package com.example.ruotong.amytodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.ruotong.amytodolist.models.Todo;

import java.util.List;
// this is a converter. that converts a list of data into view
public class TodoListConverter {
    private Context context;
    private List<Todo> data;


    public TodoListConverter(Context context, List<Todo> data) {
        this.context = context;
        this.data = data;
    }

    public View getView(int position) {
        Todo todo = data.get(position);
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, null);
        ((TextView) view.findViewById(R.id.todo_list_item_text)).setText(todo.text);
        return view;
    }
}
