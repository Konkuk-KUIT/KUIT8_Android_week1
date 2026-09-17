package com.example.myapplication.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

// Set of Material typography styles to start with
val Typography =
    Typography(
        bodyLarge =
            TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp,
            ),
        /* Other default text styles to override
        titleLarge = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 22.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp
        ),
        labelSmall = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Medium,
            fontSize = 11.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        )
         */
    )

val profileFontFamily: FontFamily = FontFamily(
    Font(resId = R.font.noto_sans_kr_regular),
    Font(resId = R.font.noto_sans_kr_bold),
)

val studentBrandStyle = TextStyle(
    fontFamily = profileFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 13.sp,
    lineHeight = 20.sp,
    letterSpacing = 0.sp
)
val profileTitleStyle = TextStyle(
    fontFamily = profileFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 28.sp,
    lineHeight = 40.sp,
    letterSpacing = 0.sp
)
val studentSchoolStyle = TextStyle(
    fontFamily = profileFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 18.sp,
    lineHeight = 28.sp,
    letterSpacing = 0.sp
)
val studentEnglishLabelStyle = TextStyle(
    fontFamily = profileFontFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 10.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.sp
)
val profileNameStyle = TextStyle(
    fontFamily = profileFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 24.sp,
    lineHeight = 34.sp,
    letterSpacing = 0.sp
)
val studentBodyStyle = TextStyle(
    fontFamily = profileFontFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 22.sp,
    letterSpacing = 0.sp
)
val studentStatusStyle = TextStyle(
    fontFamily = profileFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 12.sp,
    lineHeight = 20.sp,
    letterSpacing = 0.sp
)
val studentFieldLabelStyle = TextStyle(
    fontFamily = profileFontFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 12.sp,
    lineHeight = 22.sp,
    letterSpacing = 0.sp
)
val profileActionStyle = TextStyle(
    fontFamily = profileFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 14.sp,
    lineHeight = 22.sp,
    letterSpacing = 0.sp
)
val studentCaptionStyle = TextStyle(
    fontFamily = profileFontFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 12.sp,
    lineHeight = 20.sp,
    letterSpacing = 0.sp
)