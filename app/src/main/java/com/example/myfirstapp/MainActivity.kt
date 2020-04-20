package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.VisibleForTesting
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    @VisibleForTesting
    //public  ProgressDialog mProgressDialog;
    val SPALSH_TIME_OUT = 4000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        ///showProgressDialog()
        /*
        displayProgressBar(true):
        Runnable() runnable = new Runnable() {
            @Override
            public void run() {
                Log.i(TAG, "run: starting thread 4")
            }
        }
        */
        /*new Handler().postDelay(new Runnable()){
            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
        */
        monster01.setOnClickListener{viewMonsterImage(R.drawable.monster01)}
        monster02.setOnClickListener{viewMonsterImage(R.drawable.monster02)}
        monster03.setOnClickListener{viewMonsterImage(R.drawable.monster03)}
        monster04.setOnClickListener{viewMonsterImage(R.drawable.monster04)}
    }

    /*public void showProgressDialog()
 Cogent Info
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setMessage("Loading...");
            mProgressDialog = new ProgressDialog(this);

        }
    }*/

    private fun setOnClickListener()
    {
        //Intent intent = new Intent(packageContext: Login.this,SignUp.class);
        //startActivity(new Intent(packageContext: Login.this,SignUp.class));
        val text = "Hello toast!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration).also(Toast::show)
    }

    private fun viewMonsterImage(monsterId: Int) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.setAction(Intent.ACTION_VIEW)

        val uri = Uri.parse("http://com.example.myfirstapp/view?id=$monsterId")
        intent.data = uri

        intent.putExtra("monsterId", monsterId)

        startActivity(intent)
        startActivity(intent)
    }

}
