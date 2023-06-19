package com.example.project_massive_vacalam

import android.os.Parcel
import android.os.Parcelable

data class EventData(
    val gambarEvent: Int,
    val namaEvent: String,
    val alamatEvent: String,
    val deskEvent: String,
    val galleryEvent: List<Int>) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        mutableListOf<Int>().apply {
            parcel.readList(this, Int::class.java.classLoader)
        }
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(gambarEvent)
        parcel.writeString(namaEvent)
        parcel.writeString(alamatEvent)
        parcel.writeString(deskEvent)
        parcel.writeList(galleryEvent)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<EventData> {
        override fun createFromParcel(parcel: Parcel): EventData {
            return EventData(parcel)
        }

        override fun newArray(size: Int): Array<EventData?> {
            return arrayOfNulls(size)
        }
    }
}
