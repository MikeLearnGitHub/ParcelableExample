package com.example.parcelableexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parcelableexample.R
import com.example.parcelableexample.models.Item
import kotlinx.android.synthetic.main.activity_item_details.*

class ItemDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_details)
        val item = intent.getParcelableExtra<Item>("Extra_Item")
        tvTitle.text = item?.title
        tvPrice.text = item?.price.toString()

    }
}