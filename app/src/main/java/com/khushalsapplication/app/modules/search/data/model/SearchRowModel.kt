package com.khushalsapplication.app.modules.search.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPavBhaji: String? = MyApp.getInstance().resources.getString(R.string.lbl_pav_bhaji)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt120rs: String? = MyApp.getInstance().resources.getString(R.string.lbl_120rs)

)
