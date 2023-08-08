package com.khushalsapplication.app.modules.singapore.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SingaporeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRotiPrata: String? = MyApp.getInstance().resources.getString(R.string.lbl_roti_prata)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_singapore_hotel)

)
