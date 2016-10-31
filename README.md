# MinecraftMod

---

## About

Minecraft mod made with [Forge](https://files.minecraftforge.net/)

## Installation

1. Install Minecraft
2. Install [Minecraft Forge](https://files.minecraftforge.net/)
3. Install [Java SE JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
4. Set JAVA_HOME environment variable to installation folder e.g. C:\Program Files\Java\jre1.8.0_111
5. Install [Eclipse](https://eclipse.org/downloads/eclipse-packages/)

###Windows

	$ cd C:\Minecraft\ForgeModding
	$ git clone https://github.com/howprice/MinecraftMod
	$ gradlew setupDecompWorkspace
	$ gradlew eclipse
	
1. Open Eclipse with workspace C:\Minecraft\ForgeModding\workspace
2. Close the Welcome screen
3. File->Import... Gradle->Gradle Project->Next  Project root directory = C:\Minecraft\MinecraftMod Next->Next->Finish->Overwrite
4. Right-click on JRE System Library -> Properties and set Execution Environment to match JDK version e.g. JavaSE-1.8 (jre1.8.0_111)

## Running in Eclipse

Run->Run Configurations... Java Application -> MinecraftMod_Client -> Run

Minecraft should start up.

Click on the Mods button and the "Example mod" should be there. Note: the version number will probably show as "$version", but will be fine when run in game.

## Running in Minecraft

Open command window:

	$ cd C:\Minecraft\ForgeModding\MinecraftMod
	$ gradlew build

1. Copy C:\Minecraft\ForgeModding\MinecraftMod\build\libs\examplemod-0.1.jar into %appdata%\.minecraft\mods\
2. Start Minecraft -> Edit Profile
  1. Use version of Forge installed e.g. release 1.10.2-forge1.10.2-12.18.2.2114
  2. Launcher visibility: Keep the launcher open
  3. Save Profile
3. Play
  1. Mod button
    * Example Mod should be there with correct version number as specified in C:\Minecraft\ForgeModding\MinecraftMod\build.gradle 

## Links

[TEXTCRAFT](https://textcraft.net/) For making logos
