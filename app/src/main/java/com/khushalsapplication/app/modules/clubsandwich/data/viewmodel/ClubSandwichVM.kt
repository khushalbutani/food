package com.khushalsapplication.app.modules.clubsandwich.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.clubsandwich.`data`.model.ClubSandwichModel
import com.khushalsapplication.app.modules.clubsandwich.`data`.model.ClubSandwichRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ClubSandwichVM : ViewModel(), KoinComponent {
  val clubSandwichModel: MutableLiveData<ClubSandwichModel> = MutableLiveData(ClubSandwichModel())

  var navArguments: Bundle? = null

  val clubSandwichList: MutableLiveData<MutableList<ClubSandwichRowModel>> =
      MutableLiveData(mutableListOf())
}
