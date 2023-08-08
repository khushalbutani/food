package com.khushalsapplication.app.modules.chinese.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.chinese.`data`.model.ChineseModel
import com.khushalsapplication.app.modules.chinese.`data`.model.ChineseRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChineseVM : ViewModel(), KoinComponent {
  val chineseModel: MutableLiveData<ChineseModel> = MutableLiveData(ChineseModel())

  var navArguments: Bundle? = null

  val chineseList: MutableLiveData<MutableList<ChineseRowModel>> = MutableLiveData(mutableListOf())
}
