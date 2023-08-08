package com.khushalsapplication.app.modules.american.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.american.`data`.model.AmericanModel
import com.khushalsapplication.app.modules.american.`data`.model.AmericanRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AmericanVM : ViewModel(), KoinComponent {
  val americanModel: MutableLiveData<AmericanModel> = MutableLiveData(AmericanModel())

  var navArguments: Bundle? = null

  val americanList: MutableLiveData<MutableList<AmericanRowModel>> =
      MutableLiveData(mutableListOf())
}
