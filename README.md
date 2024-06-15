# ShareLibrary
ShareLibrary for my personal learning and test environment on jenkins

## **Vars**
All the content in this folder will be concider global for jenkins, here is where we are going to put the custom steps.
The files here that represent the step will be `.groovy` although they are not technically groovy they need to have that extension. We can have `.txt` files here that will act as the help from those file.

## Call the library

To call the library we use

```groovy
@Library('my-shared-library')
```