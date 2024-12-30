package app.revanced.patches.bilibili.misc.okhttp.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object HttpUrlFingerprint : MethodFingerprint(
    strings = listOf("javaWhitespace"),
    customFingerprint = { _, classDef ->
        classDef.startsWith("Lokhttp3")
    }
)
