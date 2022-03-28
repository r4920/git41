package com.rahulsapplication.app.modules.incomingcallnotification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIncomingCallNotificationBinding
import com.rahulsapplication.app.modules.incomingcallnotification.`data`.model.IncomingCallNotification1RowModel
import com.rahulsapplication.app.modules.incomingcallnotification.`data`.model.IncomingCallNotification2RowModel
import com.rahulsapplication.app.modules.incomingcallnotification.`data`.viewmodel.IncomingCallNotificationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class IncomingCallNotificationActivity :
    BaseActivity<ActivityIncomingCallNotificationBinding>(R.layout.activity_incoming_call_notification)
    {
  private val viewModel: IncomingCallNotificationVM by viewModels<IncomingCallNotificationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup127Adapter =
    RecyclerGroup127Adapter(viewModel.recyclerGroup127List.value?:mutableListOf())
    binding.recyclerGroup127.adapter = recyclerGroup127Adapter
    recyclerGroup127Adapter.setOnItemClickListener(
    object : RecyclerGroup127Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IncomingCallNotification1RowModel) {
        onClickRecyclerGroup127(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup127List.observe(this) {
      recyclerGroup127Adapter.updateData(it)
    }
    val recyclerGroup128Adapter =
    RecyclerGroup128Adapter(viewModel.recyclerGroup128List.value?:mutableListOf())
    binding.recyclerGroup128.adapter = recyclerGroup128Adapter
    recyclerGroup128Adapter.setOnItemClickListener(
    object : RecyclerGroup128Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IncomingCallNotification2RowModel) {
        onClickRecyclerGroup128(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup128List.observe(this) {
      recyclerGroup128Adapter.updateData(it)
    }
    binding.incomingCallNotificationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup127(
    view: View,
    position: Int,
    item: IncomingCallNotification1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup128(
    view: View,
    position: Int,
    item: IncomingCallNotification2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INCOMING_CALL_NOTIFICATION_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IncomingCallNotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
