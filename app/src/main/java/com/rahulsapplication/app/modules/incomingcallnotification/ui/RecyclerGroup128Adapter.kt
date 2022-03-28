package com.rahulsapplication.app.modules.incomingcallnotification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIncomingCallNotification2Binding
import com.rahulsapplication.app.modules.incomingcallnotification.`data`.model.IncomingCallNotification2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup128Adapter(
  public var list: List<IncomingCallNotification2RowModel>
) : RecyclerView.Adapter<RecyclerGroup128Adapter.RowIncomingCallNotification2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIncomingCallNotification2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_incoming_call_notification2,parent,false)
    return RowIncomingCallNotification2VH(view)
  }

  public override fun onBindViewHolder(holder: RowIncomingCallNotification2VH, position: Int):
      Unit {
    val incomingCallNotification2RowModel = IncomingCallNotification2RowModel()
    // TODO uncomment following line after integration with data source
    // val incomingCallNotification2RowModel = list[position]
    holder.binding.incomingCallNotification2RowModel = incomingCallNotification2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IncomingCallNotification2RowModel>): Unit {
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
      item: IncomingCallNotification2RowModel
    ): Unit {
    }
  }

  public inner class RowIncomingCallNotification2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIncomingCallNotification2Binding =
        RowIncomingCallNotification2Binding.bind(itemView)
  }
}
