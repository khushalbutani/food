package com.khushalsapplication.app.modules.thai.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.thai.`data`.model.ThaiModel
import com.khushalsapplication.app.modules.thai.`data`.model.ThaiRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ThaiVM : ViewModel(), KoinComponent {
  val thaiModel: MutableLiveData<ThaiModel> = MutableLiveData(ThaiModel())

  var navArguments: Bundle? = null

  val thaiList: MutableLiveData<MutableList<ThaiRowModel>> = MutableLiveData(mutableListOf())
}
