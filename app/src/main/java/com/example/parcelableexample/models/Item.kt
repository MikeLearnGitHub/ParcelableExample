package com.example.parcelableexample.models

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item (
    val title: String,
    val details: String,
    val price: Double,
    val category: String
    ) : Parcelable