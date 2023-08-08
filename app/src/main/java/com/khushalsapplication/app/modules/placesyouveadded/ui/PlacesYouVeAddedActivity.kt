package com.khushalsapplication.app.modules.placesyouveadded.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityPlacesYouVeAddedBinding
import com.khushalsapplication.app.modules.placesyouveadded.`data`.viewmodel.PlacesYouVeAddedVM
import com.khushalsapplication.app.modules.setting.ui.SettingActivity
import kotlin.String
import kotlin.Unit

class PlacesYouVeAddedActivity :
    BaseActivity<ActivityPlacesYouVeAddedBinding>(R.layout.activity_places_you_ve_added) {
  private val viewModel: PlacesYouVeAddedVM by viewModels<PlacesYouVeAddedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.placesYouVeAddedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PLACES_YOU_VE_ADDED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PlacesYouVeAddedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
