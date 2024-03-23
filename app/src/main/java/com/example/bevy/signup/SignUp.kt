package com.example.bevy.signup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bevy.components.Input
import com.example.bevy.components.InputPassword
import com.example.bevy.components.PrimaryButton

@Composable
fun SignUpScreen() {

    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column (modifier = Modifier
        .padding(16.dp),


    ){
        Text(text = "REGISTER", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Input(label ="UserName" , placeholder ="Enter Username" , value =username , onValueChange ={
            username=it
        } )
        Spacer(modifier = Modifier.height(8.dp))

        Input(label = "Email", placeholder = "Enter Your Email", value =email, onValueChange = {
            email=it
        })
        Spacer(modifier = Modifier.height(8.dp))


        InputPassword(value = password, onValueChange ={
            password=it
        } )
        Spacer(modifier = Modifier.height(8.dp))
        
        PrimaryButton(label = "REGISTER", onClick = { /*TODO*/ })
    }

}