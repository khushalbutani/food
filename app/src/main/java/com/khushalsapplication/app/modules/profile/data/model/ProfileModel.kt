package com.khushalsapplication.app.modules.profile.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSriWedariSoek: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sri_wedari_soek)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_sriwedari_gmail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountCredits: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_account_credits)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddnewaddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_new_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentCards: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment_cards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_main_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_9433)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_oscar_s_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredOne: String? = MyApp.getInstance().resources.getString(R.string.lbl4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_6463)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddnewcard: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_new_card)

)
