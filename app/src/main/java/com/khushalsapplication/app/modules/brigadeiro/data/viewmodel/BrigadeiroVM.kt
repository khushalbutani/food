package com.khushalsapplication.app.modules.brigadeiro.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.brigadeiro.`data`.model.BrigadeiroModel
import com.khushalsapplication.app.modules.brigadeiro.`data`.model.BrigadeiroRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BrigadeiroVM : ViewModel(), KoinComponent {
  val brigadeiroModel: MutableLiveData<BrigadeiroModel> = MutableLiveData(BrigadeiroModel())

  var navArguments: Bundle? = null

  val brigadeiroList: MutableLiveData<MutableList<BrigadeiroRowModel>> =
      MutableLiveData(mutableListOf())
}
