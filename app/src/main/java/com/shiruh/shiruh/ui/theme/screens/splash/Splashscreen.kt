package com.shiruh.shiruh.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.shiruh.shiruh.R
import com.shiruh.shiruh.navigation.route_HOME
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
//    show splash screen for 3 seconds
    LaunchedEffect(Unit) {
        delay(3000)
        navController.navigate(route_HOME)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ){
//        splash screen content(logo or image)
        Image(
            painter = painterResource(id =R.drawable.sky1),
            contentDescription = "Splash Screen Logo",
            modifier = Modifier.size(150.dp)
        )
    }

}
