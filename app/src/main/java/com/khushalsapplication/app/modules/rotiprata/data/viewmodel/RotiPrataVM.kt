package com.khushalsapplication.app.modules.rotiprata.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.rotiprata.`data`.model.RotiPrataModel
import com.khushalsapplication.app.modules.rotiprata.`data`.model.RotiPrataRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RotiPrataVM : ViewModel(), KoinComponent {
  val rotiPrataModel: MutableLiveData<RotiPrataModel> = MutableLiveData(RotiPrataModel())

  var navArguments: Bundle? = null

  val rotiPrataList: MutableLiveData<MutableList<RotiPrataRowModel>> =
      MutableLiveData(mutableListOf())
}
