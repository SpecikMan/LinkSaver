package com.specikman.linksaver

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.specikman.linksaver.ui.theme.LinkSaverTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LinkSaverTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Header(this)
                }
            }
        }
    }
}

@Composable
fun Header(
    context: Context
) {
    val textFieldState = remember { mutableStateOf("") }
    val showList = remember{ mutableStateOf(false) }
    val numberOfText = remember { mutableStateOf(0) }
    LazyColumn() {
        item{
            Row() {
                OutlinedTextField(value = textFieldState.value, onValueChange = {
                    textFieldState.value = it
                })
                Spacer(modifier = Modifier.width(15.dp))
                Button(onClick = {
                    numberOfText.value = textFieldState.value.toInt()
                    showList.value = !showList.value
                }) {
                    Text(text = "Click me")
                }
            }
            if(showList.value){
                ListText(numberOfText = numberOfText.value, context = context)
            }
        }
    }
}

@Composable
fun ListText(
    numberOfText: Int,
    context: Context
) {
    Column(){
        for (i in 0..numberOfText){
            Button(onClick = { /*TODO*/ }) {
                Text("HAHA")
                "Clicked".toastMe(context = context)
            }
        }
    }
}

fun String.toastMe(context: Context){
    Toast.makeText(context, this, Toast.LENGTH_LONG).show()
}

