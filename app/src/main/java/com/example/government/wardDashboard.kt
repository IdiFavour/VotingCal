package com.example.government

import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColor
import androidx.core.graphics.toColorLong
import androidx.core.view.marginBottom
import com.anychart.AnyChart
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_ward_dashboard.*
import kotlinx.android.synthetic.main.activity_ward_dashboard.new_any_chart_view


class wardDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ward_dashboard)

        //Create a layout---------------
        val linearLayout = findViewById<LinearLayout>(R.id.basiclayout)

        val viewused = ArrayList<TextInputEditText>()
        val viewunused = ArrayList<TextInputEditText>()
        val viewvotes = ArrayList<TextInputEditText>()

        var totalused : Int = 0
        var totalunused : Int = 0
        var totalvotes : Int = 0

        val pie = AnyChart.pie()
        var dataEntries: MutableList<DataEntry> = java.util.ArrayList()
        dataEntries.add(ValueDataEntry("Used", totalused))
        dataEntries.add(ValueDataEntry("Unused", totalunused))
        dataEntries.add(ValueDataEntry("Valid votes", totalvotes))
        pie.data(dataEntries)
        pie.data(dataEntries)
        pie.title("Result")
        pie.labels().format("{%value}")
        new_any_chart_view.setChart(pie)

        //Create params for views---------------
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        )

        btncalc.visibility = View.GONE
        new_any_chart_view.visibility = View.GONE
        cont.setOnClickListener {
            if (unitnum.text.toString().isEmpty()){
                unitnum.error = "Field is required"
                unitnum.requestFocus()
                return@setOnClickListener
            }
            else if(unitnum.text.toString().equals("0")){
                unitnum.error = "Must be more than 0"
                Toast.makeText(this, "Number should be more than zero", Toast.LENGTH_SHORT).show()
                unitnum.requestFocus()
                return@setOnClickListener
            }
            else{
                cont.visibility = View.GONE
                btncalc.visibility = View.VISIBLE
               var rows : Int = unitnum.text.toString().toInt()

                for (i in 1..rows){

                    var usedField = TextInputEditText(this)
                    usedField.layoutParams = params
                    usedField.id = View.generateViewId()
                    usedField.hint = "used Ballot papers"
                    viewused.add(usedField)

                    var unusedField = TextInputEditText(this)
                    unusedField.layoutParams = params
                    unusedField.id = View.generateViewId()
                    unusedField.hint = "Unused ballot papers"
                    viewunused.add(unusedField)

                    var votesField = TextInputEditText(this)
                    votesField.layoutParams = params
                    votesField.id = View.generateViewId()
                    votesField.hint = "Valid votes counted"
                    viewvotes.add(votesField)

                    var textview = TextView(this)
                    textview.text = "Unit "+i.toString()

                    linearLayout.addView(textview)
                    linearLayout.addView(usedField)
                    linearLayout.addView(unusedField)
                    linearLayout.addView(votesField)
            }
        }
        }

        btncalc.setOnClickListener {
            new_any_chart_view.visibility = View.VISIBLE
            totalused = 0
            totalunused = 0
            totalvotes = 0

            for (used in viewused){
                totalused += used.text.toString().toInt()
            }
            for (unused in viewunused){
                totalunused += unused.text.toString().toInt()
            }
            for (votes in viewvotes){
                totalvotes += votes.text.toString().toInt()
            }
            var dataEntries: MutableList<DataEntry> = java.util.ArrayList()
            dataEntries.add(ValueDataEntry("Used " + totalused.toString(), totalused))
            dataEntries.add(ValueDataEntry("Unused "+totalunused.toString(), totalunused))
            dataEntries.add(ValueDataEntry("Valid votes "+totalvotes.toString(), totalvotes))
            pie.data(dataEntries)
        }
    }
}