package com.example.smarttrade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.rememberScrollState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.smarttrade.product_management.ui.addProductBooksScreen
import com.example.smarttrade.product_management.ui.addProductBooksViewModel
import com.example.smarttrade.product_management.ui.addProductClothesScreen
import com.example.smarttrade.product_management.ui.addProductClothesViewModel
import com.example.smarttrade.product_management.ui.addProductFoodScreen
import com.example.smarttrade.product_management.ui.addProductFoodViewModel
import com.example.smarttrade.product_management.ui.addProductTechnologyScreen
import com.example.smarttrade.product_management.ui.addProductTechnologyViewModel
import com.example.smarttrade.product_management.ui.productManagementScreen
import com.example.smarttrade.product_management.ui.productManagementViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val scrollState = rememberScrollState()
            NavHost(navController = navController, startDestination = "main") {
                composable("main") {
                    productManagementScreen(viewModel = productManagementViewModel(), navController)
                }
                composable("add1") {
                    addProductTechnologyScreen(
                        viewModel = addProductTechnologyViewModel(),
                        navController,
                        scrollState
                    )
                }
                composable("add2") {
                    addProductBooksScreen(
                        viewModel = addProductBooksViewModel(),
                        navController,
                        scrollState
                    )
                }
                composable("add3") {
                    addProductFoodScreen(
                        viewModel = addProductFoodViewModel(),
                        navController,
                        scrollState
                    )
                }
                composable("add4") {
                    addProductClothesScreen(
                        viewModel = addProductClothesViewModel(),
                        navController,
                        scrollState
                    )
                }


            }
        }
    }
}
