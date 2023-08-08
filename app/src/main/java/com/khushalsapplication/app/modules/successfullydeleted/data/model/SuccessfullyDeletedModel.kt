package com.khushalsapplication.app.modules.successfullydeleted.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SuccessfullyDeletedModel(
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelete: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouraccountwa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_account_wa)

)
