package com.example.recyclerviewhwclass21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Images
import android.view.LayoutInflater
import android.widget.Adapter
import com.example.recyclerviewhwclass21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var imageList = listOf<Image>(

        Image("https://images.pexels.com/photos/3196041/pexels-photo-3196041.jpeg",
            "flower",
            "Shallow Focus Photo of Red Floers\n",
            "alex",
            "3.1k"),
        Image("https://images.pexels.com/photos/1025323/pexels-photo-1025323.jpeg",
            "flower",
            "Closeup Photo of Purple-and-white Flowers\n",
            "hales",
            "5.6k"),
        Image("https://images.pexels.com/photos/479829/pexels-photo-479829.jpeg",
            "flower",
            "Tilt-shift Lens Photography of Purple Flowers\n",
            "john",
            "10k"),
        Image("https://images.pexels.com/photos/1119796/pexels-photo-1119796.jpeg",
            "bike",
            "Sports Bike Rider in Action\n",
            "Nills",
            "3k"),
        Image("https://images.pexels.com/photos/167569/pexels-photo-167569.jpeg",
            "bike",
            "Man in Repsol Orange White and Blue Motorcycle Racing Gear Riding Sports Bike\n",
            "cane",
            "15k"),
        Image("https://images.pexels.com/photos/112460/pexels-photo-112460.jpeg",
            "car",
            "Gray Mercedez Benz Amg\n",
            "Mike B",
            "5k"),
        Image("https://images.pexels.com/photos/16386035/pexels-photo-16386035.jpeg",
            "car",
            "Ferrari\n",
            "Mike B",
            "19.3k"),
        Image("https://images.pexels.com/photos/10942942/pexels-photo-10942942.jpeg",
            "horse",
            "Brown Horse With Brown Leather Saddle\n",
            "Moussa Idrissi",
            "20.2k"),
        Image("https://images.pexels.com/photos/3361739/pexels-photo-3361739.jpeg",
            "Dog",
            "Shih Tzu Photo on Studio Shot\n",
            "kjhgujb uy",
            "10k"),
        Image("https://images.pexels.com/photos/1170986/pexels-photo-1170986.jpeg",
            "cat",
            "Selective Focus Photography of Orange Tabby Cat\n",
            "EVG Kowalievska",
            "23.5k"),

    )

    lateinit var adapter : ImageAdapter

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ImageAdapter()
        adapter.submitList(imageList)

        binding.recyclerView.adapter = adapter

    }
}