package com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIncomingCallNotificationMoreThanOneProfile1Binding
import com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.`data`.model.IncomingCallNotificationMoreThanOneProfile1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup248Adapter(
  public var list: List<IncomingCallNotificationMoreThanOneProfile1RowModel>
) : RecyclerView.Adapter<RecyclerGroup248Adapter.RowIncomingCallNotificationMoreThanOneProfile1VH>()
    {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIncomingCallNotificationMoreThanOneProfile1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_incoming_call_notification_more_than_one_profile1,parent,false)
    return RowIncomingCallNotificationMoreThanOneProfile1VH(view)
  }

  public override fun onBindViewHolder(holder: RowIncomingCallNotificationMoreThanOneProfile1VH,
      position: Int): Unit {
    val incomingCallNotificationMoreThanOneProfile1RowModel =
        IncomingCallNotificationMoreThanOneProfile1RowModel()
    // TODO uncomment following line after integration with data source
    // val incomingCallNotificationMoreThanOneProfile1RowModel = list[position]
    holder.binding.incomingCallNotificationMoreThanOneProfile1RowModel =
        incomingCallNotificationMoreThanOneProfile1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IncomingCallNotificationMoreThanOneProfile1RowModel>): Unit {
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
      item: IncomingCallNotificationMoreThanOneProfile1RowModel
    ): Unit {
    }
  }

  public inner class RowIncomingCallNotificationMoreThanOneProfile1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIncomingCallNotificationMoreThanOneProfile1Binding =
        RowIncomingCallNotificationMoreThanOneProfile1Binding.bind(itemView)
  }
}
