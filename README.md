# Fake Player API

A small library to create Fake Players which also implements dummy packet handlers to avoid crashes and other stuff. yea

## Using Fake Player API

You can add the library by inserting the following in your `build.gradle` :

```gradle
repositories {
    maven {
        url = 'https://maven.cafeteria.dev'
        content {
            includeGroup 'dev.cafeteria'
        }
    }
}

dependencies {
    modImplementation "dev.cafeteria:fake-player-api:x.y.z"
    include "dev.cafeteria:fake-player-api:x.y.z"
}
```
