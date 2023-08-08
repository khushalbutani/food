package com.khushalsapplication.app.modules.localfood.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LocalfoodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLocalfood: String? = MyApp.getInstance().resources.getString(R.string.lbl_localfood)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSixtyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)

)
