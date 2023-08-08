package com.khushalsapplication.app.modules.successfulpayment.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySuccessfulPaymentBinding
import com.khushalsapplication.app.modules.order.ui.OrderActivity
import com.khushalsapplication.app.modules.successfulpayment.`data`.viewmodel.SuccessfulPaymentVM
import kotlin.String
import kotlin.Unit

class SuccessfulPaymentActivity :
    BaseActivity<ActivitySuccessfulPaymentBinding>(R.layout.activity_successful_payment) {
  private val viewModel: SuccessfulPaymentVM by viewModels<SuccessfulPaymentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.successfulPaymentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SUCCESSFUL_PAYMENT_ACTIVITY"

  }
}
