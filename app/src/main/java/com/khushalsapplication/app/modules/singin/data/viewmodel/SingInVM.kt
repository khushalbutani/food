package com.khushalsapplication.app.modules.singin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.singin.`data`.model.SingInModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class SingInVM : ViewModel(), KoinComponent {
  val singInModel: MutableLiveData<SingInModel> = MutableLiveData(SingInModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()
}
