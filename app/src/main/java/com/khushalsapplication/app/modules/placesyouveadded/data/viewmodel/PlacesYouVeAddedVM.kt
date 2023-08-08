package com.khushalsapplication.app.modules.placesyouveadded.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.placesyouveadded.`data`.model.PlacesYouVeAddedModel
import org.koin.core.KoinComponent

class PlacesYouVeAddedVM : ViewModel(), KoinComponent {
  val placesYouVeAddedModel: MutableLiveData<PlacesYouVeAddedModel> =
      MutableLiveData(PlacesYouVeAddedModel())

  var navArguments: Bundle? = null
}
