package com.khushalsapplication.app.modules.spain.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SpainRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNatillaReceta: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_natilla_receta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDulcedemoras: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dulce_de_moras)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_order_from_200r)

)
