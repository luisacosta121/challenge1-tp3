package com.example.welcomescreen.ui.theme


import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.welcomescreen.R

// Set of Material typography styles to start with

//Provedor de Fuentes Externo
/*val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val robotoFont = GoogleFont("Roboto")

val robotoFamily = FontFamily(
    GoogleFontFont(googleFont = robotoFont, fontProvider = provider, weight = FontWeight.Normal, style = FontStyle.Normal),
    GoogleFontFont(googleFont = robotoFont, fontProvider = provider, weight = FontWeight.Bold, style = FontStyle.Italic),
)*/
//---------------------------------------------------------------------
//CONFIGURACION DE FUENTE DE FORMA LOCAL
val poppinsFamily = FontFamily(
    Font(R.font.poppins_regular, weight = FontWeight.Normal),
    Font(R.font.poppins_bold, weight = FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )


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