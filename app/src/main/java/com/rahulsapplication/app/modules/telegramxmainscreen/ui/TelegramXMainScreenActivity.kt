package com.rahulsapplication.app.modules.telegramxmainscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityTelegramXMainScreenBinding
import com.rahulsapplication.app.modules.telegramxmainscreen.`data`.model.TelegramXMainScreen1RowModel
import com.rahulsapplication.app.modules.telegramxmainscreen.`data`.viewmodel.TelegramXMainScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class TelegramXMainScreenActivity :
    BaseActivity<ActivityTelegramXMainScreenBinding>(R.layout.activity_telegram_x_main_screen) {
  private val viewModel: TelegramXMainScreenVM by viewModels<TelegramXMainScreenVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup70Adapter =
    RecyclerGroup70Adapter(viewModel.recyclerGroup70List.value?:mutableListOf())
    binding.recyclerGroup70.adapter = recyclerGroup70Adapter
    recyclerGroup70Adapter.setOnItemClickListener(
    object : RecyclerGroup70Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TelegramXMainScreen1RowModel) {
        onClickRecyclerGroup70(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup70List.observe(this) {
      recyclerGroup70Adapter.updateData(it)
    }
    binding.telegramXMainScreenVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup70(
    view: View,
    position: Int,
    item: TelegramXMainScreen1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "TELEGRAM_X_MAIN_SCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TelegramXMainScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
