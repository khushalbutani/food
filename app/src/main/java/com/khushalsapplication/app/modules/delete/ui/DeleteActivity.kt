package com.khushalsapplication.app.modules.delete.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityDeleteBinding
import com.khushalsapplication.app.modules.delete.`data`.viewmodel.DeleteVM
import com.khushalsapplication.app.modules.successfullydeleted.ui.SuccessfullyDeletedActivity
import kotlin.String
import kotlin.Unit

class DeleteActivity : BaseActivity<ActivityDeleteBinding>(R.layout.activity_delete) {
  private val viewModel: DeleteVM by viewModels<DeleteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.deleteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDelete.setOnClickListener {
      val destIntent = SuccessfullyDeletedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DELETE_ACTIVITY"

  }
}
