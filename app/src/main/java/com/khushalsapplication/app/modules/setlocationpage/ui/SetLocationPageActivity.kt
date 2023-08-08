package com.khushalsapplication.app.modules.setlocationpage.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySetLocationPageBinding
import com.khushalsapplication.app.modules.chooselocation.ui.ChooseLocationActivity
import com.khushalsapplication.app.modules.profile.ui.ProfileActivity
import com.khushalsapplication.app.modules.setlocationpage.`data`.viewmodel.SetLocationPageVM
import kotlin.String
import kotlin.Unit

class SetLocationPageActivity :
    BaseActivity<ActivitySetLocationPageBinding>(R.layout.activity_set_location_page) {
  private val viewModel: SetLocationPageVM by viewModels<SetLocationPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.setLocationPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtOrsetyourloc.setOnClickListener {
      val destIntent = ChooseLocationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtUsecurrentloc.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SET_LOCATION_PAGE_ACTIVITY"

  }
}
