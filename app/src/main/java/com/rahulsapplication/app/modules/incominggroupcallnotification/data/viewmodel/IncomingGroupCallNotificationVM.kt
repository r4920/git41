package com.rahulsapplication.app.modules.incominggroupcallnotification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.incominggroupcallnotification.`data`.model.IncomingGroupCallNotification1RowModel
import com.rahulsapplication.app.modules.incominggroupcallnotification.`data`.model.IncomingGroupCallNotification2RowModel
import com.rahulsapplication.app.modules.incominggroupcallnotification.`data`.model.IncomingGroupCallNotificationModel
import kotlin.collections.MutableList

public class IncomingGroupCallNotificationVM : ViewModel() {
  public val incomingGroupCallNotificationModel: MutableLiveData<IncomingGroupCallNotificationModel>
      = MutableLiveData(IncomingGroupCallNotificationModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup314List:
      MutableLiveData<MutableList<IncomingGroupCallNotification1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup315List:
      MutableLiveData<MutableList<IncomingGroupCallNotification2RowModel>> =
      MutableLiveData(mutableListOf())
}
