package dev.nakayiza.foodater

import android.os.Parcel
import android.os.Parcelable

data class RestaurantModel(
    var name:String?,
    var address:String?,
    var deliverycharge:String?,
    var image:String?,
    var menus:List<Menus>?,
    var hours: Hours?
)
data class Hours(
    var SUNDAY: String?,
    var MONDAY:String?,
    var TUESDAY:String?,
    var WEDNESDAY:String?,
    var THURSDAY:String?,
    var FRIDAY:String?,
    var SATURDAY:String?

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(SUNDAY)
        parcel.writeString(MONDAY)
        parcel.writeString(TUESDAY)
        parcel.writeString(WEDNESDAY)
        parcel.writeString(THURSDAY)
        parcel.writeString(FRIDAY)
        parcel.writeString(SATURDAY)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Hours> {
        override fun createFromParcel(parcel: Parcel): Hours {
            return Hours(parcel)
        }

        override fun newArray(size: Int): Array<Hours?> {
            return arrayOfNulls(size)
        }
    }
}

data class Menus(
    var name:String?,
    var price:String?,
    var url:String?,
    var totalinCart:Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(price)
        parcel.writeString(url)
        parcel.writeInt(totalinCart)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Menus> {
        override fun createFromParcel(parcel: Parcel): Menus {
            return Menus(parcel)
        }

        override fun newArray(size: Int): Array<Menus?> {
            return arrayOfNulls(size)
        }
    }
}