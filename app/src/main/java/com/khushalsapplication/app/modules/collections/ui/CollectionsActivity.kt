package com.khushalsapplication.app.modules.collections.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityCollectionsBinding
import com.khushalsapplication.app.modules.browse.ui.BrowseActivity
import com.khushalsapplication.app.modules.collections.`data`.model.CollectionsRowModel
import com.khushalsapplication.app.modules.collections.`data`.viewmodel.CollectionsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CollectionsActivity : BaseActivity<ActivityCollectionsBinding>(R.layout.activity_collections)
    {
  private val viewModel: CollectionsVM by viewModels<CollectionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val collectionsAdapter =
    CollectionsAdapter(viewModel.collectionsList.value?:mutableListOf())
    binding.recyclerCollections.adapter = collectionsAdapter
    collectionsAdapter.setOnItemClickListener(
    object : CollectionsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CollectionsRowModel) {
        onClickRecyclerCollections(view, position, item)
      }
    }
    )
    viewModel.collectionsList.observe(this) {
      collectionsAdapter.updateData(it)
    }
    binding.collectionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = BrowseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCollections(
    view: View,
    position: Int,
    item: CollectionsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COLLECTIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CollectionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
