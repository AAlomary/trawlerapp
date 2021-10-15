import com.google.gson.annotations.SerializedName

data class VehVendorAvails (

	@SerializedName("Vendor") val vendor : Vendor,
	@SerializedName("VehAvails") val vehAvails : List<VehAvails>
)