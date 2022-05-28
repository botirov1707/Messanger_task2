package com.example.messanger_task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messanger_task2.adapter.StoryAdapter
import com.example.messanger_task2.model.Story

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_main)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        val adapter = StoryAdapter(prepareStoryList())
        recyclerView.adapter = adapter
    }

    private fun prepareStoryList(): List<Story> {
        val stories: MutableList<Story> = ArrayList()
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))
        stories.add(Story(R.drawable.ic_add, R.drawable.img, "Add to Story"))


        return stories
    }

}