package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var todoAdapter: TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Pass in an empty list, items will be added dynamically
        todoAdapter = TodoAdapter(mutableListOf())

        rvTodoItems.adapter = todoAdapter

        //Layout manager defines how items are arranged in the list
        rvTodoItems.layoutManager = LinearLayoutManager(this)

        //Define button's function
        btnAddTodo.setOnClickListener{
            val todoTitle = etTodoTitle.text.toString()
            if(todoTitle.isNotEmpty()) {
                val todo = Todo(todoTitle)
                todoAdapter.addTodo(todo)
                etTodoTitle.text.clear()
            }
        }

        btnDeleteDoneTodods.setOnClickListener {
            todoAdapter.deleteDoneTodos()
        }
    }
}


