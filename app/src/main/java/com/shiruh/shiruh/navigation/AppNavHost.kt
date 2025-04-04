package com.shiruh.shiruh.navigation

import android.graphics.pdf.content.PdfPageGotoLinkContent.Destination
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shiruh.shiruh.ui.theme.screens.home.Homescreen
import com.shiruh.shiruh.ui.theme.screens.login.Loginscreen
import com.shiruh.shiruh.ui.theme.screens.registration.Registrationscreen
import com.shiruh.shiruh.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController =rememberNavController(),
               startDestination: String= route_SPLASH) {
    NavHost(navController=navController,
        modifier=modifier,
        startDestination=startDestination){
        composable(route_HOME){
            Homescreen(navController)
        }
        composable(route_LOGIN){
            Loginscreen(navController)
        }
        composable(route_REGISTER){
            Registrationscreen(navController)

        }
        composable(route_SPLASH){
            SplashScreen(navController)
        }
    }

}