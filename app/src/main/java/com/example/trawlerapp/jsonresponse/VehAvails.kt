import com.google.gson.annotations.SerializedName

data class VehAvails (

	@SerializedName("@Status") val Status : String,
	@SerializedName("Vehicle") val vehicle : Vehicle,
	@SerializedName("TotalCharge") val totalCharge : TotalCharge
)