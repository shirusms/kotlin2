package com.shiruh.shiruh.ui.theme.screens.home

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shiruh.shiruh.R

@Composable
fun Homescreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top){
        Text("Shiru App",
            color = Color.Black,
            fontSize = 50.sp,
            fontFamily = FontFamily.Serif,
            fontStyle = FontStyle.Italic)
        Spacer(modifier = Modifier.height(40.dp))
        Image(painter = painterResource(id= R.drawable.arsenal),
            contentDescription = "arsenal",
            modifier = Modifier)
        Text("My App aims at improving how things are done",
            color = Color.Black,
            fontSize = 45.sp,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Normal)
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = {},
            modifier = Modifier.width(300.dp)) {
            Text("Login",
                fontSize = 30.sp,
                color = Color.Black)
        }
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = {},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)) {
            Text("Registration",
                fontSize = 30.sp,
                color = Color.Black)
        }

    }

}

@Preview
@Composable
private fun Homeprev() {
    Homescreen()

}