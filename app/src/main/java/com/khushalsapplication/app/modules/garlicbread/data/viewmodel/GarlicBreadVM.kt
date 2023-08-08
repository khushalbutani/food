package com.khushalsapplication.app.modules.garlicbread.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.garlicbread.`data`.model.GarlicBreadModel
import com.khushalsapplication.app.modules.garlicbread.`data`.model.GarlicBreadRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class GarlicBreadVM : ViewModel(), KoinComponent {
  val garlicBreadModel: MutableLiveData<GarlicBreadModel> = MutableLiveData(GarlicBreadModel())

  var navArguments: Bundle? = null

  val garlicBreadList: MutableLiveData<MutableList<GarlicBreadRowModel>> =
      MutableLiveData(mutableListOf())
}
