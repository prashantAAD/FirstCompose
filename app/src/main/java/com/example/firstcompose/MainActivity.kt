package com.example.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/**
 * compose is a android native ui toolkit written in kotlin.
 * its not a part of android framework,its a jetpack library not a part of framework.
 * In layouts we were using View classes(basic building block)
 * but in compose we use composable functions fo UI @composable (annotation) which can be inbuilt or defined by us.
 * Imperative vs declarative : imperative means we give instruction step by step whatever we want to accomplish. but in declarative we declare first whatever we want to accomplish and system identifies itself how to accomplish task or make UI on the bases of data.
 * existing view system of android based on yhe inheritance.
 * all views inherit from View Class.
 * for large codebase inheritance becomes complex.
 * compose codebase  based on composition (means we include whatever we want)
 * RECOMPOSITON : in simple words whenever your state changes,it will recreate the UI.
 * **/

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "hello aliens")// built in composable.
        }
    }

}


@Composable
fun SayCheezy(name: String = " prashant chauhan") {
    Text(
        text = "hello $name",
        )
}

@Preview(showBackground = true,name = "hello messege", showSystemUi = true)
@Composable
private fun PreviewFunction(){
SayCheezy(name="aarav chauhan")
}

/**


@Preview(showBackground = true,name = "hello messege 2")
@Composable
fun SayCheezy2(name: String = " prashant chauhan2") {
    Text(
        text = "hello $name",
    )
}
 */

