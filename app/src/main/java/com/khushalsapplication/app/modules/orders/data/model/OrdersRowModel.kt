package com.khushalsapplication.app.modules.orders.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OrdersRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSashimiDeluxe: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sashimi_deluxe)
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
  var txt2pcstunasash: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2_pcs_tuna_sash)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_9_apr_2023_3_2)

)
