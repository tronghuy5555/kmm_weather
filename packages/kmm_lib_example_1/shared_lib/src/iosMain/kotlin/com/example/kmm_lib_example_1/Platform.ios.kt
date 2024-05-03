package com.example.kmm_lib_example_1

import platform.UIKit.UIDevice

class IOSSharedLibPlatform: SharedLibPlatform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getSharedLibPlatform(): SharedLibPlatform = IOSSharedLibPlatform()