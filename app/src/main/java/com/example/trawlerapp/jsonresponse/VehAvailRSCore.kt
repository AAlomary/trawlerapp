import com.google.gson.annotations.SerializedName

data class VehAvailRSCore (

	@SerializedName("VehRentalCore") val vehRentalCore : VehRentalCore,
	@SerializedName("VehVendorAvails") val vehVendorAvails : List<VehVendorAvails>
)