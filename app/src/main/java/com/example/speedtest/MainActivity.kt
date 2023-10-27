package com.example.speedtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.speedtest.ui.theme.ComposeSpeedTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //setContent {...}: Этот блок кода устанавливает контент (интерфейс) для активности. В данном случае, используется Compose для создания интерфейса.
            ComposeSpeedTestTheme {
                //ComposeSpeedTestTheme {...}: Здесь устанавливается тема оформления для приложения с помощью Compose.
                Surface(
                    //Surface {...}: Это элемент, представляющий поверхность, на которой располагаются элементы пользовательского интерфейса.
                    //В данном случае, он занимает максимально возможное пространство.
                    modifier = Modifier
                        .fillMaxSize(),
                ) {
                    SpeedTestScreen()
                    //SpeedTestScreen(): Это вызов функции SpeedTestScreen(), которая, вероятно, отвечает за отображение экрана тестирования скорости.
                }
            }
        }
    }
}

