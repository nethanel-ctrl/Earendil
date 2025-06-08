package org.example.navigation

package com.example.earendilmusic.navigation

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.navigation.compose.*
import com.example.earendilmusic.ui.*

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigation {
                val current = navController.currentBackStackEntryAsState().value?.destination?.route
                listOf("home", "search", "library").forEach { screen ->
                    BottomNavigationItem(
                        selected = current == screen,
                        onClick = { navController.navigate(screen) },
                        label = { Text(screen.replaceFirstChar { it.uppercase() }) },
                        icon = {}
                    )
                }
            }
        }
    ) { padding ->
        NavHost(navController, startDestination = "home") {
            composable("home") { HomeScreen() }
            composable("search") { SearchScreen() }
            composable("library") { LibraryScreen() }
        }
    }
}
