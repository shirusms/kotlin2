package com.shiruh.shiruh.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.shiruh.shiruh.navigation.route_HOME
import com.shiruh.shiruh.navigation.route_REGISTER

@Composable
fun Loginscreen (navController:NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        Text("Login Page",
            fontSize = 35.sp,
            color = Color.Red,
            fontFamily = FontFamily.Serif)
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(value =email ,
            onValueChange ={email=it},
            label = { Text(text = "Enter Email")},
            leadingIcon = { Icon(Icons.Default.Email,
                contentDescription ="Email" ) },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(value = password,
            onValueChange = {password=it},
            label = { Text(text = "Enter your password") },
            leadingIcon = { Icon(Icons.Default.Lock,
                contentDescription = "Password") },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {/*TODO*/},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Login",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace)
            Text(
                text = "Back Home",
                fontSize=30.sp,
                modifier = Modifier.clickable { navController.navigate(route_HOME) }

            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Dont have an account!!click to sign up"+
            "Click to sign up",
            fontSize = 20.sp,
            fontFamily= FontFamily.Serif,
            modifier=Modifier.clickable { navController.navigate(route_REGISTER) }
        )


    }

}

@Preview
@Composable
private fun Loginprev() {
    Loginscreen(rememberNavController())

}