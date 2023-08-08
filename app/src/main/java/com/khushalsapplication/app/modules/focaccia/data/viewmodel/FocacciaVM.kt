package com.khushalsapplication.app.modules.focaccia.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.focaccia.`data`.model.FocacciaModel
import com.khushalsapplication.app.modules.focaccia.`data`.model.FocacciaRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FocacciaVM : ViewModel(), KoinComponent {
  val focacciaModel: MutableLiveData<FocacciaModel> = MutableLiveData(FocacciaModel())

  var navArguments: Bundle? = null

  val focacciaList: MutableLiveData<MutableList<FocacciaRowModel>> =
      MutableLiveData(mutableListOf())
}
