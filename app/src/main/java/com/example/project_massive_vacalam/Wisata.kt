package com.example.project_massive_vacalam

import android.os.Parcel
import android.os.Parcelable

data class Wisata(
    val gambarWisata: Int,
    val namaWisata: String,
    val alamatWisata: String,
    val jamBuka: String,
    val deskWisata: String,
    val hargaTiket: Int,
    val gallery: List<Int>) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        mutableListOf<Int>().apply {
            parcel.readList(this, Int::class.java.classLoader)
        }
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(gambarWisata)
        parcel.writeString(namaWisata)
        parcel.writeString(alamatWisata)
        parcel.writeString(jamBuka)
        parcel.writeString(deskWisata)
        parcel.writeInt(hargaTiket)
        parcel.writeList(gallery)
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun toString(): String {
        return namaWisata
    }

    companion object CREATOR : Parcelable.Creator<Wisata> {
        override fun createFromParcel(parcel: Parcel): Wisata {
            return Wisata(parcel)
        }

        override fun newArray(size: Int): Array<Wisata?> {
            return arrayOfNulls(size)
        }
    }
}
