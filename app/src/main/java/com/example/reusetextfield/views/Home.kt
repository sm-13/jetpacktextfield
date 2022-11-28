package com.example.reusetextfield.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.reusetextfield.components.textfields.BasicTextfield

@Composable
fun HomeScreen(){

//    WANT TO DEFINE MUTABLE TEXTFIELD VARIABLE HERE
//    LIKE
    var firstName by remember {
        mutableStateOf("")
    }

    var lastName by remember {
        mutableStateOf("")
    }


    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp, end = 10.dp)
            ) {
                Text(text = "Enter Your First Name")
                Spacer(modifier = Modifier.height(10.dp))

//                THIS TEXTFIELD IS FOR FIRST NAME AND WANT TO PASS "firstName" VARIABLE THROUGH ARGUMENTS
                BasicTextfield(
//                    WANT TO PASS "firstName" HERE AS ARGUMENT VALUE
                    basictext = firstName
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Enter Your Last Name")
                Spacer(modifier = Modifier.height(10.dp))
//                THIS TEXTFIELD IS FOR LAST NAME AND WANT TO PASS "lastName" VARIABLE THROUGH ARGUMENTS
                BasicTextfield(
//                    WANT TO PASS "lastName" HERE AS ARGUMENT VALUE
                    basictext = lastName
                )
            }
        }
    )
}