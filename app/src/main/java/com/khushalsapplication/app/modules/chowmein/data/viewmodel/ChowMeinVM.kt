package com.khushalsapplication.app.modules.chowmein.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.chowmein.`data`.model.ChowMeinModel
import com.khushalsapplication.app.modules.chowmein.`data`.model.ChowMeinRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChowMeinVM : ViewModel(), KoinComponent {
  val chowMeinModel: MutableLiveData<ChowMeinModel> = MutableLiveData(ChowMeinModel())

  var navArguments: Bundle? = null

  val chowMeinList: MutableLiveData<MutableList<ChowMeinRowModel>> =
      MutableLiveData(mutableListOf())
}
