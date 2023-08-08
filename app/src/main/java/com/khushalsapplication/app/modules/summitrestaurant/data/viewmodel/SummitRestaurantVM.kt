package com.khushalsapplication.app.modules.summitrestaurant.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.summitrestaurant.`data`.model.SummitRestaurantModel
import org.koin.core.KoinComponent

class SummitRestaurantVM : ViewModel(), KoinComponent {
  val summitRestaurantModel: MutableLiveData<SummitRestaurantModel> =
      MutableLiveData(SummitRestaurantModel())

  var navArguments: Bundle? = null
}
