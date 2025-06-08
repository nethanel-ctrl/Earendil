package org.example.ui

package com.example.earendilmusic.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Column(Modifier.padding(16.dp)) {
        Text("Home - Earendil Music", style = MaterialTheme.typography.h5)
    }
}
