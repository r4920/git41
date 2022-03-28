package com.rahulsapplication.app.modules.appnavigation.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt02IncomingCallNotification: String? =
      MyApp.getInstance().resources.getString(R.string.msg_02_incoming_cal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt03IncomingCallNotification: String? =
      MyApp.getInstance().resources.getString(R.string.msg_03_incoming_cal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt04IncomingCallNotificationMoreThanOneProfile: String? =
      MyApp.getInstance().resources.getString(R.string.msg_04_incoming_cal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt05IncomingGroupCallNotification: String? =
      MyApp.getInstance().resources.getString(R.string.msg_05_incoming_gr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt06IncomingCallInTheMiddleOfAnotherCall: String? =
      MyApp.getInstance().resources.getString(R.string.msg_06_incoming_cal)

)
