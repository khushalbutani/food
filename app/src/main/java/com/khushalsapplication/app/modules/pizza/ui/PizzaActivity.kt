package com.khushalsapplication.app.modules.pizza.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityPizzaBinding
import com.khushalsapplication.app.modules.pizza.`data`.model.PizzaRowModel
import com.khushalsapplication.app.modules.pizza.`data`.viewmodel.PizzaVM
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PizzaActivity : BaseActivity<ActivityPizzaBinding>(R.layout.activity_pizza) {
  private val viewModel: PizzaVM by viewModels<PizzaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val pizzaAdapter = PizzaAdapter(viewModel.pizzaList.value?:mutableListOf())
    binding.recyclerPizza.adapter = pizzaAdapter
    pizzaAdapter.setOnItemClickListener(
    object : PizzaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PizzaRowModel) {
        onClickRecyclerPizza(view, position, item)
      }
    }
    )
    viewModel.pizzaList.observe(this) {
      pizzaAdapter.updateData(it)
    }
    binding.pizzaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerPizza(
    view: View,
    position: Int,
    item: PizzaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PIZZA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PizzaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
