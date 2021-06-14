# OmegaT MachineTranslator plugin demo project


This source code and documentation should serve as a reference for anyone interested in creating a plugin for OmegaT. 
Refer to the 'Creating a OmegaT Plugin.odt' document on how to create a plugin for OmegaT.

## Build system

This skeleton use a Gradle build system as same as OmegaT version 4.3.0 and later.

## Dependency

OmegaT and dependencies are located on remote maven repositories.
It is necessary to connect the internet to compile your project.

## Where is a built artifact?

You can find distribution files in `build/distributions/*.zip`.
Also you can find jar files at `build/libs/`

## Github actions

There is an example script to use Github Actions for CI/CD.


## Installation

You can get a plugin jar file from zip distribution file.
OmegaT plugin should be placed in `$HOME/.omegat/plugin` or `C:\Program Files\OmegaT\plugin`
depending on your operating system.

## License

This project is distributed under the GNU general public license version 3 or later.
