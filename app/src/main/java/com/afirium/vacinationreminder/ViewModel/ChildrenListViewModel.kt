package com.afirium.vacinationreminder.ViewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.afirium.vacinationreminder.Data.Child
import com.afirium.vacinationreminder.Data.Repo
import com.afirium.vacinationreminder.View.AddChildActivity
import com.afirium.vacinationreminder.View.ChildDetailsActivity

class ChildrenListViewModel(private val repo : Repo):ViewModel() {

    fun getChildren () = repo.getChildren();
    fun startAddingChild(context: Context) {
        context.startActivity(AddChildActivity.getStartIntent(context))
    }

    fun onClickedChild(context: Context,child:Child) {
        context.startActivity(ChildDetailsActivity.getStartIntent(context,child.id))

    }

}