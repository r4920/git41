package com.rahulsapplication.app.modules.incomingcallnotification3.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.incomingcallnotification3.`data`.model.IncomingCallNotification3Model
import com.rahulsapplication.app.modules.incomingcallnotification3.`data`.model.IncomingCallNotification4RowModel
import com.rahulsapplication.app.modules.incomingcallnotification3.`data`.model.IncomingCallNotification5RowModel
import kotlin.collections.MutableList

public class IncomingCallNotification3VM : ViewModel() {
  public val incomingCallNotification3Model: MutableLiveData<IncomingCallNotification3Model> =
      MutableLiveData(IncomingCallNotification3Model())

  public var navArguments: Bundle? = null

  public val recyclerGroup187List: MutableLiveData<MutableList<IncomingCallNotification4RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup188List: MutableLiveData<MutableList<IncomingCallNotification5RowModel>> =
      MutableLiveData(mutableListOf())
}
