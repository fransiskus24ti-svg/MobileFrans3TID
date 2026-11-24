plugins {
    alias(libs.plugins.android.application) apply false
    // Tambahkan baris di bawah ini:
    id("com.google.devtools.ksp") version "2.1.0-1.0.29" apply false
}