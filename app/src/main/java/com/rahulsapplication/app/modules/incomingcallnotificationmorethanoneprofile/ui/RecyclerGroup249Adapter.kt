package com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIncomingCallNotificationMoreThanOneProfile2Binding
import com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.`data`.model.IncomingCallNotificationMoreThanOneProfile2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup249Adapter(
  public var list: List<IncomingCallNotificationMoreThanOneProfile2RowModel>
) : RecyclerView.Adapter<RecyclerGroup249Adapter.RowIncomingCallNotificationMoreThanOneProfile2VH>()
    {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIncomingCallNotificationMoreThanOneProfile2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_incoming_call_notification_more_than_one_profile2,parent,false)
    return RowIncomingCallNotificationMoreThanOneProfile2VH(view)
  }

  public override fun onBindViewHolder(holder: RowIncomingCallNotificationMoreThanOneProfile2VH,
      position: Int): Unit {
    val incomingCallNotificationMoreThanOneProfile2RowModel =
        IncomingCallNotificationMoreThanOneProfile2RowModel()
    // TODO uncomment following line after integration with data source
    // val incomingCallNotificationMoreThanOneProfile2RowModel = list[position]
    holder.binding.incomingCallNotificationMoreThanOneProfile2RowModel =
        incomingCallNotificationMoreThanOneProfile2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IncomingCallNotificationMoreThanOneProfile2RowModel>): Unit {
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
      item: IncomingCallNotificationMoreThanOneProfile2RowModel
    ): Unit {
    }
  }

  public inner class RowIncomingCallNotificationMoreThanOneProfile2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIncomingCallNotificationMoreThanOneProfile2Binding =
        RowIncomingCallNotificationMoreThanOneProfile2Binding.bind(itemView)
  }
}
