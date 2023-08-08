package com.khushalsapplication.app.modules.checkout.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CheckOutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckout: String? = MyApp.getInstance().resources.getString(R.string.lbl_checkout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeliveryAddres: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delivery_addres)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddressOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_address_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4904GoldnerRa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4904_goldner_ra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredFortySix: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_wilson_caspere)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredFortySeven: String? = MyApp.getInstance().resources.getString(R.string.msg2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaywithTouch: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pay_with_touch)

)
