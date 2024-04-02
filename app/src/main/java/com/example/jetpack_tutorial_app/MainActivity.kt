package com.example.jetpack_tutorial_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.jetpack_tutorial_app.ui.theme.Jetpack_tutorial_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_tutorial_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TopImage(title = "Jetpack Compose Tutorial")
                }
            }
        }
    }
}

@Composable
fun WriteArticle(title: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = title,
            modifier = modifier
                .padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = stringResource(id = R.string.para_one),
            modifier = modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.para_two),
            modifier = modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Justify
        )
    }


}

@Composable
fun TopImage(title: String){

    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null
        )
        WriteArticle(title = title)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetpack_tutorial_appTheme {
        TopImage(title = "Jetpack Compose Tutorial")
    }
}