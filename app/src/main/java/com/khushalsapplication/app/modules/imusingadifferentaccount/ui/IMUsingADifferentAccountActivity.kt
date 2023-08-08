package com.khushalsapplication.app.modules.imusingadifferentaccount.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityIMUsingADifferentAccountBinding
import com.khushalsapplication.app.modules.deleteaccount.ui.DeleteAccountActivity
import com.khushalsapplication.app.modules.imusingadifferentaccount.`data`.viewmodel.IMUsingADifferentAccountVM
import kotlin.String
import kotlin.Unit

class IMUsingADifferentAccountActivity :
    BaseActivity<ActivityIMUsingADifferentAccountBinding>(R.layout.activity_i_m_using_a_different_account)
    {
  private val viewModel: IMUsingADifferentAccountVM by viewModels<IMUsingADifferentAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iMUsingADifferentAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBacktosetting.setOnClickListener {
      val destIntent = DeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = DeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "I_M_USING_A_DIFFERENT_ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IMUsingADifferentAccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
