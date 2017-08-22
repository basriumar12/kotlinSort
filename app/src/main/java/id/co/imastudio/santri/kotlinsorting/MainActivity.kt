package id.co.imastudio.santri.kotlinsorting

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

        var angka = arrayOf("20","10","-10","50","70","60","80","30","40","90")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //sort sederhana pada fungsi kotlin
        Arrays.sort(angka)
        var adp = ArrayAdapter(MainActivity@this, android.R.layout.simple_list_item_1,angka)
        listview.adapter=adp
    }
}
