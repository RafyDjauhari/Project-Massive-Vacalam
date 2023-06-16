package com.example.project_massive_vacalam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.SearchView
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class Search : AppCompatActivity() {

    lateinit var wisataList: ArrayList<Wisata>
    lateinit var searchView: SearchView
    lateinit var listView: ListView
    lateinit var wisataAdapter: ArrayAdapter<Wisata>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        searchView = findViewById(R.id.searchView)
        listView = findViewById(R.id.itemList)

        // Create an instance of DataSourceWisata
        val dataSource = DataSourceWisata()

        // Get the list of Wisata objects from the data source
        wisataList = dataSource.getItemDataList()

        // Create an adapter for the ListView
        wisataAdapter = ArrayAdapter(
            this,
            R.layout.list_item_wisata, // Replace 'list_item' with the actual name of your custom layout
            R.id.textName,
            wisataList
        )


        listView.adapter = wisataAdapter;

        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = wisataList[position]
            // Start the activity for the selected item
            val intent = Intent(this, DetailedWisata::class.java)
            intent.putExtra("wisata", selectedItem) // Pass the selected item to the next activity
            startActivity(intent)
        }

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText.isNullOrEmpty()) {
                    listView.visibility = View.GONE
                } else {
                    listView.visibility = View.VISIBLE
                    val filteredList = wisataList.filter { wisata ->
                        wisata.namaWisata.contains(newText, ignoreCase = true)
                    }
                    wisataAdapter.clear()
                    wisataAdapter.addAll(filteredList)
                    listView.adapter = wisataAdapter
                }
                return false
            }
        })

    }
}
