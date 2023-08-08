package com.khushalsapplication.app.modules.singapore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.singapore.`data`.model.SingaporeModel
import com.khushalsapplication.app.modules.singapore.`data`.model.SingaporeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SingaporeVM : ViewModel(), KoinComponent {
  val singaporeModel: MutableLiveData<SingaporeModel> = MutableLiveData(SingaporeModel())

  var navArguments: Bundle? = null

  val singaporeList: MutableLiveData<MutableList<SingaporeRowModel>> =
      MutableLiveData(mutableListOf())
}
