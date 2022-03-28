package com.rahulsapplication.app.modules.incomingcallnotification3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIncomingCallNotification4Binding
import com.rahulsapplication.app.modules.incomingcallnotification3.`data`.model.IncomingCallNotification4RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup187Adapter(
  public var list: List<IncomingCallNotification4RowModel>
) : RecyclerView.Adapter<RecyclerGroup187Adapter.RowIncomingCallNotification4VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIncomingCallNotification4VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_incoming_call_notification4,parent,false)
    return RowIncomingCallNotification4VH(view)
  }

  public override fun onBindViewHolder(holder: RowIncomingCallNotification4VH, position: Int):
      Unit {
    val incomingCallNotification4RowModel = IncomingCallNotification4RowModel()
    // TODO uncomment following line after integration with data source
    // val incomingCallNotification4RowModel = list[position]
    holder.binding.incomingCallNotification4RowModel = incomingCallNotification4RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IncomingCallNotification4RowModel>): Unit {
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
      item: IncomingCallNotification4RowModel
    ): Unit {
    }
  }

  public inner class RowIncomingCallNotification4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIncomingCallNotification4Binding =
        RowIncomingCallNotification4Binding.bind(itemView)
  }
}
