package thiengo.com.br.mobmotors.domain

import android.os.Parcel
import android.os.Parcelable

class MoreInfo(
        val color: String,
        val bodyWork: String,
        val finalPlate: Int,
        val gas: String,
        val fullDescription: String
    ) : Parcelable {

    constructor(source: Parcel) : this(
            source.readString(),
            source.readString(),
            source.readInt(),
            source.readString(),
            source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel( dest: Parcel, flags: Int ) = with( dest ) {
        writeString(color)
        writeString(bodyWork)
        writeInt(finalPlate)
        writeString(gas)
        writeString(fullDescription)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<MoreInfo> = object : Parcelable.Creator<MoreInfo> {
            override fun createFromParcel(source: Parcel): MoreInfo = MoreInfo(source)
            override fun newArray(size: Int): Array<MoreInfo?> = arrayOfNulls(size)
        }
    }
}