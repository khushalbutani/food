package com.khushalsapplication.app.modules.editprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityEditProfileBinding
import com.khushalsapplication.app.modules.editprofile.`data`.model.EditProfileRowModel
import com.khushalsapplication.app.modules.editprofile.`data`.viewmodel.EditProfileVM
import com.khushalsapplication.app.modules.setting.ui.SettingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditProfileActivity : BaseActivity<ActivityEditProfileBinding>(R.layout.activity_edit_profile)
    {
  private val viewModel: EditProfileVM by viewModels<EditProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val editProfileAdapter =
    EditProfileAdapter(viewModel.editProfileList.value?:mutableListOf())
    binding.recyclerEditProfile.adapter = editProfileAdapter
    editProfileAdapter.setOnItemClickListener(
    object : EditProfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EditProfileRowModel) {
        onClickRecyclerEditProfile(view, position, item)
      }
    }
    )
    viewModel.editProfileList.observe(this) {
      editProfileAdapter.updateData(it)
    }
    binding.editProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerEditProfile(
    view: View,
    position: Int,
    item: EditProfileRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EDIT_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
