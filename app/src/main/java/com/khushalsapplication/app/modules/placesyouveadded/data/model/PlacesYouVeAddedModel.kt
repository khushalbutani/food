package com.khushalsapplication.app.modules.placesyouveadded.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PlacesYouVeAddedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhavetadde: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_t_adde)

)
