package com.khushalsapplication.app.modules.successfulpayment.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SuccessfulPaymentModel(
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
  var txtOneHundredFortyEight: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_wilson_caspere)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredFortyNine: String? = MyApp.getInstance().resources.getString(R.string.msg2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaywithTouch: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pay_with_touch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourorderiss: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_order_is_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucantrackt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_track_t)

)
