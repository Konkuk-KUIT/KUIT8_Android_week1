package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.profileActionStyle
import com.example.myapplication.ui.theme.profileBackground
import com.example.myapplication.ui.theme.profileBodyStyle
import com.example.myapplication.ui.theme.profileBorder
import com.example.myapplication.ui.theme.profileMuted
import com.example.myapplication.ui.theme.profileNameStyle
import com.example.myapplication.ui.theme.profileText
import com.example.myapplication.ui.theme.profileTitleStyle
import com.example.myapplication.ui.theme.profileWhite

@Composable
fun MyProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(profileBackground)
            .padding(horizontal = 24.dp)
            .padding(top = 32.dp, bottom = 24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "프로필", style = profileTitleStyle, color = profileText
        )
        MyProfileCard()
        MyTags()
        Spacer(Modifier.weight(1f))
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "응원하기", style = profileActionStyle, color = profileWhite)
        }
    }
}

@Composable
fun MyProfileCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(profileWhite)
            .border(width = 1.dp, color = profileBorder)
            .padding(20.dp)

    ) {
        Text(text = "정일혁", style = profileNameStyle, color = profileText)
        Spacer(Modifier.height(6.dp))
        Text(text = "Android · 8기", style = profileBodyStyle, color = profileMuted)
    }
}

@Composable
fun MyTags(modifier: Modifier = Modifier) {
    val tags = listOf("안드로이드", "jetpack", "compose")
    val labels = tags.map { "#" + it }
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        labels.forEach {
            Text(
                text = it, style = profileBodyStyle, color = profileMuted,
                modifier = Modifier
                    .background(profileWhite)
                    .border(width = 1.dp, color = profileBorder)
                    .padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }
    }
}

@Composable
fun Worm(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
//            .width(IntrinsicSize.Max)
//            .width(IntrinsicSize.Min)
            .background(Color.Cyan)
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = "Earthworm",
            )
            Row(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
                    .background(Color.DarkGray)
            ) {}
            Text(
                text = "A small animal that lives in soil.",
            )
        }
    }
}

@Composable
fun Trash(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .background(Color.Green)
                .size(60.dp)
                .padding(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.Red)
            )

        }
        Box(
            modifier = Modifier
                .background(Color.Green)
                .padding(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.Red)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TrashPreview() {
    Trash()
}

@Preview(showBackground = true)
@Composable
private fun MyProfileScreenPreview() {

    MyProfileScreen()
}

@Preview(showBackground = true)
@Composable
private fun WormPreview() {
    Worm()
}