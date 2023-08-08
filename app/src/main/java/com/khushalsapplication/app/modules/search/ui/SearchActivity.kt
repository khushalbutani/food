package com.khushalsapplication.app.modules.search.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySearchBinding
import com.khushalsapplication.app.modules.browse.ui.BrowseActivity
import com.khushalsapplication.app.modules.burger.ui.BurgerActivity
import com.khushalsapplication.app.modules.frenchfries.ui.FrenchFriesActivity
import com.khushalsapplication.app.modules.garlicbread.ui.GarlicBreadActivity
import com.khushalsapplication.app.modules.hotdog.ui.HotDogActivity
import com.khushalsapplication.app.modules.momos.ui.MomosActivity
import com.khushalsapplication.app.modules.pavbhaji.ui.PavBhajiActivity
import com.khushalsapplication.app.modules.pizza.ui.PizzaActivity
import com.khushalsapplication.app.modules.search.`data`.model.SearchRowModel
import com.khushalsapplication.app.modules.search.`data`.viewmodel.SearchVM
import com.khushalsapplication.app.modules.springroll.ui.SpringRollActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchActivity : BaseActivity<ActivitySearchBinding>(R.layout.activity_search) {
  private val viewModel: SearchVM by viewModels<SearchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val searchAdapter = SearchAdapter(viewModel.searchList.value?:mutableListOf())
    binding.recyclerSearch.adapter = searchAdapter
    searchAdapter.setOnItemClickListener(
    object : SearchAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SearchRowModel) {
        onClickRecyclerSearch(view, position, item)
      }
    }
    )
    viewModel.searchList.observe(this) {
      searchAdapter.updateData(it)
    }
    binding.searchVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtCancel.setOnClickListener {
      val destIntent = BrowseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSearch(
    view: View,
    position: Int,
    item: SearchRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowrectangle200 -> {
        onClickRecyclerSearchLinearRowrectangle200(view, position, item)
      }
    }
  }

  fun onClickRecyclerSearchLinearRowrectangle200(
    view: View,
    position: Int,
    item: SearchRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = PizzaActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = FrenchFriesActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 -> {
        val destIntent = MomosActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      3 -> {
        val destIntent = GarlicBreadActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      4 -> {
        val destIntent = SpringRollActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      5 -> {
        val destIntent = PavBhajiActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      6 -> {
        val destIntent = BurgerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      7 -> {
        val destIntent = HotDogActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "SEARCH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
