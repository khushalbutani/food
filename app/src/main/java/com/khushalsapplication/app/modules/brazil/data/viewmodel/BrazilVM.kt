package com.khushalsapplication.app.modules.brazil.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.brazil.`data`.model.BrazilModel
import com.khushalsapplication.app.modules.brazil.`data`.model.BrazilRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BrazilVM : ViewModel(), KoinComponent {
  val brazilModel: MutableLiveData<BrazilModel> = MutableLiveData(BrazilModel())

  var navArguments: Bundle? = null

  val brazilList: MutableLiveData<MutableList<BrazilRowModel>> = MutableLiveData(mutableListOf())
}
