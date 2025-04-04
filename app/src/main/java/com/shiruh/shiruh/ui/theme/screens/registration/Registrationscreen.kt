package com.shiruh.shiruh.ui.theme.screens.registration

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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
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
import com.shiruh.shiruh.navigation.route_LOGIN

@Composable
fun Registrationscreen (navController:NavHostController) {
    var firstname by remember { mutableStateOf(TextFieldValue("")) }
    var lastname by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        Text("Register Page",
            fontSize = 35.sp,
            color = Color.Red,
            fontFamily = FontFamily.Serif)
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value =firstname ,
            onValueChange ={firstname=it},
            label = { Text(text = "Enter First Name") },
            leadingIcon = { Icon(
                Icons.Default.Person,
                contentDescription ="firstname" ) },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value =lastname ,
            onValueChange ={lastname=it},
            label = { Text(text = "Enter Last Name") },
            leadingIcon = { Icon(
                Icons.Default.Person,
                contentDescription ="lastname" ) },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value =email ,
            onValueChange ={email=it},
            label = { Text(text = "Enter Email") },
            leadingIcon = { Icon(
                Icons.Default.Email,
                contentDescription ="Email" ) },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = password,
            onValueChange = {password=it},
            label = { Text(text = "Enter your password") },
            leadingIcon = { Icon(
                Icons.Default.Lock,
                contentDescription = "Password") },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {/*TODO*/},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Register",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Have an account??click to login"+
            "Click to login",
            fontSize = 28.sp,
            fontFamily = FontFamily.SansSerif,
            modifier=Modifier.clickable { navController.navigate(route_LOGIN) }


        )


    }

}

@Preview
@Composable
private fun Registrationprev() {
    Registrationscreen(rememberNavController())

}