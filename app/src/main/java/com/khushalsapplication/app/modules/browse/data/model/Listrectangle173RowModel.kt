package com.khushalsapplication.app.modules.browse.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listrectangle173RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewly: String? = MyApp.getInstance().resources.getString(R.string.lbl_newly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOpened: String? = MyApp.getInstance().resources.getString(R.string.lbl_opened)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_review)

)
