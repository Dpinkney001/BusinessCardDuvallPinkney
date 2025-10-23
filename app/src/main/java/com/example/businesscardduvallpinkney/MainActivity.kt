package com.example.businesscardduvallpinkney

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscardduvallpinkney.ui.theme.BusinessCardDuvallPinkneyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardDuvallPinkneyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF3ddc84),
                    color = MaterialTheme.colorScheme.background,
                    color = Color(0xFF3ddc84)
                ) {
                    GreetingImage(
                        stringResource(R.string.full_name_text),
                        stringResource(R.string.title_text),
                        stringResource(R.string.phone_text),
                        stringResource(R.string.website_text),
                        stringResource(R.string.email_text),
                        stringResource(R.string.linkedin_text)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(name: String, website: String,phone: String, title: String, email: String, linkedin: String, modifier: Modifier = Modifier) {
    // Create a column so that texts don't overlap
    Box() {
        Box(modifier) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = modifier
            ) {
                Text(
                    text = name,
                    color = Color(0xFF3ddc84),
                    fontSize = 20.sp,
                    lineHeight = 116.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 16.dp)
                )
                Text(
                    text = title,
                    color = Color(0xFF3ddc84),
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .padding(end = 16.dp)
                        .align(alignment = Alignment.End)
                )
            }// name and title box ending
            Box(modifier) {
                // Create a column so that texts don't overlap
                Column(
                    verticalArrangement = Arrangement.Center,
                    //horizontalAlignment = Arrangment.CenterHorizontally,
                    modifier = modifier
                ) {
                    Text(
                        text = website,
                        fontSize = 20.sp,
                        color = Color(0xFF3ddc84),
                        //lineHeight = 116.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 16.dp)
                    )
                    Text(
                        text = email,
                        fontSize = 20.sp,
                        color = Color(0xFF3ddc84),
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .padding(end = 16.dp)
                            .align(alignment = Alignment.End)
                    )
                    Text(
                        text = linkedin,
                        fontSize = 20.sp,
                        color = Color(0xFF3ddc84),
                        //lineHeight = 116.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 16.dp)
                    )
                    Text(
                        text = phone,
                        color = Color(0xFF3ddc84),
                        fontSize = 20.sp,
                        modifier = Modifier
                        //.padding(top = 16.dp)
                        //.padding(end = 16.dp)
                        //.align(alignment = Alignment.End)
                    )
                }
            }// box 2 ending
        }
    }
}

@Composable
fun GreetingImage(
    name: String,
    website: String,
    phone: String,
    title: String,
    email: String,
    linkedin: String,
    modifier: Modifier = Modifier
) {
    // Create a box to overlap image and texts
    Box(modifier) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            //alpha = 0.5F
        )
        GreetingText(
            name = "Duvall Pinkney",
            title = "Software and Computer Engineer",
            website = "https://duvallpinkney.com",
            email = "duvall.p@duvallpinkney.com",
            linkedin = "https://www.linkedin.com/in/duvall-pinkney-16949260/",
            phone = "9172429975",
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = false)
@Composable
fun BusinessCardDuvallPinkneyPreview() {
    BusinessCardDuvallPinkneyTheme {
        com.example.businesscardduvallpinkney.GreetingImage(
            stringResource(R.string.full_name_text),
            stringResource(R.string.title_text),
            stringResource(R.string.phone_text),
            stringResource(R.string.website_text),
            stringResource(R.string.email_text),
            stringResource(R.string.linkedin_text)
        )
    }
}




}
        }
    }
}