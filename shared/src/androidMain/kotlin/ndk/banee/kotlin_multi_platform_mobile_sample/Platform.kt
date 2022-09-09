package ndk.banee.kotlin_multi_platform_mobile_sample

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}