package com.adrpien.navigationuiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.adrpien.navigationuiapp.databinding.ActivityMainBinding

/*

Powstał by ułatwić proces tworzenia nawigacji (operacji na na fragmentach)

 How to use navigation graph:
 1. Add dependecies and plugins in build gradle in build.gradle project and module
 2. Set compileOptions and kotlinOptions to Java 1.8 in build.gradle module
 3. Add NavHostContainer in your activity (in your host)
 4. Create Navigation Graph (describe actions and destinations)
 5. Use NavController in your kotlin file to use actions
    findNavController(HomeFragmentDirections.(action id))
 6. Add animations XML file
 7. Add animations to your XML nav graph (in action)
 8. Use SafeArgs to move data between fragments using budleOf and add actionId in navigate method
 9. Receive data in  other fragment using argument.getString(key)

 How to use bottom navigation menu:
 1. Create XML menu file
    - item id have to be same as fragment name in navigation graph
 2. Add BottomNavMenu to your fragment
 2. Use setupWithNAcController


 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomMenu.setupWithNavController(findNavController(R.id.fragmentContainerView))


    }
}