package io.trell.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import io.trell.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayAccounts()
    }
    fun displayAccounts(){
        var account = Account(" ", "Ashley Bestie,", "@Ashley", "Be the best you can each time", " ",""," ", " ", "7","3","40","2")
        var account1 = Account(" ", "Christine Maina,", "@Maina", "Be the best you can each time", " ",""," ", " ", "6","5","50","3")
        var account2 = Account(" ", "Rose Ndunge,", "@Rose", "Be the best you can each time", " ",""," ", " ","9","8","70","4")
        var account3 = Account(" ", "Trell Maina,", "@Trell", "Be the best you can each time", " ",""," ", " ", "5","11","80","5",)
        var account4 = Account(" ", "Trell Maina,", "@Jane", "Be the best you can each time", " ",""," ", " ", "5","11","80","5",)
        var accountList = listOf(account, account1, account2, account3,account4)

        var accountAdapter = AccountRVAdapter(accountList)
        binding.rvtwitter.layoutManager = LinearLayoutManager(this)
        binding.rvtwitter.adapter = accountAdapter

    }
}