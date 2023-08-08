package com.khushalsapplication.app.modules.reportissueswiththeapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityReportIssuesWithTheAppBinding
import com.khushalsapplication.app.modules.reportissueswiththeapp.`data`.viewmodel.ReportIssuesWithTheAppVM
import kotlin.String
import kotlin.Unit

class ReportIssuesWithTheAppActivity :
    BaseActivity<ActivityReportIssuesWithTheAppBinding>(R.layout.activity_report_issues_with_the_app)
    {
  private val viewModel: ReportIssuesWithTheAppVM by viewModels<ReportIssuesWithTheAppVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.reportIssuesWithTheAppVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REPORT_ISSUES_WITH_THE_APP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReportIssuesWithTheAppActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
