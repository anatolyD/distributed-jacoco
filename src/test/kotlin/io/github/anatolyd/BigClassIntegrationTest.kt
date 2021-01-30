package io.github.anatolyd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import java.util.concurrent.TimeUnit

internal class BigClassIntegrationTest {
    @Test
    internal fun `integration test`() {
        Thread.sleep(TimeUnit.MINUTES.toMillis(7))
        assertEquals("big", BigClass().haveFun())
    }
}
