package com.example.wetherapp.adapters

data class WeatherModel (
    val city: String,
    val time: String,
    val condition: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val humidity: String,
    val windSpeed: String,
    val imageUrl: String,

    //фрагмент куска где у нас есть информоция о погоде по часам
    //ввиде json формата таком же виде каком мы получаем с сервера сохраним виде String
    val hours: String
)