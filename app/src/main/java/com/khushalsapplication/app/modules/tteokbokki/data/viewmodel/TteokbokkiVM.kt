package com.khushalsapplication.app.modules.tteokbokki.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.tteokbokki.`data`.model.TteokbokkiModel
import com.khushalsapplication.app.modules.tteokbokki.`data`.model.TteokbokkiRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TteokbokkiVM : ViewModel(), KoinComponent {
  val tteokbokkiModel: MutableLiveData<TteokbokkiModel> = MutableLiveData(TteokbokkiModel())

  var navArguments: Bundle? = null

  val tteokbokkiList: MutableLiveData<MutableList<TteokbokkiRowModel>> =
      MutableLiveData(mutableListOf())
}
