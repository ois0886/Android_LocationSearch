package com.example.myapplication.model.entity

import android.os.Parcelable
import com.example.myapplication.model.entity.LocationLatLngEntity
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchResultEntity(
    val fullAddress: String,
    val name: String,
    val locationLatLng: LocationLatLngEntity
) : Parcelable