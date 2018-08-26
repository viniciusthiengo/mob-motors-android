package thiengo.com.br.mobmotors.domain

import android.os.Parcel
import android.os.Parcelable

class Seller(
        val phone: String,
        val type: String,
        val cityState: String
    ) : Parcelable {

    /*
     * Retorna o número de telefone celular do vendedor no
     * formato brasileiro.
     * */
    fun phoneLabel(): String =
        String.format(
            "(%s) %s-%s-%s",
            phone.substring( 0, 2 ),
            phone.substring( 2, 3 ),
            phone.substring( 3, 7 ),
            phone.substring( 7, 11 )
        )


    constructor(source: Parcel) : this(
        source.readString(),
        source.readString(),
        source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(phone)
        writeString(type)
        writeString(cityState)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Seller> = object : Parcelable.Creator<Seller> {
            override fun createFromParcel(source: Parcel): Seller = Seller(source)
            override fun newArray(size: Int): Array<Seller?> = arrayOfNulls(size)
        }
    }
}