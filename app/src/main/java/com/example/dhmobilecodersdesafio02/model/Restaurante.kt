package com.example.dhmobilecodersdesafio02.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Restaurante(
        val itemPicture: String,
        val itemTitle: String,
        val itemAdress: String = "",
        val itemTime: String = "",
        val lpratoes: MutableList<Prato>
    ):Parcelable{
}


