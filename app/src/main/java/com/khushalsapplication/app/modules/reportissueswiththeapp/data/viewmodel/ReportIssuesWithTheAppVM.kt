package com.khushalsapplication.app.modules.reportissueswiththeapp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.reportissueswiththeapp.`data`.model.ReportIssuesWithTheAppModel
import org.koin.core.KoinComponent

class ReportIssuesWithTheAppVM : ViewModel(), KoinComponent {
  val reportIssuesWithTheAppModel: MutableLiveData<ReportIssuesWithTheAppModel> =
      MutableLiveData(ReportIssuesWithTheAppModel())

  var navArguments: Bundle? = null
}
