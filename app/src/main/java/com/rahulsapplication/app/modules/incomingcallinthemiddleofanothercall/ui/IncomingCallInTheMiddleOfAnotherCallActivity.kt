package com.rahulsapplication.app.modules.incomingcallinthemiddleofanothercall.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIncomingCallInTheMiddleOfAnotherCallBinding
import com.rahulsapplication.app.modules.incomingcallinthemiddleofanothercall.`data`.viewmodel.IncomingCallInTheMiddleOfAnotherCallVM
import kotlin.String
import kotlin.Unit

public class IncomingCallInTheMiddleOfAnotherCallActivity :
    BaseActivity<ActivityIncomingCallInTheMiddleOfAnotherCallBinding>(R.layout.activity_incoming_call_in_the_middle_of_another_call)
    {
  private val viewModel: IncomingCallInTheMiddleOfAnotherCallVM by
      viewModels<IncomingCallInTheMiddleOfAnotherCallVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.incomingCallInTheMiddleOfAnotherCallVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "INCOMING_CALL_IN_THE_MIDDLE_OF_ANOTHER_CALL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IncomingCallInTheMiddleOfAnotherCallActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
