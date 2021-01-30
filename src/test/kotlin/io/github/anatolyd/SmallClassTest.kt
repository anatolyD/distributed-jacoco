package io.github.anatolyd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.concurrent.TimeUnit

internal class SmallClassTest {
    @Test
    internal fun `small tests`() {
        Thread.sleep(TimeUnit.MINUTES.toMillis(5))
        assertEquals("small", SmallClass().haveFun())
    }
}
