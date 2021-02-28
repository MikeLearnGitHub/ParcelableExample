package com.example.parcelableexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.parcelableexample.databinding.ActivityMainBinding
import com.example.parcelableexample.models.Item
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val clickListener = View.OnClickListener { view ->
            val button: Button = view as Button
            val passItem = Item(
                button.text.toString(),
                "Details",
                101.12,
                "Category"
            )
            val intent = Intent(this, ItemDetailsActivity::class.java)
            intent.putExtra("Extra_Item", passItem)
            startActivity(intent)
        }
        binding.btnNext.setOnClickListener(clickListener)
//        binding.btnNext.setOnClickListener {
//            val passItem = Item(
//                "title",
//                "Details",
//                101.12,
//                "Category"
//            )
//            val intent = Intent(this, ItemDetailsActivity::class.java)
//            intent.putExtra("Extra_Item", passItem)
//            startActivity(intent)
//        }
    }
}