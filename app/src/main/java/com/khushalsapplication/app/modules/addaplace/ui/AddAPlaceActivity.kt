package com.khushalsapplication.app.modules.addaplace.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityAddAPlaceBinding
import com.khushalsapplication.app.modules.addaplace.`data`.viewmodel.AddAPlaceVM
import com.khushalsapplication.app.modules.setting.ui.SettingActivity
import kotlin.String
import kotlin.Unit

class AddAPlaceActivity : BaseActivity<ActivityAddAPlaceBinding>(R.layout.activity_add_a_place) {
  private val viewModel: AddAPlaceVM by viewModels<AddAPlaceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addAPlaceVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_A_PLACE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddAPlaceActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
