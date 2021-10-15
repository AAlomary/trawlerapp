import com.google.gson.annotations.SerializedName

data class VehRentalCore (

	@SerializedName("@PickUpDateTime") val PickUpDateTime : String,
	@SerializedName("@ReturnDateTime") val ReturnDateTime : String,
	@SerializedName("PickUpLocation") val pickUpLocation : PickUpLocation,
	@SerializedName("ReturnLocation") val returnLocation : ReturnLocation
)