//package com.example.trawlerapp
//
//import com.google.gson.annotations.SerializedName
//
//data class AllData(
//    @SerializedName("VehAvailRSCore") val allVeh: List<AllVeh>?
//)
//data class AllVeh(
//    @SerializedName("VehAvailRSCore") val VehAvailRSCore: VehAvailRSCore?
//)
//data class VehAvailRSCore(
//    @SerializedName("VehRentalCore") val VehRentalCore: List<VehRentalCore>?,
//    @SerializedName("VehVendorAvails") val VehVendorAvails: List<VehVendorAvails>?
//)
//
//data class VehRentalCore(
//    @SerializedName("@PickUpDateTime")val PickUpDateTime: String?,
//    @SerializedName("@ReturnDateTime")val ReturnDateTime: String?,
//    @SerializedName("PickUpLocation")val PickUpLocation: PickUpLocation,
//    @SerializedName("ReturnLocation")val ReturnLocation: ReturnLocation
//)
//data class PickUpLocation(
//    @SerializedName("@Name") val Name: String?
//)
//data class ReturnLocation(
//    @SerializedName("@Name") val Name: String?
//)
//data class VehVendorAvails(
//    val VehVendorAvail: List<VehVendorAvail>
//)
//data class VehVendorAvail(
//    @SerializedName("Vendor")val Vendor: Vendor,
//    @SerializedName("VehAvails")val VehAvails: VehAvails
//)
//data class Vendor(
//    @SerializedName("@Code")val Code: String?,
//    @SerializedName("@Name")val Name: String?
//)
//data class VehAvails(
//    val vehAvail: List<VehAvail>?
//)
//data class VehAvail(
//    @SerializedName("@Status")val Status: String?,
//    @SerializedName("Vehicle")val Vehicle: Vehicle?,
//    @SerializedName("TotalCharge") val TotalCharge: TotalCharge?
//)
//data class Vehicle(
//    @SerializedName("@AirConditionInd")val AirConditionInd: Boolean?,
//    @SerializedName("@TransmissionType")val TransmissionType: String?,
//    @SerializedName("@FuelType")val FuelType: String?,
//    @SerializedName("@DriveType")val DriveType: String?,
//    @SerializedName("@PassengerQuantity")val PassengerQuantity: String?,
//    @SerializedName("@BaggageQuantity")val BaggageQuantity: String?,
//    @SerializedName("@Code")val Code: String?,
//    @SerializedName("@CodeContext")val CodeContext: String?,
//    @SerializedName("@DoorCount") val DoorCount: String?,
//    @SerializedName("VehMakeModel")val VehMakeModel: VehMakeModel?,
//    @SerializedName("PictureURL")val PictureURL: String?
//)
//data class TotalCharge(
//    @SerializedName("@RateTotalAmount")val RateTotalAmount: String,
//    @SerializedName("@EstimatedTotalAmount")val EstimatedTotalAmount: String,
//    @SerializedName("@CurrencyCode")val CurrencyCode: String
//)
//data class VehMakeModel(
//    @SerializedName("@Name")val Name: String?
//)
