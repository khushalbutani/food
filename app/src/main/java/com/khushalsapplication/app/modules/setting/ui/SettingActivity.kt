package com.khushalsapplication.app.modules.setting.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySettingBinding
import com.khushalsapplication.app.modules.accountsettings.ui.AccountSettingsActivity
import com.khushalsapplication.app.modules.addaplace.ui.AddAPlaceActivity
import com.khushalsapplication.app.modules.editprofile.ui.EditProfileActivity
import com.khushalsapplication.app.modules.placesyouveadded.ui.PlacesYouVeAddedActivity
import com.khushalsapplication.app.modules.setting.`data`.model.SettingRowModel
import com.khushalsapplication.app.modules.setting.`data`.viewmodel.SettingVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SettingActivity : BaseActivity<ActivitySettingBinding>(R.layout.activity_setting) {
  private val viewModel: SettingVM by viewModels<SettingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val settingAdapter = SettingAdapter(viewModel.settingList.value?:mutableListOf())
    binding.recyclerSetting.adapter = settingAdapter
    settingAdapter.setOnItemClickListener(
    object : SettingAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SettingRowModel) {
        onClickRecyclerSetting(view, position, item)
      }
    }
    )
    viewModel.settingList.observe(this) {
      settingAdapter.updateData(it)
    }
    binding.settingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnlanguageFour.setOnClickListener {
      val destIntent = AccountSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnlanguageOne.setOnClickListener {
      val destIntent = PlacesYouVeAddedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnaddaplace.setOnClickListener {
      val destIntent = AddAPlaceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSetting(
    view: View,
    position: Int,
    item: SettingRowModel
  ): Unit {
    when(view.id) {
      R.id.frameStackprofilephoto -> {
        val destIntent = EditProfileActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "SETTING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
