package com.my.mychat

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.my.mychat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listView: ListView
    private lateinit var chatGroups: ArrayList<String> // Example list of chat groups

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listView = findViewById(R.id.list)

        val data = listOf("Item 1", "Item 2", "Item 3") // Replace with your actual data
 // Update with the correct ListView ID from your layout

        chatGroups = ArrayList()

        // Example data, replace with your actual data
        chatGroups.add("Group 1")
        chatGroups.add("Group 2")
        chatGroups.add("Group 3")

        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, chatGroups)
        listView.adapter = adapter

        // Handle click event on chat group item
        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedChatGroup = chatGroups[position]
            // Launch chat activity for the selected group
            openChatActivity(selectedChatGroup)
        }
    }

    private fun openChatActivity(chatGroup: String) {
        // TODO: Launch chat activity with the selected chat group
        // You can pass the chat group information to the chat activity
        // using Intent extras or any other suitable method
    }
}