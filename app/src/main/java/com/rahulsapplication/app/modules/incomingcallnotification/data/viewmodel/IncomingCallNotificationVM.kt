package com.rahulsapplication.app.modules.incomingcallnotification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.incomingcallnotification.`data`.model.IncomingCallNotification1RowModel
import com.rahulsapplication.app.modules.incomingcallnotification.`data`.model.IncomingCallNotification2RowModel
import com.rahulsapplication.app.modules.incomingcallnotification.`data`.model.IncomingCallNotificationModel
import kotlin.collections.MutableList

public class IncomingCallNotificationVM : ViewModel() {
  public val incomingCallNotificationModel: MutableLiveData<IncomingCallNotificationModel> =
      MutableLiveData(IncomingCallNotificationModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup127List: MutableLiveData<MutableList<IncomingCallNotification1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup128List: MutableLiveData<MutableList<IncomingCallNotification2RowModel>> =
      MutableLiveData(mutableListOf())
}
