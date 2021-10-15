package com.example.trawlerapp

import AllData
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException
import java.net.URL


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager = LinearLayoutManager(this)

        fetchJson()

    }

    private fun fetchJson() {
        val url = "http://www.cartrawler.com/ctabe/cars.json"
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()
        client.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) {
                var response = URL("http://www.cartrawler.com/ctabe/cars.json").readText()
                var gson = Gson()

                val data = gson.fromJson(response, Array<AllData>::class.java)
                for (element in data){
                    println(element.vehAvailRSCore)
                }
                runOnUiThread {
                    for (element in data){
//                        println(element.vehAvailRSCore)
                        recycler_view.adapter = TrawlerAdapter(element, applicationContext)

                    }
                }
            }
//
            override fun onFailure(call: Call, e: IOException) {
                println(e.message)
            }
        })

    }
}

