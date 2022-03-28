package com.rahulsapplication.app.modules.incomingcallnotification.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class IncomingCallNotification2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRobertLeeZeme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_robert_lee_zeme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDirector: String? = MyApp.getInstance().resources.getString(R.string.lbl_director)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMaybe: String? = MyApp.getInstance().resources.getString(R.string.lbl_maybe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMay02: String? = MyApp.getInstance().resources.getString(R.string.lbl_may_02)

)
