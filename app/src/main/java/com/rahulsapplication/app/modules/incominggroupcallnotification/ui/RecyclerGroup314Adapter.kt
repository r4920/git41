package com.rahulsapplication.app.modules.incominggroupcallnotification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIncomingGroupCallNotification1Binding
import com.rahulsapplication.app.modules.incominggroupcallnotification.`data`.model.IncomingGroupCallNotification1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup314Adapter(
  public var list: List<IncomingGroupCallNotification1RowModel>
) : RecyclerView.Adapter<RecyclerGroup314Adapter.RowIncomingGroupCallNotification1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIncomingGroupCallNotification1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_incoming_group_call_notification1,parent,false)
    return RowIncomingGroupCallNotification1VH(view)
  }

  public override fun onBindViewHolder(holder: RowIncomingGroupCallNotification1VH, position: Int):
      Unit {
    val incomingGroupCallNotification1RowModel = IncomingGroupCallNotification1RowModel()
    // TODO uncomment following line after integration with data source
    // val incomingGroupCallNotification1RowModel = list[position]
    holder.binding.incomingGroupCallNotification1RowModel = incomingGroupCallNotification1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IncomingGroupCallNotification1RowModel>): Unit {
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
      item: IncomingGroupCallNotification1RowModel
    ): Unit {
    }
  }

  public inner class RowIncomingGroupCallNotification1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIncomingGroupCallNotification1Binding =
        RowIncomingGroupCallNotification1Binding.bind(itemView)
  }
}
