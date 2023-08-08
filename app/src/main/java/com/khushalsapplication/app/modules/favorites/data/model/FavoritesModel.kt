package com.khushalsapplication.app.modules.favorites.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FavoritesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFavorites: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorites)

)
