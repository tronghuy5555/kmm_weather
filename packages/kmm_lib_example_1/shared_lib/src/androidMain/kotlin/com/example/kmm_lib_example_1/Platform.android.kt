package com.example.kmm_lib_example_1

class AndroidSharedLibPlatform : SharedLibPlatform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getSharedLibPlatform(): SharedLibPlatform = AndroidSharedLibPlatform()