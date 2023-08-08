package com.khushalsapplication.app.modules.delivery.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DeliveryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)

)
