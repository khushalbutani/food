package com.khushalsapplication.app.modules.brazil.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BrazilRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBrigadeiro: String? = MyApp.getInstance().resources.getString(R.string.lbl_brigadeiro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrigadeiroOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_brigadeiro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_tartufini_avoc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_order_from_200r)

)
