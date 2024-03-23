package com.example.bevy.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun Input(
    label:String,
    placeholder: String,
    value:String,
    onValueChange:(String)->Unit,
    modifier: Modifier =Modifier
) {
    Column(modifier = Modifier
        .fillMaxWidth()

    ) {
        Text(text = label)

        Spacer(modifier = Modifier .height(8.dp))

        OutlinedTextField(
            value = value,
            onValueChange =onValueChange,
            placeholder={
                Text(text = placeholder)
            },
            modifier =Modifier
                .background(Color.Cyan)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp)

        )

    }


}

@Composable
fun InputPassword(
    label: String="Password",
    placeholder: String="Enter Your Password",
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier =Modifier
) {
    var passwordVisible by remember {
        mutableStateOf(false)
    }
    Spacer(modifier = Modifier.height(8.dp))
    Column (modifier = modifier.fillMaxWidth()){
        Text(text = label )

        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            placeholder={
                Text(text = placeholder)
            },
            modifier =Modifier
                .background(Color.Cyan)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),

                    keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),

            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),


            trailingIcon = {
                IconButton(onClick = {
                    passwordVisible = !passwordVisible
                }) {
                    Icon(

                        imageVector = if(passwordVisible) Icons.Default.VisibilityOff else Icons.Default.Visibility,
                        contentDescription = null
                    )

                }

            }


            )

    }


}