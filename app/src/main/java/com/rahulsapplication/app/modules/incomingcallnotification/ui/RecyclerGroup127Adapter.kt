package com.rahulsapplication.app.modules.incomingcallnotification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIncomingCallNotification1Binding
import com.rahulsapplication.app.modules.incomingcallnotification.`data`.model.IncomingCallNotification1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup127Adapter(
  public var list: List<IncomingCallNotification1RowModel>
) : RecyclerView.Adapter<RecyclerGroup127Adapter.RowIncomingCallNotification1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIncomingCallNotification1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_incoming_call_notification1,parent,false)
    return RowIncomingCallNotification1VH(view)
  }

  public override fun onBindViewHolder(holder: RowIncomingCallNotification1VH, position: Int):
      Unit {
    val incomingCallNotification1RowModel = IncomingCallNotification1RowModel()
    // TODO uncomment following line after integration with data source
    // val incomingCallNotification1RowModel = list[position]
    holder.binding.incomingCallNotification1RowModel = incomingCallNotification1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IncomingCallNotification1RowModel>): Unit {
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
      item: IncomingCallNotification1RowModel
    ): Unit {
    }
  }

  public inner class RowIncomingCallNotification1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIncomingCallNotification1Binding =
        RowIncomingCallNotification1Binding.bind(itemView)
  }
}
