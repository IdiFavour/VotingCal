package com.example.government

import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed
import com.anychart.AnyChart
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var validvotes = findViewById<TextInputEditText>(R.id.validvotes);
        var totalballotpapers = findViewById<TextInputEditText>(R.id.ballotissued)
        var spoilt = findViewById<TextInputEditText>(R.id.spoiltpapers)
        var reject = findViewById<TextInputEditText>(R.id.rejectedballot)
        var btncal = findViewById<Button>(R.id.calculate)
        var amount : Array<Int>
        var months: Array<String>

        btncal.setOnClickListener {
            if (validvotes.text.toString().isEmpty()){
                validvotes.error ="Field required"
                validvotes.requestFocus()
                return@setOnClickListener
            }
            else if (totalballotpapers.text.toString().isEmpty()){
                totalballotpapers.error = "Field required"
                totalballotpapers.requestFocus()
                return@setOnClickListener
            }
            else if (spoilt.text.toString().isEmpty()){
                spoilt.error = "Field required"
                spoilt.requestFocus()
                return@setOnClickListener
            }
            else if (reject.text.toString().isEmpty()){
                reject.error = "Field required"
                reject.requestFocus()
                return@setOnClickListener
            }
            else if(validvotes.text.toString().toInt() > totalballotpapers.text.toString().toInt()){
                Toast.makeText(this, "valid votes cannot be greater than ballot papers issue", Toast.LENGTH_SHORT).show();
            }
            else{

         }

        }
        var used : Int = reject.text.toString().toInt() + validvotes.text.toString().toInt()
        var unused : Int = spoilt.text.toString().toInt() + (totalballotpapers.text.toString().toInt() - used)
        amount = arrayOf(used, unused)
        months = arrayOf(
                "Used  "+used.toString()+" ",
                "Unused "+unused.toString()+" "
        )
        val pie = AnyChart.pie()
        val dataEntries: MutableList<DataEntry> =
                ArrayList()

        for (i in months.indices) {
            dataEntries.add(ValueDataEntry(months[i], amount[i]))
        }
        pie.data(dataEntries)
        pie.title("Ballot Papers")
        any_chart_view.setChart(pie)

        val delayMillis: Long = 5000
        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            override fun run() {
                val data: MutableList<DataEntry> = ArrayList()
                for (i in months.indices) {
                    data.add(ValueDataEntry(months[i], amount[i]))
                }
                pie.data(data)
                handler.postDelayed(this, delayMillis)
            }
        }
        handler.postDelayed(runnable, delayMillis)


    }


    fun setupPieChart(months: Array<String>, amount: Array<Int>){

        val pie = AnyChart.pie()
        val dataEntries: MutableList<DataEntry> =
            ArrayList()

        for (i in months.indices) {
            dataEntries.add(ValueDataEntry(months[i], amount[i]))
        }
        pie.data(dataEntries)
        pie.title("Ballot Papers")
        any_chart_view.setChart(pie)
    }


}