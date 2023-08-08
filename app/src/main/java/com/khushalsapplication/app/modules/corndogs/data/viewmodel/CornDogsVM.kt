package com.khushalsapplication.app.modules.corndogs.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.corndogs.`data`.model.CornDogsModel
import com.khushalsapplication.app.modules.corndogs.`data`.model.CornDogsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CornDogsVM : ViewModel(), KoinComponent {
  val cornDogsModel: MutableLiveData<CornDogsModel> = MutableLiveData(CornDogsModel())

  var navArguments: Bundle? = null

  val cornDogsList: MutableLiveData<MutableList<CornDogsRowModel>> =
      MutableLiveData(mutableListOf())
}
