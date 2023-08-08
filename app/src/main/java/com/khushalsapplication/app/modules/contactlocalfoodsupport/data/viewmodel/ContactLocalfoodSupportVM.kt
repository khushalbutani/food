package com.khushalsapplication.app.modules.contactlocalfoodsupport.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.contactlocalfoodsupport.`data`.model.ContactLocalfoodSupportModel
import org.koin.core.KoinComponent

class ContactLocalfoodSupportVM : ViewModel(), KoinComponent {
  val contactLocalfoodSupportModel: MutableLiveData<ContactLocalfoodSupportModel> =
      MutableLiveData(ContactLocalfoodSupportModel())

  var navArguments: Bundle? = null
}
