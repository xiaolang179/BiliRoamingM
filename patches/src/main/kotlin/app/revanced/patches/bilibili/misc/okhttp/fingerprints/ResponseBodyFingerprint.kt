package app.revanced.patches.bilibili.misc.okhttp.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object ResponseBodyFingerprint : MethodFingerprint(
    strings = listOf("Cannot buffer entire body for content length: "),
    customFingerprint = { _, classDef ->
        classDef.startsWith("Lokhttp3")
    }
)
