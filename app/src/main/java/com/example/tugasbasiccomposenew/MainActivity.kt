package com.example.tugasbasiccomposenew

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasbasiccomposenew.ui.theme.TugasBasicComposeNewTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            TugasBasicComposeNewTheme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicColumn(modifier =Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun BasicColumn(modifier : Modifier = Modifier) {
    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = modifier
            .fillMaxSize()
            .padding(top = 30.dp)
    ) {
        Spacer(modifier = Modifier.padding(50.dp))

        Text(
            "Login",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold

        )
        Text(
            "ini adalah halaman login",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold

        )

        Spacer(modifier = Modifier.padding(10.dp))

        Image(

            painter = painterResource(id = R.drawable.ftumy),
            contentDescription = "",
            modifier = Modifier
                .size(200.dp)
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            "Nama :",
            fontSize = 20.sp,)
        Text(
            "Danar Adi Nugroho",
            fontSize = 20.sp)

        Spacer(modifier = Modifier.padding(10.dp))
        Image(
            painter = painterResource(id = R.drawable.ftku),
            contentDescription = "",
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
                .padding(4.dp)

        )

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TugasBasicComposeNewTheme{
        BasicColumn()
    }

}













