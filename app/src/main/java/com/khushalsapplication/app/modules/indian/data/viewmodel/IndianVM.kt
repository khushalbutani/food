package com.khushalsapplication.app.modules.indian.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.indian.`data`.model.IndianModel
import com.khushalsapplication.app.modules.indian.`data`.model.IndianRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class IndianVM : ViewModel(), KoinComponent {
  val indianModel: MutableLiveData<IndianModel> = MutableLiveData(IndianModel())

  var navArguments: Bundle? = null

  val indianList: MutableLiveData<MutableList<IndianRowModel>> = MutableLiveData(mutableListOf())
}
