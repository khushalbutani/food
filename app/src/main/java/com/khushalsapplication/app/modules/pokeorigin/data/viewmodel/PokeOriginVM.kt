package com.khushalsapplication.app.modules.pokeorigin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.pokeorigin.`data`.model.PokeOriginModel
import com.khushalsapplication.app.modules.pokeorigin.`data`.model.PokeOriginRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PokeOriginVM : ViewModel(), KoinComponent {
  val pokeOriginModel: MutableLiveData<PokeOriginModel> = MutableLiveData(PokeOriginModel())

  var navArguments: Bundle? = null

  val pokeOriginList: MutableLiveData<MutableList<PokeOriginRowModel>> =
      MutableLiveData(mutableListOf())
}
