package com.khushalsapplication.app.modules.order.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OrderModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtClose: String? = MyApp.getInstance().resources.getString(R.string.lbl_close)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_order)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_subtotal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFourHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_400)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaxFees: String? = MyApp.getInstance().resources.getString(R.string.lbl_tax_fees)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFree: String? = MyApp.getInstance().resources.getString(R.string.lbl_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt42646rs: String? = MyApp.getInstance().resources.getString(R.string.lbl_426_46rs)

)
