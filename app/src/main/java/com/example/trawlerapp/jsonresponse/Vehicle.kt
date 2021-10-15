import com.google.gson.annotations.SerializedName

data class Vehicle (

	@SerializedName("@AirConditionInd") val AirConditionInd : Boolean,
	@SerializedName("@TransmissionType") val TransmissionType : String,
	@SerializedName("@FuelType") val FuelType : String,
	@SerializedName("@DriveType") val DriveType : String,
	@SerializedName("@PassengerQuantity") val PassengerQuantity : String,
	@SerializedName("@BaggageQuantity") val BaggageQuantity : Int,
	@SerializedName("@Code") val Code : String,
	@SerializedName("@CodeContext") val CodeContext : String,
	@SerializedName("@DoorCount") val DoorCount : Int,
	@SerializedName("VehMakeModel") val vehMakeModel : VehMakeModel,
	@SerializedName("PictureURL") val pictureURL : String
)