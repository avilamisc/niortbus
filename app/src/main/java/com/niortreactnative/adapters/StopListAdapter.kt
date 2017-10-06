package com.niortreactnative.adapters


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.niortreactnative.R
import java.util.*
import kotlin.collections.ArrayList


/**
 * Created by davidc on 05/10/2017.
 */
class StopListAdapter(items:ArrayList<Stop>) : RecyclerView.Adapter<StopListAdapter.ViewHolder>(){

    private val TAG = "StopListAdapter"

    private var stops:List<Stop> = items


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var view:View = LayoutInflater.from(parent?.context).inflate(R.layout.stop_list_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.stop = stops[position]

        holder?.stopName?.text = stops[position].name
    }

    override fun getItemCount(): Int {
        return stops.size
    }

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        lateinit var stop:Stop

        var stopName:TextView = itemView.findViewById(R.id.stop_name) as TextView
    }
}