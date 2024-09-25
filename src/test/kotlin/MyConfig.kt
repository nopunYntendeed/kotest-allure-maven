package com.sksamuel.kotest.example.allure

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.extensions.allure.AllureTestReporter

class MyConfig : AbstractProjectConfig() {
    @Deprecated("Use extensions. This will be removed in 6.0")
    override fun listeners() = listOf(AllureTestReporter())
}
