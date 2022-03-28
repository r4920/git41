package com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIncomingCallNotificationMoreThanOneProfileBinding
import com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.`data`.model.IncomingCallNotificationMoreThanOneProfile1RowModel
import com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.`data`.model.IncomingCallNotificationMoreThanOneProfile2RowModel
import com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.`data`.viewmodel.IncomingCallNotificationMoreThanOneProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class IncomingCallNotificationMoreThanOneProfileActivity :
    BaseActivity<ActivityIncomingCallNotificationMoreThanOneProfileBinding>(R.layout.activity_incoming_call_notification_more_than_one_profile)
    {
  private val viewModel: IncomingCallNotificationMoreThanOneProfileVM by
      viewModels<IncomingCallNotificationMoreThanOneProfileVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup248Adapter =
    RecyclerGroup248Adapter(viewModel.recyclerGroup248List.value?:mutableListOf())
    binding.recyclerGroup248.adapter = recyclerGroup248Adapter
    recyclerGroup248Adapter.setOnItemClickListener(
    object : RecyclerGroup248Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IncomingCallNotificationMoreThanOneProfile1RowModel) {
        onClickRecyclerGroup248(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup248List.observe(this) {
      recyclerGroup248Adapter.updateData(it)
    }
    val recyclerGroup249Adapter =
    RecyclerGroup249Adapter(viewModel.recyclerGroup249List.value?:mutableListOf())
    binding.recyclerGroup249.adapter = recyclerGroup249Adapter
    recyclerGroup249Adapter.setOnItemClickListener(
    object : RecyclerGroup249Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IncomingCallNotificationMoreThanOneProfile2RowModel) {
        onClickRecyclerGroup249(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup249List.observe(this) {
      recyclerGroup249Adapter.updateData(it)
    }
    binding.incomingCallNotificationMoreThanOneProfileVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup248(
    view: View,
    position: Int,
    item: IncomingCallNotificationMoreThanOneProfile1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup249(
    view: View,
    position: Int,
    item: IncomingCallNotificationMoreThanOneProfile2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INCOMING_CALL_NOTIFICATION_MORE_THAN_ONE_PROFILE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                IncomingCallNotificationMoreThanOneProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
