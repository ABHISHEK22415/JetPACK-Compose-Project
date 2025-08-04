package com.example.android_sample_project

import android.os.Bundle
import android.widget.NumberPicker.OnValueChangeListener
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_sample_project.ui.theme.Android_Sample_projectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android_Sample_projectTheme {

                var textState= remember { mutableStateOf("") }

                var textList= remember { mutableStateOf(listOf<String>()) }
                //need proper padding and proper UI background theme for this

                Column (modifier = Modifier.fillMaxSize().padding(16.dp))
                {
                    Row (modifier = Modifier.fillMaxWidth()){

                       OutlinedTextField(value=textState.value,
                           onValueChange = {newText-> textState.value=newText},
                           label={ Text("Enter your text name ") },)

                        Button(onClick = {textList.value = textList.value + textState.value })
                        {
                            Text("Submit")
                        }





                    }
                    LazyColumn { items(textList.value)
                    {currentText ->  Text(text = currentText)
                    }
                    }


                }




            }
        }
    }
}


// understanding the state management in the COmpose




