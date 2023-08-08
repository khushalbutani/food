package com.khushalsapplication.app.modules.browse.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListriverbambooRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRiverBamboo: String? = MyApp.getInstance().resources.getString(R.string.lbl_river_bamboo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrooksMotor: String? = MyApp.getInstance().resources.getString(R.string.lbl_brooks_motor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStarbuks: String? = MyApp.getInstance().resources.getString(R.string.lbl_starbuks)

)
