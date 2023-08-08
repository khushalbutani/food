package com.khushalsapplication.app.modules.search.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecent: String? = MyApp.getInstance().resources.getString(R.string.lbl_recent)

)
