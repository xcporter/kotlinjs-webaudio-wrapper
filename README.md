# Kotlin JS Web Audio API wrapper

Basic external function and type definitions

Mirrors the js api defined in the following locations:
- https://github.com/WebAudio/web-audio-api
- https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API

## Use in your project: 

- First include the jitpack repository

```
repositories {
    maven { url 'https://jitpack.io' }
}
```

- Then include this project as a dependency:

**Groovy**

```
dependencies {
    implementation "com.github.xcporter:kotlinjs-webaudio-wrapper:1.0.1"
}
```

**Kotlin**

```
dependencies {
    implementation("com.github.xcporter:kotlinjs-webaudio-wrapper:1.0.1")
}
```