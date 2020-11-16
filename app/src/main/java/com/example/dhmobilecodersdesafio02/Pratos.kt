package com.example.dhmobilecodersdesafio02

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Pratos(
        val itemPicture: String,
        val itemTitle: String,
        val itemDescription: String = ""
):Parcelable {
}