package com.khushalsapplication.app.modules.benihana.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.benihana.`data`.model.BenihanaModel
import com.khushalsapplication.app.modules.benihana.`data`.model.BenihanaRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BenihanaVM : ViewModel(), KoinComponent {
  val benihanaModel: MutableLiveData<BenihanaModel> = MutableLiveData(BenihanaModel())

  var navArguments: Bundle? = null

  val benihanaList: MutableLiveData<MutableList<BenihanaRowModel>> =
      MutableLiveData(mutableListOf())
}
