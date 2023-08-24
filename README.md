# Material3 Image Browser

An android app that allows browsing images with help of UnsplashAPI.

## Requirements

The project is build with Java 17, so you'll need to install JVM17.
When you're ready add the UnsplashAPI key to local.properties this way:

```
imagebrowser.unsplashapi=ACCESS_KEY_HERE
```

Note: Send me a message so I'll share my access key if it helps.

## Note

You can browse the images, click on them to see more informations and then in the detail screen you
can click the user name to see the user's image

## About the app

The app is build with MVVM (Localised version of MVI, but it's still MVVM) and is multimodular. This
allows to keep the code clean and easier to test.
I also added Gradle Convention Plugins (gradle/build-logic) to make it easier to manage gradle build
files. The configuration cache and build cache are enabled

- :app - The main application module
- :feature:search - The search view module (android library)
- :feature:detail - The detail view module (android library)
- :common-ui - The module to share ui elements (android library)
- :data - datasource and repository (jvm library)
- :core - core models (jvm library)

The app follows the clean architecture, but not everything was implemented because of the deadline:

1) The SearchViewModel is tested, but I didn't write the tests for the DetailViewModel, because it
   would look the same.
2) The app doesn't have it's own back button so the user needs to use the native one.
3) There's only one screenshot test, to show it works.
4) I didn't write AndroidTests because of the deadline. However the ui interactions are passed down
   to the viewmodel and it's all unit tested.
5) I didn't add paging libary to see all images to the view is limited to 10 images.

## Dependencies

There are different libraries used to support the development process:

* Coil - Image loading Library
* Mockito - to help with unit tests
* Ktor - library for http requests
* Paparazzi - for screenshot tests (just a poc, because there's not many components)
* Accompanist - for permissions check


