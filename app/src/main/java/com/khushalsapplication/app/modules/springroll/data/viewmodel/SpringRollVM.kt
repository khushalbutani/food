package com.khushalsapplication.app.modules.springroll.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.springroll.`data`.model.SpringRollModel
import com.khushalsapplication.app.modules.springroll.`data`.model.SpringRollRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SpringRollVM : ViewModel(), KoinComponent {
  val springRollModel: MutableLiveData<SpringRollModel> = MutableLiveData(SpringRollModel())

  var navArguments: Bundle? = null

  val springRollList: MutableLiveData<MutableList<SpringRollRowModel>> =
      MutableLiveData(mutableListOf())
}
