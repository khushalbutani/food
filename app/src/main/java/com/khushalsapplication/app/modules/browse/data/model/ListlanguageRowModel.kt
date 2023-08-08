package com.khushalsapplication.app.modules.browse.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListlanguageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_soup_beet_vegy2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnionCheese: String? = MyApp.getInstance().resources.getString(R.string.lbl_onion_cheese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMozzacheese: String? = MyApp.getInstance().resources.getString(R.string.lbl_mozza_cheese)

)
