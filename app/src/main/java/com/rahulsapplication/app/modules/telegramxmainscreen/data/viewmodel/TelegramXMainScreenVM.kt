package com.rahulsapplication.app.modules.telegramxmainscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.telegramxmainscreen.`data`.model.TelegramXMainScreen1RowModel
import com.rahulsapplication.app.modules.telegramxmainscreen.`data`.model.TelegramXMainScreenModel
import kotlin.collections.MutableList

public class TelegramXMainScreenVM : ViewModel() {
  public val telegramXMainScreenModel: MutableLiveData<TelegramXMainScreenModel> =
      MutableLiveData(TelegramXMainScreenModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup70List: MutableLiveData<MutableList<TelegramXMainScreen1RowModel>> =
      MutableLiveData(mutableListOf())
}
