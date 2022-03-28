package com.rahulsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityAppNavigationBinding
import com.rahulsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.rahulsapplication.app.modules.incomingcallinthemiddleofanothercall.ui.IncomingCallInTheMiddleOfAnotherCallActivity
import com.rahulsapplication.app.modules.incomingcallnotification.ui.IncomingCallNotificationActivity
import com.rahulsapplication.app.modules.incomingcallnotification3.ui.IncomingCallNotification3Activity
import com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.ui.IncomingCallNotificationMoreThanOneProfileActivity
import com.rahulsapplication.app.modules.incominggroupcallnotification.ui.IncomingGroupCallNotificationActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linear04IncomingCallNotificationMoreThanOneProfile.setOnClickListener {
      val destIntent = IncomingCallNotificationMoreThanOneProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear03IncomingCallNotification.setOnClickListener {
      val destIntent = IncomingCallNotification3Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear05IncomingGroupCallNotification.setOnClickListener {
      val destIntent = IncomingGroupCallNotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear06IncomingCallInTheMiddleOfAnotherCall.setOnClickListener {
      val destIntent = IncomingCallInTheMiddleOfAnotherCallActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear02IncomingCallNotification.setOnClickListener {
      val destIntent = IncomingCallNotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
