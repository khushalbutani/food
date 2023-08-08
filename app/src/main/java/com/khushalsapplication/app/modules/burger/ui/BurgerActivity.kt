package com.khushalsapplication.app.modules.burger.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityBurgerBinding
import com.khushalsapplication.app.modules.burger.`data`.model.BurgerRowModel
import com.khushalsapplication.app.modules.burger.`data`.viewmodel.BurgerVM
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BurgerActivity : BaseActivity<ActivityBurgerBinding>(R.layout.activity_burger) {
  private val viewModel: BurgerVM by viewModels<BurgerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val burgerAdapter = BurgerAdapter(viewModel.burgerList.value?:mutableListOf())
    binding.recyclerBurger.adapter = burgerAdapter
    burgerAdapter.setOnItemClickListener(
    object : BurgerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BurgerRowModel) {
        onClickRecyclerBurger(view, position, item)
      }
    }
    )
    viewModel.burgerList.observe(this) {
      burgerAdapter.updateData(it)
    }
    binding.burgerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerBurger(
    view: View,
    position: Int,
    item: BurgerRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BURGER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BurgerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
