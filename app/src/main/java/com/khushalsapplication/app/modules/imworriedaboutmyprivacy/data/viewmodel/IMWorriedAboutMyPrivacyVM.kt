package com.khushalsapplication.app.modules.imworriedaboutmyprivacy.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.imworriedaboutmyprivacy.`data`.model.IMWorriedAboutMyPrivacyModel
import org.koin.core.KoinComponent

class IMWorriedAboutMyPrivacyVM : ViewModel(), KoinComponent {
  val iMWorriedAboutMyPrivacyModel: MutableLiveData<IMWorriedAboutMyPrivacyModel> =
      MutableLiveData(IMWorriedAboutMyPrivacyModel())

  var navArguments: Bundle? = null
}
