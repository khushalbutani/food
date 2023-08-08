package com.khushalsapplication.app.modules.hotdog.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.hotdog.`data`.model.HotDogModel
import com.khushalsapplication.app.modules.hotdog.`data`.model.HotDogRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HotDogVM : ViewModel(), KoinComponent {
  val hotDogModel: MutableLiveData<HotDogModel> = MutableLiveData(HotDogModel())

  var navArguments: Bundle? = null

  val hotDogList: MutableLiveData<MutableList<HotDogRowModel>> = MutableLiveData(mutableListOf())
}
