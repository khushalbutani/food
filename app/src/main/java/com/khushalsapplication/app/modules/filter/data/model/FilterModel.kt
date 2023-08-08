package com.khushalsapplication.app.modules.filter.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClear: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShortby: String? = MyApp.getInstance().resources.getString(R.string.lbl_short_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopRated: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_rated)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeventySix: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lowest_first)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeventyFive: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_higest_first)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeventyFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_newly_listed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_nearest_first)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOutdoorseating: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_outdoor_seating)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_credit_cards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_alcohol_served)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSixtyNine: String? =
      MyApp.getInstance().resources.getString(R.string.msg_additional_filt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredThree: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredFour: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredFive: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredSix: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl5)

)
