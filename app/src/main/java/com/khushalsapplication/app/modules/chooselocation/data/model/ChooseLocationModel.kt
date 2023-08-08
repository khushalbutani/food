package com.khushalsapplication.app.modules.chooselocation.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChooseLocationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_type_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_e_g_new_york)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsecurrentloc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_current_loc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseyourcou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_your_cou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_iceland)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_india)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_indonesia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIran: String? = MyApp.getInstance().resources.getString(R.string.lbl_iran)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_iraq)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_ireland)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_israel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountrySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_italy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountrySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_japan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJamaica: String? = MyApp.getInstance().resources.getString(R.string.lbl_jamaica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_kuwait)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLiberia: String? = MyApp.getInstance().resources.getString(R.string.lbl_liberia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLaos: String? = MyApp.getInstance().resources.getString(R.string.lbl_laos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_latvia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLesotho: String? = MyApp.getInstance().resources.getString(R.string.lbl_lesotho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMaldives: String? = MyApp.getInstance().resources.getString(R.string.lbl_maldives)

)
