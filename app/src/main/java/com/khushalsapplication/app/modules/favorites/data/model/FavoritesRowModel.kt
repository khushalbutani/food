package com.khushalsapplication.app.modules.favorites.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FavoritesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_japanese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSushiToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_sushi_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNigirisushi: String? = MyApp.getInstance().resources.getString(R.string.lbl_nigiri_sushi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_shurbhi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPavBhaji: String? = MyApp.getInstance().resources.getString(R.string.lbl_pav_bhaji)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndian: String? = MyApp.getInstance().resources.getString(R.string.lbl_indian)

)
