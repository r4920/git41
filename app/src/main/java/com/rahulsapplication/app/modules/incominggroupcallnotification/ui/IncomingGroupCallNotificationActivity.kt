package com.rahulsapplication.app.modules.incominggroupcallnotification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIncomingGroupCallNotificationBinding
import com.rahulsapplication.app.modules.incominggroupcallnotification.`data`.model.IncomingGroupCallNotification1RowModel
import com.rahulsapplication.app.modules.incominggroupcallnotification.`data`.model.IncomingGroupCallNotification2RowModel
import com.rahulsapplication.app.modules.incominggroupcallnotification.`data`.viewmodel.IncomingGroupCallNotificationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class IncomingGroupCallNotificationActivity :
    BaseActivity<ActivityIncomingGroupCallNotificationBinding>(R.layout.activity_incoming_group_call_notification)
    {
  private val viewModel: IncomingGroupCallNotificationVM by
      viewModels<IncomingGroupCallNotificationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup314Adapter =
    RecyclerGroup314Adapter(viewModel.recyclerGroup314List.value?:mutableListOf())
    binding.recyclerGroup314.adapter = recyclerGroup314Adapter
    recyclerGroup314Adapter.setOnItemClickListener(
    object : RecyclerGroup314Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IncomingGroupCallNotification1RowModel) {
        onClickRecyclerGroup314(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup314List.observe(this) {
      recyclerGroup314Adapter.updateData(it)
    }
    val recyclerGroup315Adapter =
    RecyclerGroup315Adapter(viewModel.recyclerGroup315List.value?:mutableListOf())
    binding.recyclerGroup315.adapter = recyclerGroup315Adapter
    recyclerGroup315Adapter.setOnItemClickListener(
    object : RecyclerGroup315Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IncomingGroupCallNotification2RowModel) {
        onClickRecyclerGroup315(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup315List.observe(this) {
      recyclerGroup315Adapter.updateData(it)
    }
    binding.incomingGroupCallNotificationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup314(
    view: View,
    position: Int,
    item: IncomingGroupCallNotification1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup315(
    view: View,
    position: Int,
    item: IncomingGroupCallNotification2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INCOMING_GROUP_CALL_NOTIFICATION_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IncomingGroupCallNotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
