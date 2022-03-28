package com.rahulsapplication.app.modules.incomingcallnotification3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIncomingCallNotification5Binding
import com.rahulsapplication.app.modules.incomingcallnotification3.`data`.model.IncomingCallNotification5RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup188Adapter(
  public var list: List<IncomingCallNotification5RowModel>
) : RecyclerView.Adapter<RecyclerGroup188Adapter.RowIncomingCallNotification5VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIncomingCallNotification5VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_incoming_call_notification5,parent,false)
    return RowIncomingCallNotification5VH(view)
  }

  public override fun onBindViewHolder(holder: RowIncomingCallNotification5VH, position: Int):
      Unit {
    val incomingCallNotification5RowModel = IncomingCallNotification5RowModel()
    // TODO uncomment following line after integration with data source
    // val incomingCallNotification5RowModel = list[position]
    holder.binding.incomingCallNotification5RowModel = incomingCallNotification5RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IncomingCallNotification5RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: IncomingCallNotification5RowModel
    ): Unit {
    }
  }

  public inner class RowIncomingCallNotification5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIncomingCallNotification5Binding =
        RowIncomingCallNotification5Binding.bind(itemView)
  }
}
