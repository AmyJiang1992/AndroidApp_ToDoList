package com.example.ruotong.amytodolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ruotong.amytodolist.models.Todo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private List<Todo> mockData() {
        List<Todo> list = new ArrayList<>();
        for (int i = 0; i < 1000; ++i) {
            list.add(new Todo("todo" + i));
        }
        return list;
    }


}
