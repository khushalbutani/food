package com.khushalsapplication.app.modules.editprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.editprofile.`data`.model.EditProfileModel
import com.khushalsapplication.app.modules.editprofile.`data`.model.EditProfileRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditProfileVM : ViewModel(), KoinComponent {
  val editProfileModel: MutableLiveData<EditProfileModel> = MutableLiveData(EditProfileModel())

  var navArguments: Bundle? = null

  val editProfileList: MutableLiveData<MutableList<EditProfileRowModel>> =
      MutableLiveData(mutableListOf())
}
