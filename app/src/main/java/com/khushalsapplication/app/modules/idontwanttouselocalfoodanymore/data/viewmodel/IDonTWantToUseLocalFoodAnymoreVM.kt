package com.khushalsapplication.app.modules.idontwanttouselocalfoodanymore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.idontwanttouselocalfoodanymore.`data`.model.IDonTWantToUseLocalFoodAnymoreModel
import org.koin.core.KoinComponent

class IDonTWantToUseLocalFoodAnymoreVM : ViewModel(), KoinComponent {
  val iDonTWantToUseLocalFoodAnymoreModel: MutableLiveData<IDonTWantToUseLocalFoodAnymoreModel> =
      MutableLiveData(IDonTWantToUseLocalFoodAnymoreModel())

  var navArguments: Bundle? = null
}
