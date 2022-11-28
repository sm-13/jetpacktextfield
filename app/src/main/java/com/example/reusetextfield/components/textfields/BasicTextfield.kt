package com.example.reusetextfield.components.textfields

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun BasicTextfield(
    basictext: String
){
//    HERE BASICTEXT IS NOT MUTABLE
    TextField(
        modifier = Modifier.fillMaxWidth(),
        value = basictext,
        onValueChange = {
            basictext = it
        }
    )
}

// MY GOAL IS CREATE ONE COMPONENT FOR SAME UI, AND USE IT FOR DIFFERENT PURPOSE.