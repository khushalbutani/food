package com.khushalsapplication.app.modules.idontwanttouselocalfoodanymore.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityIDonTWantToUseLocalFoodAnymoreBinding
import com.khushalsapplication.app.modules.deleteaccount.ui.DeleteAccountActivity
import com.khushalsapplication.app.modules.idontwanttouselocalfoodanymore.`data`.viewmodel.IDonTWantToUseLocalFoodAnymoreVM
import kotlin.String
import kotlin.Unit

class IDonTWantToUseLocalFoodAnymoreActivity :
    BaseActivity<ActivityIDonTWantToUseLocalFoodAnymoreBinding>(R.layout.activity_i_don_t_want_to_use_local_food_anymore)
    {
  private val viewModel: IDonTWantToUseLocalFoodAnymoreVM by
      viewModels<IDonTWantToUseLocalFoodAnymoreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iDonTWantToUseLocalFoodAnymoreVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = DeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "I_DON_T_WANT_TO_USE_LOCAL_FOOD_ANYMORE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IDonTWantToUseLocalFoodAnymoreActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
