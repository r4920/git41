package com.rahulsapplication.app.modules.incomingcallnotification3.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class IncomingCallNotification4RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtBufordMadDog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buford_mad_dog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYouChickenMc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_chicken_mc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1138AM: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_38_am)

)
