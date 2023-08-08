package com.khushalsapplication.app.modules.browse.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BrowseModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNearby: String? = MyApp.getInstance().resources.getString(R.string.lbl_near_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrowse: String? = MyApp.getInstance().resources.getString(R.string.lbl_browse)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourlocation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_location2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSurat: String? = MyApp.getInstance().resources.getString(R.string.lbl_surat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCuisines: String? = MyApp.getInstance().resources.getString(R.string.lbl_cuisines)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingthisw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_trending_this_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAllOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularPlace: String? = MyApp.getInstance().resources.getString(R.string.lbl_popular_place)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAllTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_128_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_34_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsCounterTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_128_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCollections: String? = MyApp.getInstance().resources.getString(R.string.lbl_collections)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAllThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAllFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
