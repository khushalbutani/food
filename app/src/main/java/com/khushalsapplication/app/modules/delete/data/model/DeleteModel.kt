package com.khushalsapplication.app.modules.delete.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DeleteModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? = MyApp.getInstance().resources.getString(R.string.lbl_are_you_sure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteyouracc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delete_your_acc2)

)
