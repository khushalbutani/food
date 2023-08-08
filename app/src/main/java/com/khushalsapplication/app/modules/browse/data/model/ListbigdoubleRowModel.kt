package com.khushalsapplication.app.modules.browse.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListbigdoubleRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBigDouble: String? = MyApp.getInstance().resources.getString(R.string.lbl_big_double)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFranchFries: String? = MyApp.getInstance().resources.getString(R.string.lbl_franch_fries)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenRaintCak: String? =
      MyApp.getInstance().resources.getString(R.string.msg_green_raint_cak)

)
