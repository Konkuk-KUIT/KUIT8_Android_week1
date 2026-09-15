package com.example.myapplication

import android.R
import android.R.attr.onClick
import android.net.wifi.WifiSsid
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
import com.example.myapplication.ui.theme.studentAccent
import com.example.myapplication.ui.theme.studentBodyStyle
import com.example.myapplication.ui.theme.studentBrandStyle
import com.example.myapplication.ui.theme.studentCaptionStyle
import com.example.myapplication.ui.theme.studentEnglishLabelStyle
import com.example.myapplication.ui.theme.studentFieldLabel
import com.example.myapplication.ui.theme.studentFieldLabelStyle
import com.example.myapplication.ui.theme.studentHeader
import com.example.myapplication.ui.theme.studentNoticeBackground
import com.example.myapplication.ui.theme.studentOnHeaderMuted
import com.example.myapplication.ui.theme.studentSchoolStyle
import com.example.myapplication.ui.theme.studentStatusStyle

//comp
@Composable
fun MyProfileScreen(modifier: Modifier = Modifier) {
    //WC
    Column (
        modifier = modifier
            .background(profileBackground)
            .padding(horizontal = 24.dp)
            .padding(top = 32.dp, bottom = 24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ){
        MyProfileTitle()
        MyProfileCard()
        Introduction()
        Spacer(Modifier.weight(1f))
        ButtonLayer()
    }
}

@Composable
fun MyProfileTitle(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Text(text = "KUIT CAMPUS", style = studentBrandStyle,color = studentAccent)
        Spacer(Modifier.height(6.dp))
        Text(text = "모바일 학생증", style = profileTitleStyle, color = profileText)
    }
}

@Composable
fun MyProfileCard(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = profileBorder)

    ){

        StudentHeader()
        StudentBody()
    }
}

@Composable
fun StudentHeader(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxWidth() //주어진 화면 가득 채우기 + 모든 composable에 걸어주는게 좋음
            .background(studentHeader)
            .padding(20.dp)
    ){
        Text(text = "KUIT CAMPUS", style = studentSchoolStyle, color = profileWhite)
        Spacer(Modifier.height(6.dp))
        Text(text = "STUDENT IDENTIFICATION", style = studentEnglishLabelStyle, color = studentOnHeaderMuted)
    }
}

@Composable
fun StudentBody(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxWidth()
            .background(profileWhite),
    ) {
        StudentProfile()
        StudentInfo()
    }
}

@Composable
fun StudentProfile(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 8.dp),
    ) {
        Text(text = "이태경", style = profileNameStyle, color = profileText)
        Spacer(Modifier.height(6.dp))
        Text(text = "컴퓨터 공학부", style = studentBodyStyle, color = profileMuted)
        Spacer(Modifier.height(6.dp))
        Text(text = "학부생 · 재학", style = studentStatusStyle, color = studentAccent)
    }
}

@Composable
fun StudentInfo(modifier: Modifier = Modifier) {
    val labels : List<String> = listOf("학번", "입학", "발급")
    val values : List<String> = listOf("202311356", "2023.03", "2026.09.16")

    Column (
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        labels.zip(values).forEach {
            (label, value) ->
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ) {
                    Text(
                        text = label,
                        style = studentFieldLabelStyle,
                        color = studentFieldLabel,
                        modifier = Modifier.weight(0.2f)
                    )
                    Spacer(Modifier.width(10.dp))
                    Text(
                        text = value,
                        style = profileActionStyle,
                        color = profileText,
                        modifier = Modifier.weight(0.8f)
                    )
                }
        }
    }
}

@Composable
fun Introduction (modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxWidth() //주어진 화면 가득 채우기 + 모든 composable에 걸어주는게 좋음
            .background(studentNoticeBackground)
            .padding(20.dp)
    ){
        Text(text = "나를 소개하는 한 장", style = profileActionStyle, color = studentHeader)
        Spacer(Modifier.height(6.dp))
        Text(text = "안녕하세요 이태경입니다", style = studentCaptionStyle, color = profileMuted)
    }
}

@Composable
fun ButtonLayer(modifier: Modifier = Modifier) {
    val labels : List<String> = listOf("학생 정보", "이용 안내")

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        labels.forEach {
            Button(
                onClick = {},
                modifier = Modifier
                    .weight(1f)
            ){
                Text(text = it, style = profileActionStyle, color = profileWhite)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun MyProfileScreenPreview() {
    MyProfileScreen()
}


