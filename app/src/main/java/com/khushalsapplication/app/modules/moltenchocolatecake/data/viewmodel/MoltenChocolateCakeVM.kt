package com.khushalsapplication.app.modules.moltenchocolatecake.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.moltenchocolatecake.`data`.model.Listprotein4RowModel
import com.khushalsapplication.app.modules.moltenchocolatecake.`data`.model.MoltenChocolateCakeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MoltenChocolateCakeVM : ViewModel(), KoinComponent {
  val moltenChocolateCakeModel: MutableLiveData<MoltenChocolateCakeModel> =
      MutableLiveData(MoltenChocolateCakeModel())

  var navArguments: Bundle? = null

  val listproteinList: MutableLiveData<MutableList<Listprotein4RowModel>> =
      MutableLiveData(mutableListOf())
}
