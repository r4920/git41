package com.rahulsapplication.app.modules.incomingcallnotification3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIncomingCallNotification3Binding
import com.rahulsapplication.app.modules.incomingcallnotification3.`data`.model.IncomingCallNotification4RowModel
import com.rahulsapplication.app.modules.incomingcallnotification3.`data`.model.IncomingCallNotification5RowModel
import com.rahulsapplication.app.modules.incomingcallnotification3.`data`.viewmodel.IncomingCallNotification3VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class IncomingCallNotification3Activity :
    BaseActivity<ActivityIncomingCallNotification3Binding>(R.layout.activity_incoming_call_notification3)
    {
  private val viewModel: IncomingCallNotification3VM by viewModels<IncomingCallNotification3VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup187Adapter =
    RecyclerGroup187Adapter(viewModel.recyclerGroup187List.value?:mutableListOf())
    binding.recyclerGroup187.adapter = recyclerGroup187Adapter
    recyclerGroup187Adapter.setOnItemClickListener(
    object : RecyclerGroup187Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IncomingCallNotification4RowModel) {
        onClickRecyclerGroup187(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup187List.observe(this) {
      recyclerGroup187Adapter.updateData(it)
    }
    val recyclerGroup188Adapter =
    RecyclerGroup188Adapter(viewModel.recyclerGroup188List.value?:mutableListOf())
    binding.recyclerGroup188.adapter = recyclerGroup188Adapter
    recyclerGroup188Adapter.setOnItemClickListener(
    object : RecyclerGroup188Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IncomingCallNotification5RowModel) {
        onClickRecyclerGroup188(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup188List.observe(this) {
      recyclerGroup188Adapter.updateData(it)
    }
    binding.incomingCallNotification3VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup187(
    view: View,
    position: Int,
    item: IncomingCallNotification4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup188(
    view: View,
    position: Int,
    item: IncomingCallNotification5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INCOMING_CALL_NOTIFICATION3ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IncomingCallNotification3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
