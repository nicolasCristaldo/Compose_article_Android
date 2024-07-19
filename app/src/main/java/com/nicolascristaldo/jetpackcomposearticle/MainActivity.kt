package com.nicolascristaldo.jetpackcomposearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nicolascristaldo.jetpackcomposearticle.ui.theme.JetpackComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeArticleTheme {
                Greeting(
                    title = stringResource(R.string.app_title),
                    description = stringResource(R.string.app_description),
                    paragraph = stringResource(R.string.app_paragraph)
                )
            }
        }
    }
}

@Composable
fun Greeting(title: String, description: String, paragraph: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column(
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp, 0.dp)
        )
        Text(
            text = paragraph,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp, 16.dp, 16.dp, 0.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeArticleTheme {
        Greeting(
            title = stringResource(R.string.app_title),
            description = stringResource(R.string.app_description),
            paragraph = stringResource(R.string.app_paragraph)
        )
    }
}