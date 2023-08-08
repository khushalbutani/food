package com.khushalsapplication.app.modules.thefattybao.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.thefattybao.`data`.model.TheFattyBaoModel
import org.koin.core.KoinComponent

class TheFattyBaoVM : ViewModel(), KoinComponent {
  val theFattyBaoModel: MutableLiveData<TheFattyBaoModel> = MutableLiveData(TheFattyBaoModel())

  var navArguments: Bundle? = null
}
