import com.google.gson.annotations.SerializedName

data class TotalCharge (

	@SerializedName("@RateTotalAmount") val RateTotalAmount : Double,
	@SerializedName("@EstimatedTotalAmount") val EstimatedTotalAmount : Double,
	@SerializedName("@CurrencyCode") val CurrencyCode : String
)