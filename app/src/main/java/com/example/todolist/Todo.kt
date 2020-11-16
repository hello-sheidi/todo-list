package com.example.todolist

/* Create a class that represents todo item
*  It's goal is to keep data  */

data class Todo (
    //It contains constructor with 2 properties: title and done/not done representation
    val title: String,
    var isChecked: Boolean = false
)