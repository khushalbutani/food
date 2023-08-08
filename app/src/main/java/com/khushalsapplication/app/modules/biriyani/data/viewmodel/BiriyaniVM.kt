package com.khushalsapplication.app.modules.biriyani.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.biriyani.`data`.model.BiriyaniModel
import com.khushalsapplication.app.modules.biriyani.`data`.model.BiriyaniRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BiriyaniVM : ViewModel(), KoinComponent {
  val biriyaniModel: MutableLiveData<BiriyaniModel> = MutableLiveData(BiriyaniModel())

  var navArguments: Bundle? = null

  val biriyaniList: MutableLiveData<MutableList<BiriyaniRowModel>> =
      MutableLiveData(mutableListOf())
}
