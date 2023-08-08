package com.khushalsapplication.app.modules.satay.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SatayRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProtein: String? = MyApp.getInstance().resources.getString(R.string.lbl_protein)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFat: String? = MyApp.getInstance().resources.getString(R.string.lbl_fat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalcarbs: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_carbs)

)
