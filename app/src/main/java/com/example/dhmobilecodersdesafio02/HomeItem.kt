package com.example.dhmobilecodersdesafio02

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HomeItem(
        val itemPicture: String,
        val itemTitle: String,
        val itemAdress: String = "",
        val itemTime: String = "",
        val lpratos: MutableList<Pratos>
    ):Parcelable{
}


