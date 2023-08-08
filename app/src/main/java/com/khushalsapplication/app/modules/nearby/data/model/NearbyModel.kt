package com.khushalsapplication.app.modules.nearby.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NearbyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNearby: String? = MyApp.getInstance().resources.getString(R.string.lbl_nearby2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrooksMotor: String? = MyApp.getInstance().resources.getString(R.string.lbl_brooks_motor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_300m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurant: String? = MyApp.getInstance().resources.getString(R.string.lbl_restaurant)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_245_reviews2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDapoerBunda: String? = MyApp.getInstance().resources.getString(R.string.lbl_dapoer_bunda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_600m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_restaurant)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_78_reviews)

)
