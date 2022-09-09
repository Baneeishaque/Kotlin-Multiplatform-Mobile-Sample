package ndk.banee.kotlin_multi_platform_mobile_sample

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}