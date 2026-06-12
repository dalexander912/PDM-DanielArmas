package com.pdm0126.laboratorio4

import android.app.Application
import com.pdm0126.laboratorio4.data.AppProvider

class Lab5Application : Application() {
  val appProvider by lazy { AppProvider(this) }
}