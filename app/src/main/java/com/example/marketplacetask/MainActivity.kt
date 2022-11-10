package com.example.marketplacetask


import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // access the items of the list
        val locations = resources.getStringArray(R.array.locations)

//        val countryNames =
//            arrayOf("India", "China", "Australia", "Portugle", "America", "New Zealand")
//        val flags = intArrayOf(
//            R.drawable.ic_baseline_location_on_24,
//            R.drawable.ic_baseline_location_on_24,
//            R.drawable.ic_baseline_location_on_24,
//            R.drawable.ic_baseline_location_on_24,
//            R.drawable.ic_baseline_location_on_24,
//            R.drawable.ic_baseline_location_on_24,
//
//            )
        // access the spinner
        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
//        if (spinner != null) {
//            val adapter = ArrayAdapter(
//                this,
//                android.R.layout.simple_spinner_item, locations
//            )
            spinner1.adapter = CustomAdapter(this, locations)
            spinner2.adapter = CustomAdapter(this, locations)

            spinner1.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    Toast.makeText(
                        this@MainActivity,
                        getString(R.string.selected_item) + " " +
                                "" + locations[position], Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.menu, menu)
//
//        val item: MenuItem = menu.findItem(R.id.spinner)
//        val spinner = MenuItemCompat.getActionView(item) as Spinner
//        val adapter = ArrayAdapter.createFromResource(
//            this,
//            R.array.languages, android.R.layout.simple_spinner_item
//        )
//        val languages = resources.getStringArray(R.array.languages)
//
//        adapter.setDropDownViewResource(R.layout.android_actionbar_toolbar_spinner_example_layout)
//        spinner.adapter = adapter
//        spinner.onItemSelectedListener = object :
//            AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>,
//                view: View, position: Int, id: Long
//            ) {
//                Toast.makeText(
//                    this@MainActivity,
//                    getString(R.string.selected_item) + " " +
//                            "" + languages[position], Toast.LENGTH_SHORT
//                ).show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>) {
//                // write code to perform some action
//            }
//        }
//        return true
//    }


