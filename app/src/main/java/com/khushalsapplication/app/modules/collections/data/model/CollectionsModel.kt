package com.khushalsapplication.app.modules.collections.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CollectionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollections: String? = MyApp.getInstance().resources.getString(R.string.lbl_collections)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBe: String? = MyApp.getInstance().resources.getString(R.string.lbl_be)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHealthy: String? = MyApp.getInstance().resources.getString(R.string.lbl_healthy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewCounterFifteen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_23_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHappy: String? = MyApp.getInstance().resources.getString(R.string.lbl_happy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBreakfast: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewCounterSixteen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_27_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCool: String? = MyApp.getInstance().resources.getString(R.string.lbl_cool)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrink: String? = MyApp.getInstance().resources.getString(R.string.lbl_drink)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewCounterSeventeen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_34_review)

)
