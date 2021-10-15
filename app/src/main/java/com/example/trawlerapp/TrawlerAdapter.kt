package com.example.trawlerapp

import AllData
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class TrawlerAdapter(val allData:AllData, val context: Context): RecyclerView.Adapter<TrawlerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrawlerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val recyclerRow = layoutInflater.inflate(R.layout.recycler_row, parent, false)
        return TrawlerViewHolder(recyclerRow)
    }

    override fun onBindViewHolder(holder: TrawlerViewHolder, position: Int) {
        val vehicleAvils = allData.vehAvailRSCore.vehVendorAvails[position]
        val vehicle = vehicleAvils.vehAvails[position].vehicle
        val totalCharge = vehicleAvils.vehAvails[position].totalCharge

        holder.view.make_model?.text = vehicle.vehMakeModel.Name
        holder.view.vendor?.text = vehicleAvils.vendor.Name
        holder.view.passenger?.text = vehicle.PassengerQuantity
        holder.view.price?.text = totalCharge.RateTotalAmount.toString()
        holder.view.fuel?.text = vehicle.FuelType
        holder.view.baggage?.text = vehicle.BaggageQuantity.toString()
        holder.view.parentLayout.setOnClickListener {
            val intent: Intent = Intent(context, FullPageActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        var total = 0
        allData.vehAvailRSCore.vehVendorAvails.let {

            total = it.size
        }
        return total
    }
}

class TrawlerViewHolder(val view: View): RecyclerView.ViewHolder(view){

}