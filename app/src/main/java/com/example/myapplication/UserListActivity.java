package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.example.myapplication.UserAdapter;
import com.example.myapplication.User;

public class UserListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<User> userList = DatabaseClient.getInstance(this).getAppDatabase().userDao().getAllUsers();
        UserAdapter adapter = new UserAdapter(userList);
        recyclerView.setAdapter(adapter);
    }
} 