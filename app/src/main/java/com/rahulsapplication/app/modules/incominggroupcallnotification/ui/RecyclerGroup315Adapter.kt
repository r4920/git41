package com.rahulsapplication.app.modules.incominggroupcallnotification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIncomingGroupCallNotification2Binding
import com.rahulsapplication.app.modules.incominggroupcallnotification.`data`.model.IncomingGroupCallNotification2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup315Adapter(
  public var list: List<IncomingGroupCallNotification2RowModel>
) : RecyclerView.Adapter<RecyclerGroup315Adapter.RowIncomingGroupCallNotification2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIncomingGroupCallNotification2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_incoming_group_call_notification2,parent,false)
    return RowIncomingGroupCallNotification2VH(view)
  }

  public override fun onBindViewHolder(holder: RowIncomingGroupCallNotification2VH, position: Int):
      Unit {
    val incomingGroupCallNotification2RowModel = IncomingGroupCallNotification2RowModel()
    // TODO uncomment following line after integration with data source
    // val incomingGroupCallNotification2RowModel = list[position]
    holder.binding.incomingGroupCallNotification2RowModel = incomingGroupCallNotification2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IncomingGroupCallNotification2RowModel>): Unit {
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
      item: IncomingGroupCallNotification2RowModel
    ): Unit {
    }
  }

  public inner class RowIncomingGroupCallNotification2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIncomingGroupCallNotification2Binding =
        RowIncomingGroupCallNotification2Binding.bind(itemView)
  }
}
