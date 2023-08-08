package com.khushalsapplication.app.modules.ad.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AdModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1559_ad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurant: String? = MyApp.getInstance().resources.getString(R.string.lbl_restaurant)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt963MadysonDri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_963_madyson_dri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt245reviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_245_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOpentime: String? = MyApp.getInstance().resources.getString(R.string.lbl_open_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFree: String? = MyApp.getInstance().resources.getString(R.string.lbl_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIMAGES: String? = MyApp.getInstance().resources.getString(R.string.lbl_images)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEllenMclaughli: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ellen_mclaughli)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_so_we_needed_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHanipatel: String? = MyApp.getInstance().resources.getString(R.string.lbl_hani_patel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_so_we_needed_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJishavaghani: String? = MyApp.getInstance().resources.getString(R.string.lbl_jisha_vaghani)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_so_we_needed_up)

)
