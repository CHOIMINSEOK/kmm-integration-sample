package com.jetbrains.simplelogin.shared

import platform.Foundation.NSUUID

actual fun randomUUID() = NSUUID().UUIDString()
