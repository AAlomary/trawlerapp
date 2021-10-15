import com.google.gson.annotations.SerializedName

data class Vendor (

	@SerializedName("@Code") val Code : Int,
	@SerializedName("@Name") val Name : String
)