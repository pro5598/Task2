package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
import com.example.myapp.ui.theme.CustomGreen
import com.example.myapp.ui.theme.MyAppTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    InstaClone(innerPadding)
                }
            }
        }
    }
}

    @Composable
    fun InstaClone(innerPadding: PaddingValues) {
        Column(
            modifier =
                Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(color = CustomGreen)
        ) {

            Row(verticalAlignment = Alignment.CenterVertically, // to align icons and text in same horizontal line
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 0.dp, vertical = 5.dp)
            ){
                Spacer(modifier = Modifier.width(320.dp))
                Image (
                    painter = painterResource(R.drawable.profile2), contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .clip(shape = RoundedCornerShape(100.dp))
                )
            }
            Column (modifier = Modifier.padding(vertical = 3.dp, horizontal =10.dp)){
                Text(
                    text =  "Card",
                    style = TextStyle(
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
            }
            Column (modifier = Modifier.padding(vertical = 0.dp, horizontal = 10.dp)){
                Text(
                    text =  "Simple and easy to use app",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
            }
            Row (modifier = Modifier.padding(start = 10.dp, top = 50.dp)){
                Card (modifier = Modifier.height(150.dp).width(180.dp)){
                    Image (
                        painter = painterResource(R.drawable.bookicon), contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 60.dp, top = 20.dp)
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(100.dp))
                    )

                    Text(modifier = Modifier.padding(start=65.dp, top = 5.dp), text = "Text",style=TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold,

                    ))

                }

                Spacer(modifier = Modifier.width(10.dp))

                Card (modifier = Modifier.height(150.dp).width(180.dp)){
                    Image (
                        painter = painterResource(R.drawable.address), contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 60.dp, top = 20.dp)
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(100.dp))
                    )

                    Text(modifier = Modifier.padding(start=50.dp, top = 5.dp), text = "Address",style=TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold,

                        ))
                }
            }
            Row (modifier = Modifier.padding(start = 10.dp, top = 10.dp)){
                Card (modifier = Modifier.height(150.dp).width(180.dp)){
                    Image (
                        painter = painterResource(R.drawable.character), contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 60.dp, top = 20.dp)
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(100.dp))
                    )

                    Text(modifier = Modifier.padding(start=53.dp, top = 5.dp), text = "Character",style=TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold,

                        ))
                }

                Spacer(modifier = Modifier.width(10.dp))

                Card (modifier = Modifier.height(150.dp).width(180.dp)){
                    Image (
                        painter = painterResource(R.drawable.bankcard), contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 60.dp, top = 20.dp)
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(100.dp))
                    )

                    Text(modifier = Modifier.padding(start=55.dp, top = 5.dp), text = "Bank Card",style=TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold,

                        ))
                }
            }
            Row (modifier = Modifier.padding(start = 10.dp, top = 10.dp)){
                Card (modifier = Modifier.height(150.dp).width(180.dp)){
                    Image (
                        painter = painterResource(R.drawable.key), contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 60.dp, top = 20.dp)
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(100.dp))
                    )

                    Text(modifier = Modifier.padding(start=50.dp, top = 5.dp), text = "Password",style=TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold,

                        ))
                }

                Spacer(modifier = Modifier.width(10.dp))

                Card (modifier = Modifier.height(150.dp).width(180.dp)){
                    Image (
                        painter = painterResource(R.drawable.logistics), contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 60.dp, top = 20.dp)
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(100.dp))
                    )

                    Text(modifier = Modifier.padding(start=50.dp, top = 5.dp), text = "Logistics",style=TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold,

                        ))
                }
            }
            Row (modifier = Modifier.padding(start = 0.dp, top = 10.dp)){
                Card (modifier = Modifier.height(120.dp).fillMaxWidth().padding(start = 10.dp, end = 10.dp)) {
                    Row (modifier  = Modifier.padding(start =20.dp)){
                        Image(
                            painter = painterResource(R.drawable.settings),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding( top = 20.dp)
                                .height(60.dp)
                                .width(60.dp)
                                .clip(shape = RoundedCornerShape(100.dp))
                        )

                        Text(modifier = Modifier.padding(start = 10.dp, top = 30.dp), text = "Settings",style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold))
                    }
                }
            }


        }

    }


@Preview(showBackground = true)
@Composable
fun Preview() {
    InstaClone(innerPadding = PaddingValues())
}