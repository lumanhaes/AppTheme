package br.com.fiap.app

import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.app.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    var corBackground by remember{ mutableStateOf(Color.White) }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(corBackground), verticalArrangement = Arrangement.Center) {
        
        Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){

            //Modo Claro
            Button(
                onClick = {
                    corBackground = Color.White
                },
                modifier = Modifier
                    .padding(top = 12.dp)
                    .width(150.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFFFFFFF), contentColor = Color(
                    0xFF050505
                )
                ),
                border = BorderStroke(2.dp, Color(0xFF000000))

            ) {
                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Modo Claro")
                    Icon(painterResource(id = R.drawable.baseline_light_mode_24), contentDescription = "")
                }
            }

            //Modo Escuro
            Button(
                onClick = {
                    corBackground = Color.Black
                },
                modifier = Modifier
                    .padding(top = 12.dp)
                    .width(150.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF000000), contentColor = Color(
                    0xFFFFFFFF
                )
                ),
                border = BorderStroke(2.dp, Color(0xFFFFFFFF))

            ) {
                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Modo Escuro")
                    Spacer(modifier = Modifier.padding(horizontal = 2.dp))
                    Icon(painterResource(id = R.drawable.baseline_dark_mode_24), contentDescription = "")
                }
            }
        }
    }
}

@Preview(showSystemUi = true ,showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting()
}

