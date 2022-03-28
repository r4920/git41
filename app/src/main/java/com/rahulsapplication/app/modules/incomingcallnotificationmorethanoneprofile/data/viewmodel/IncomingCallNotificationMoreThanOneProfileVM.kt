package com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.`data`.model.IncomingCallNotificationMoreThanOneProfile1RowModel
import com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.`data`.model.IncomingCallNotificationMoreThanOneProfile2RowModel
import com.rahulsapplication.app.modules.incomingcallnotificationmorethanoneprofile.`data`.model.IncomingCallNotificationMoreThanOneProfileModel
import kotlin.collections.MutableList

public class IncomingCallNotificationMoreThanOneProfileVM : ViewModel() {
  public val incomingCallNotificationMoreThanOneProfileModel:
      MutableLiveData<IncomingCallNotificationMoreThanOneProfileModel> =
      MutableLiveData(IncomingCallNotificationMoreThanOneProfileModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup248List:
      MutableLiveData<MutableList<IncomingCallNotificationMoreThanOneProfile1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup249List:
      MutableLiveData<MutableList<IncomingCallNotificationMoreThanOneProfile2RowModel>> =
      MutableLiveData(mutableListOf())
}
