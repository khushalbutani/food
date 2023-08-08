package com.khushalsapplication.app.modules.singin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.appcomponents.facebookauth.FacebookHelper
import com.khushalsapplication.app.databinding.ActivitySingInBinding
import com.khushalsapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.khushalsapplication.app.modules.signup.ui.SignUpActivity
import com.khushalsapplication.app.modules.singin.`data`.viewmodel.SingInVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SingInActivity : BaseActivity<ActivitySingInBinding>(R.layout.activity_sing_in) {
  private val viewModel: SingInVM by viewModels<SingInVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()


  private val facebookLogin: FacebookHelper = FacebookHelper()


  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ): Unit {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.singInVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowrectangleeight.setOnClickListener {
      LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
      facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
        override fun onSuccess(result: LoginResult?) {
        }
        override fun onError(error: FacebookException?) {
        }
        override fun onCancel() {
        }
        })
      }
      binding.txtForgotpassword.setOnClickListener {
        val destIntent = ForgotPasswordActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtConfirmation.setOnClickListener {
        val destIntent = SignUpActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SING_IN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SingInActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
