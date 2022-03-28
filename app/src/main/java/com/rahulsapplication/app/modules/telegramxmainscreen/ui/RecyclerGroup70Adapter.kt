package com.rahulsapplication.app.modules.telegramxmainscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowTelegramXMainScreen1Binding
import com.rahulsapplication.app.modules.telegramxmainscreen.`data`.model.TelegramXMainScreen1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup70Adapter(
  public var list: List<TelegramXMainScreen1RowModel>
) : RecyclerView.Adapter<RecyclerGroup70Adapter.RowTelegramXMainScreen1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowTelegramXMainScreen1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_telegram_x_main_screen1,parent,false)
    return RowTelegramXMainScreen1VH(view)
  }

  public override fun onBindViewHolder(holder: RowTelegramXMainScreen1VH, position: Int): Unit {
    val telegramXMainScreen1RowModel = TelegramXMainScreen1RowModel()
    // TODO uncomment following line after integration with data source
    // val telegramXMainScreen1RowModel = list[position]
    holder.binding.telegramXMainScreen1RowModel = telegramXMainScreen1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TelegramXMainScreen1RowModel>): Unit {
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
      item: TelegramXMainScreen1RowModel
    ): Unit {
    }
  }

  public inner class RowTelegramXMainScreen1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowTelegramXMainScreen1Binding =
        RowTelegramXMainScreen1Binding.bind(itemView)
  }
}
