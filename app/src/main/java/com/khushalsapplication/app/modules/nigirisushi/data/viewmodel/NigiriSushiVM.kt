package com.khushalsapplication.app.modules.nigirisushi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.nigirisushi.`data`.model.NigiriSushiModel
import com.khushalsapplication.app.modules.nigirisushi.`data`.model.NigiriSushiRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NigiriSushiVM : ViewModel(), KoinComponent {
  val nigiriSushiModel: MutableLiveData<NigiriSushiModel> = MutableLiveData(NigiriSushiModel())

  var navArguments: Bundle? = null

  val nigiriSushiList: MutableLiveData<MutableList<NigiriSushiRowModel>> =
      MutableLiveData(mutableListOf())
}
