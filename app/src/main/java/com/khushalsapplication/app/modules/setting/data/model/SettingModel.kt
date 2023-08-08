package com.khushalsapplication.app.modules.setting.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddaPlace: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_a_place)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIncasewerem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_in_case_we_re_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_places_you_ve_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallthepla: String? =
      MyApp.getInstance().resources.getString(R.string.msg_see_all_the_pla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteyouracc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delete_your_acc)

)
