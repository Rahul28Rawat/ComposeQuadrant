package com.example.composequadrant

//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    FullApp()
                }
            }
        }
    }
}

@Composable
fun Aquadrant(
    Title: String,
    description:String,
    colorcode:Color,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            //.fillMaxSize()
            .background(colorcode)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = Title,
            modifier = modifier
                .padding(bottom = 16.dp)
                .wrapContentSize(),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = description,
            modifier = modifier,
            textAlign = TextAlign.Justify,
            )
    }
}

@Composable
fun FullApp(){
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f))
        {
            Aquadrant(
                stringResource(R.string.text_composable),
                stringResource(R.string.text_description),
                Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)

            )
            Aquadrant(
                stringResource(R.string.image_composable),
                stringResource(R.string.image_description),
                Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
                )
        }
        Row(Modifier.weight(1f))
        {
            Aquadrant(
                stringResource(R.string.row_composable),
                stringResource(R.string.row_description),
                Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Aquadrant(
                stringResource(R.string.column_composable),
                stringResource(R.string.column_description),
                Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        FullApp()
    }
}