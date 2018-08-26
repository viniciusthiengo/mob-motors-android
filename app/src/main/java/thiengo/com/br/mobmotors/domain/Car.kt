package thiengo.com.br.mobmotors.domain

import android.os.Parcel
import android.os.Parcelable
import java.util.*

class Car(
        val model: String,
        val brand: String,
        val price: Float,
        val shortDescription: String,
        val yearProduction: Int,
        val yearModel: Int,
        val kilometers: Int,
        val carChanges: String,
        val seller: Seller,
        val moreInfo: MoreInfo,
        val imagesUrl: List<String>
    ) : Parcelable {

    fun carLabel(): String =
        String.format( "%s %s", brand, model )

    fun yearProdModelLabel(): String =
        String.format( "%d / %d", yearProduction, yearModel )

    /*
     * A vírgula em "%,d" indica que o separador de milhar deve
     * ser utilizado. O valor Locale.GERMANY garante que o
     * separador de milhar será um "." e não uma ",".
     * */
    fun kilometersLabel(): String =
        String.format( Locale.GERMANY, "%,d", kilometers )

    fun priceLabel(): String =
        String.format( Locale.GERMANY, "R$ %,.2f", price )

    /*
     * A primeira imagem em imagesUrl é sempre tratada com imagem
     * principal do carro, em nosso domínio de problema.
     * */
    fun getMainImage(): String =
        imagesUrl[0]


    constructor(source: Parcel) : this(
        source.readString(),
        source.readString(),
        source.readFloat(),
        source.readString(),
        source.readInt(),
        source.readInt(),
        source.readInt(),
        source.readString(),
        source.readParcelable<Seller>(Seller::class.java.classLoader),
        source.readParcelable<MoreInfo>(MoreInfo::class.java.classLoader),
        source.createStringArrayList()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(model)
        writeString(brand)
        writeFloat(price)
        writeString(shortDescription)
        writeInt(yearProduction)
        writeInt(yearModel)
        writeInt(kilometers)
        writeString(carChanges)
        writeParcelable(seller, 0)
        writeParcelable(moreInfo, 0)
        writeStringList(imagesUrl)
    }

    companion object {
        const val KEY = "car"
        const val KEY_IMAGE = "image"

        @JvmField
        val CREATOR: Parcelable.Creator<Car> = object : Parcelable.Creator<Car> {
            override fun createFromParcel( source: Parcel ): Car = Car( source )
            override fun newArray( size: Int ): Array<Car?> = arrayOfNulls( size )
        }
    }
}