package com.khushalsapplication.app.modules.delivery.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DeliveryRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBigDouble: String? = MyApp.getInstance().resources.getString(R.string.lbl_big_double)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1500rs: String? = MyApp.getInstance().resources.getString(R.string.lbl_1500rs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt250gm: String? = MyApp.getInstance().resources.getString(R.string.lbl_250gm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBurgerGooby: String? = MyApp.getInstance().resources.getString(R.string.lbl_burger_gooby)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_9_apr_2023_3_2)

)
