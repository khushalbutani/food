package com.khushalsapplication.app.modules.tirmisu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.tirmisu.`data`.model.TirmisuModel
import com.khushalsapplication.app.modules.tirmisu.`data`.model.TirmisuRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TirmisuVM : ViewModel(), KoinComponent {
  val tirmisuModel: MutableLiveData<TirmisuModel> = MutableLiveData(TirmisuModel())

  var navArguments: Bundle? = null

  val tirmisuList: MutableLiveData<MutableList<TirmisuRowModel>> = MutableLiveData(mutableListOf())
}
