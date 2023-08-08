package com.khushalsapplication.app.modules.delete.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.delete.`data`.model.DeleteModel
import org.koin.core.KoinComponent

class DeleteVM : ViewModel(), KoinComponent {
  val deleteModel: MutableLiveData<DeleteModel> = MutableLiveData(DeleteModel())

  var navArguments: Bundle? = null
}
