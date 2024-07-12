# APPIUM INSTALLATION DOCUMENT

**(MOBILE AUTOMATION)**

**Pre-Requisite to install the APPIUM: -**

**\[Before download and install APPIUM in windows, please make sure bellow given prerequisites are fulfilled.\]**

- **JDK Installed.**
- **Android SDK Installed.**
- **Set ANDROID_HOME and Path Environment Variables.**
- **Eclipse/ IntelliJ Installed.**
- **Node JS and npm Installed.**

- # Download Java Development Kit

Follow the steps given below to download the latest version of JDK –

1. Open this link – <https://www.oracle.com/java/technologies/downloads/>
2. Scroll down a bit and then select Java 17, and then Windows

- ![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/17d5cb77-1450-4d07-884f-a5280cc78047)

1. Click on .exe link

JDK should successfully download to your machine.

# Install Java Development Kit (JDK)
Given below are the steps that you can follow to install the latest version of JDK on your machine –

1. Navigate to the folder where you had downloaded JDK. Double click on the exe file to start the installation process

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/a7e6bc42-1857-4e6a-98e2-6a8b5e41e175)

1. The installation process would now begin. Click on Next button on the Setup screen

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/63cae235-c275-443a-8ab5-3cf37ec9701f)

1. Wait for a few seconds for Java to install some files. After that, it will ask you to specify the destination folder for JDK. Leave the default location as it is and click on Next button

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/c08a1883-2fd3-4ad6-888c-85d84b1d3add)

1. JDK installation would now begin
2. Once the installation is completed, you will see the window as shown in the screenshot below. Click on Close button to close the window

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/58415621-4eff-48fa-a7fa-f80fd9a100e6)

1. To verify that the installation is successful, open Java folder in Program files. You would see that a new JDK folder with the latest version numbers has been created.

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/25268894-b6f2-43a3-a176-03d21a2bd578)

# Setup Java Environment Variables

1. As the first step, please copy the folder location where the latest version of JDK is installed, we had installed JDK at the default location (**C:\\Program Files\\Java**). If you have also done the same, then open that location

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/e0c8c6f1-10d5-4441-8871-e619162f260e)

1. You have to open the environment variables window in your machine. To do this, click on **the Search icon** and then type **environment variables** in the search bar. Click on **Edit the system environment variables** option to open it

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/f3ab8c64-24bd-41ab-bda9-ef4033d9068b)

1. This would open the System Properties window as shown below. Now from the **Advanced Tab**, click on **Environment Variables** button

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/7c188bc3-0845-468f-b540-efd27c69b8f6)

From the Environment Variables window, click on **New button** from

**System variables** section

![Add new value (JAVA_HOME) in System Variables]

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/057c506d-a0a4-47dd-8cb1-b28f5c257162)


1. Enter **JAVA_HOME** in Variable Name field and JDK folder location (**C:\\Program Files\\Java\\jdk-17**) in Variable value field as shown in below image. Please enter the correct folder location that you have in your machine

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/9f4c439c-815e-49a7-baf4-6f249870fc0a)

1. Click on the OK button. You will see that JAVA_HOME variable has now been added in System Variables.

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/1f69cc8f-257e-49f0-818b-9697022b18b1)


If you already have JAVA_HOME previously set, then you can click on Edit button to modify its value.

# Setup Path variable

Path variable refers to the location of the bin folder inside the JDK folder.

Let’s see the steps to do this –

1. Open your latest JDK folder and check that it has bin folder in it
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/6543c907-389c-40e8-8fa2-cffebd79ed7e)

1. Now open this bin folder and copy the entire folder location. For us, this folder location is – **C:\\Program Files\\Java\\jdk-17\\bin**

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/15163603-a7d9-4ac8-9fdd-90e07ce286b6)

1. Since the JDK folder location is already represented by JAVA_HOME variable, so we can replace the location of JDK folder with JAVA_HOME like this – **%JAVA_HOME%\\bin**

2. In the Environment variables window, check that there is a variable called Path under System variables. Please note that Path is an existing
variable, and we would edit it to add the bin folder location

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/2c57472b-411c-4812-ba75-1b0e7d5b3fb0)

1. Select the Path variable and click on the Edit button. **Edit environment variable** window would be opened
2. Click on the New button. A new line is highlighted in the window. Add JDK bin path **%JAVA_HOME%\\bin** as shown in the below image

![Add bin folder location to PATH variable]

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/0c1cd847-e0e3-4788-951a-ebbf851219b7)

1. Click on the Ok button. bin folder location is now added in the Path variable
2. Close the Environment variable window by clicking on the Ok button. With this, we have now successfully setup Path variable as well

# Verify that JAVA_HOME and Path variables are set correctly

After you have added JAVA_HOME and Path variables, it’s time to check if
the variables are set correctly. Follow the steps given below to check this –
1. Open command prompt
2. Run the command **javac -version**. This should show the javac version number. Verify that this version number is same as the latest JDK version (from JDK folder name). You can also run the command **where javac**. This command should show the JDK bin folder location. This should be the same folder location that you had set in the Path variable

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/eb40751f-7577-42af-a5c2-11eccf1c0b53)

                  **Android Studio installation and setup:**

                    #### Prerequisites to installing Android SDK tools
                    
Before you download and install Android, make sure that you complete the below given prerequisites –

- - You should have [downloaded and installed Java (JDK)](https://www.automationtestinghub.com/download-and-install-java/) and [set up](https://www.automationtestinghub.com/setup-java-environment-variables/) [Java environment variables](https://www.automationtestinghub.com/setup-java-environment-variables/)

# Download Android Studio Bundle

Follow the steps given below to download Android Studio –       

1. Open Android Studio download link – <https://developer.android.com/studio/index.html>. You will see **Download Android Studio Electric Eel** button as shown below

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/77f86c21-b05c-4d3a-849b-3d0931587c51)

1. Click on **the Download Android Studio Electric Eel** button. You will see the **Terms and Conditions** popup
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/5113e092-c7b8-4229-b12b-3bd8e3d3441d)

###### Important Note: Please make sure that you always install the latest version of Android Studio and SDK tools. With the older versions, there has been a change in the way you open SDK Manager and some other tools. And this might result in some confusion in the way you use these tools

1. Scroll down to the bottom, then select the checkbox and click on **Download Android Studio Electric Eel** button. The download process would now begin. Click on Save File to download the .exe file to your machine

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/5b6193b7-6198-423a-a50a-2ed7fdeb3181)

1. Android Studio will be downloaded to your machine

2. ![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/4f2ade08-fa8e-416a-bffa-c896e3ae9b0f)


This completes our Android Studio download process. Let us now install Android Studio and the SDK tools.

# Install Android Studio and SDK tools

Follow the below steps to install Android Studio and other SDK tools –
1. Double click on the downloaded exe file. Android Studio Setup Welcome Screen would be displayed, as shown below (sometimes it might take a minute or so for the below screen to load when you try it the first time)

2. ![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/88082ddd-8457-4d74-84af-69d8b4dc23a5)


3. 1. Click on the Next button. You will see the Choose Components screen. On this screen, **let both check boxes remain selected.** You would observe that Android SDK (which you need for Appium Scripts) is not displayed here. But once you install Android Studio and open it for the first time then

![Android Studio Setup - Choose Components]

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/e4aeb1ce-757d-4661-96d6-fa48f1dce112)


1. Click on the Next button. You will now be taken to the License Agreement screen
2. ![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/625e528a-8c68-457a-889f-e4a72b4b1671)

1. Click on **I Agree** on the License Agreement screen. You will now see the Configuration Settings screen. Let the default installation location remain the same.

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/077c8bdc-904b-42d6-a483-a8067b3ce1bf)
1. Click on the Next button. You will be taken to the Choose Start Menu Folder screen
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/5f777f5f-3176-414a-a362-5e39955095eb)
1. Click on the Install button to start the installation process.

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/bb3f214f-132e-4296-a932-71062ccab2bf)


1. Once the installation is complete, you will see the Installation Complete window as shown below

![Android Studio Setup - Installation Complete]

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/0bb6adf1-cb5d-4686-82a5-92a47acfb7a4)

1. Click on the Next button. You will see **Completing Android Studio Setup** screen. Uncheck Start Android Studio checkbox and then click on Finish button to close the screen.

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/96de0603-d10f-4d92-9ed1-581bc644b5f8)

![Completing Android Studio Setup - Finish Installation]
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/4f4c55cf-1d4f-4af4-b10f-09cef8f42b89)

  #### Select the latest Android version under SDK Manager

  
Once your Android Studio is opened, go to **Tools > SDK Manager** (in older versions of Android Studio, this option was **Tools > Android > SDK Manager**)

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/0c94a3e1-4f51-4392-8e48-44f4d54d147f)

###### If you don’t see SDK Manager option in Tools menu, then please wait for a couple of minutes. Android Studio takes some time to setup all the necessary components when you open it for the first time. After 2-3 minutes you would start seeing this Android option in the Tools menu

Once you select SDK Manager option, Settings screen would be opened with **Android SDK** option selected by default, as shown in the below image. Also, please note that there are 3 main tabs in this screen – **SDK Platform, SDK Tools and SDK Update Sites**. We will be checking only the first two tabs – SDK Platform and SDK Tools

![Default Settings - Android SDK option selected]

In **SDK Platform** tab, check that the latest version of Android is installed. Even if it shows Partially Available or Update available, then its ok for now

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/671a4531-89a6-478e-ac2b-c2f47bf96ee4)

Click on OK button

# Setup Android Environment Variables

#### Find the folder location where you installed Android SDK

In the first step we will try to find the folder path where we have installed Android SDK –
1. The default folder location where Android SDK is installed is – **C:\\Users\\Anish\\AppData\\Local\\Android\\sdk**. Please open this folder path and see if you have Android SDK folder in there with contents as shown below

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/f1bbabb2-ae58-47e1-8801-cd9e6be5a3c6)

###### Please note that if you try to open this folder location by going to each folder one by one (i.e. C > Users > YourUserName and so on…), then you might not see the App Data folder as it's a hidden folder. So, you will have to make hidden folders visible first

1. Copy the SDK folder location once you find it. For us, this folder location is – C:\\Users\\Anish\\AppData\\Local\\Android\\sdk

# Setup Android Environment Variables

Follow the steps given below to setup ANDROID_HOME environment variable –
1. Click on the Start menu. Then right click on Computer and select Properties option

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/229f4099-c13f-4175-8d70-11962ff09138)

1. This would open the **System Properties** window as shown below. Now from the **Advanced** Tab, click on **Environment Variables** button

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/0f2e8e8a-65cb-4659-9340-2fff12967cb2)

1. From the Environment Variables window, click on **New** button from

**System variables** section

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/96eefaf7-16a3-4c36-b517-b16f81b7d348)

1. Enter **ANDROID_HOME** in Variable Name field and SDK folder location (**C:\\Users\\Anish\\AppData\\Local\\Android\\sdk**) in Variable value field as shown in below image (Please enter the correct folder location that you have in your machine)

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/c25297b7-ba01-4fde-969f-9c2170a5a245)

1. Click on the OK button. **ANDROID_HOME** variable will now be added to System variables

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/af0b7e00-8a46-4822-871d-a7b7920ac767)

With this, we have successfully added ANDROID_HOME variable. Let us see how to add the Path variable.

        # Folder locations to be added to Path variable
In the Android SDK folder, there are three specific folders that you need to add to the Path variable. These folders are –

- - **platforms-tools** folder which has path –

##### C:\\Users\\Anish\\AppData\\Local\\Android\\sdk\\platform-tools

- - **tools** folder which has path –

##### C:\\Users\\Anish\\AppData\\Local\\Android\\sdk\\tools
- - **bin folder inside tools** folder with path –
  - ![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/6f6425d4-2d44-471d-997f-7cc052b961f9)


##### ![Folders to be added to Path variable]
Since we have already added ANDROID_HOME in System variables and it's represented by – C:\\Users\\Anish\\AppData\\Local\\Android\\sdk, hence all these above three folder locations can be written as –

##### %ANDROID_HOME%\\platform-tools

- - **%ANDROID_HOME%\\tools**

##### %ANDROID_HOME%\\tools\\bin

Let us now add all these three folder locations in Path variable.

# Setup Path Variable

Follow the steps given below to setup Path variable –
1. In the Environment variables window, check that there is a variable called Path under System variables

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/accf05c1-9298-4071-b5ff-5fdc7b790f10)

1. Select the Path variable and click on Edit button. Path variable window would be opened
2. Move over to the end in the Variable value text field. Put a semicolon (;) at the end and start adding all the 3 folder paths separated by semicolon (Semicolon acts as a delimiter between different folder locations added in the Path variable). You should have added all the 3 folder locations as this

##### –;%ANDROID_HOME%\\platform-tools; %ANDROID_HOME%\\tools

**%ANDROID_HOME%\\tools\\bin**

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/29e7721b-cad2-45b2-9cc9-303a6635d427)

1. Click on the OK button. All the three variables would now be added to the Path variables.
2. Close the Environment variable window by clicking on the Ok button. With this, we have now successfully setup Path variable as well


# Verify that Android Environment Variables have been set correctly
To verify that all the Android Environment Variables are correctly setup, open command prompt and run this command: **sdkmanager – -list (please note that there should be no space between the 2 hyphens, as shown in the below image)**. This would list down all the installed and available packages which would look a bit like something as shown below (please wait for 3-5 seconds for the list to be displayed)

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/54311721-0963-416e-8a20-eebb33fb095d)


                            # Appium tool setup

This mainly involves downloading and installing Appium Desktop, setting up an Appium project IntelliJ, adding all the Appium related dependencies and setting up your mobile device for test automation.

# Download and Install – Node.js and NPM

#### Steps to Download Node.js

Follow the steps given below to download Node.js –
Step 1) Open Node.js website using this link – <https://nodejs.org/en>
Step 2) Click on the LTS button. This is the latest, most stable and supported version of Node.js

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/8958bf51-33d6-43bb-b525-f0f3fc44b5b1)

Step 3) Node.js will be downloaded to your machine
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/18f03605-e38f-4f38-a9ae-1ad3046f56f2)

# Steps to Install Node.js

Step 1) Open the .msi file that you downloaded in the previous step to start the installation process
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/aafaac54-e426-411b-b619-372b628f48e7)

Step 2) Click on Next button, accept the License Agreement, leave the default values Destination Folder and Custom Setup screens

Step 3) Leave the checkbox unchecked in Tools for Native Modules screen and click on Next button
Step 4) Click on Install button to start the installation

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/a43ac6d5-a419-4fa4-adbb-235aa21f45e0)

Step 5) Click on Finish button to exit the setup wizard
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/5973e445-8d5f-4488-aec4-fe12294d5eb1)

The npm comes preinstalled with Node.js. So, to verify that both Node.js and npm have been setup correctly, open command prompt and run these commands: **node -v** and **npm -v**
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/cb9eb221-0f64-4857-842e-4dd383b502ae)

                # Eclipse IDE – Download and Install
### Download Eclipse IDE
Perform the steps given below to download the latest version of Eclipse IDE
1. Open this link – <https://www.eclipse.org/downloads/packages/>
2. This link lists the latest Eclipse IDE versions for different programming languages. We are interested in **Eclipse IDE for Enterprise Java and Web Developers**
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/0be0291b-854d-4520-a768-0a4b2baefa4f)
4. 
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/ae3bfa86-a971-42ac-8540-2229d1bf4f17)

5. Once you click on the link, you will be navigated to the download page as shown below. Click on the Download button to start the download process.
6. ![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/71fb088c-c0c6-40b6-97f9-5b72a1e60663)


1. Eclipse IDE would start downloading.

2. With this, we complete the process of downloading Eclipse IDE for Java.
Let’s now have a look at how to set it up.


             ### Install/Setup Eclipse IDE

Unlike a lot of software tools, Eclipse doesn’t need to be installed. Once

you unzip it, you can start using it directly. Let us see how this is done –
1. Go to the folder where you had downloaded Eclipse and locate the Eclipse zip file
1. Right click on the Zip file and unzip it.
2. 2. After unzipping the zip file, you will get **eclipse** folder. Open this eclipse folder, it would have contents similar to what is shown in the below image

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/3ed428b9-d050-4069-9464-76fa6698c573)

1. Double click on eclipse.exe file to open the IDE. Once it starts, it would ask you to select a workspace directory. **In eclipse, workspace is the directory where all your projects would be saved.**

1. Leave the default folder path as it is and click on the Launch button. Eclipse would open the IDE and you would see the Welcome tab as shown below

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/f480eee8-e61a-4e68-bcc8-a7b91f133a6a)

                     # Enable USB Debugging on Android Phone
Enabling USB Debugging on your android device is a two-step process:
1. Firstly, get the Developer options on your phone
2. Then, use Developer options to enable USB Debugging Let's look at each of these steps in more detail.
### Get the Developer Options on your phone
**Step 1:** Take your Android device -> go to Menu/Home -> search for the Icon named **“Settings”**
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/e91a13d9-37f8-4def-82ae-1d9d5b303b97)

**Step 2:** Click on the “Settings” Icon and scroll down and check for an option named **“Developer options”**. If you can see “Developer options” listed there, it means Developer options is already enabled on your Android device.
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/3a4d8ed4-3030-43ce-9d5c-b1911124c233)

On the other hand, if you do not find the “Developer options” listed there,
then please follow the below procedure to enable it –
**Step 3:** Click on the **“About phone”** option, you can see the list of options as shown in the below image
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/c4a21bbe-1daf-4a1e-895b-683e1aa20933)

**Step 4:** Click the **“Build Number”** option multiple times, till one of these messages appear –
##### “You are now 1 step away from being a developer”
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/82c8b8c0-0ce4-4a9b-9a9d-53648340b0b6)


After this, click on “Build Number” couple of more times until you finally
see the below message –
##### “You are a Developer now” or “Developer mode has been enabled”
(To be precise – It is **5** clicks on some devices and **7** clicks on others)

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/47cf9310-f0b2-4c8c-acdf-1c7209d396fa)
**Step 5:** Tap the back button on your device to verify the “Developer options” is listed under the settings

So now you can see the “Developer options” enabled on your device. Let us now see how to enable the USB debugging option on your android device.

**Enable USB Debugging option on your phone**
By default, the USB debugging mode is disabled for any brand-new device to avoid unintentional modifications on it. But you would need to enable debugging option manually for your Android development/testing process.

So now, let's see how to enable the USB debugging mode by following the steps given below:
**Step 1:** Go to the “Settings” option of your phone and verify again, if you can see the “Developer options” listed under the “Settings” section as shown below

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/f93a5268-386c-498b-ba7c-60047396cf20)

**Step 2:** Click the “Developer options” and check if **“USB Debugging”**
checkbox is listed under the sub-title **“Debugging”** as shown below:
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/5116d5e4-97d1-4234-8490-bc7817cd8cc7)

**Step 3:** Tick the **“USB Debugging”** checkbox and click **“OK”** in the popup message. You can see that “USB Debugging” has been enabled now as shown in the below image:

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/1260bef0-3ad2-46f1-94ca-880352406aeb)

                # Appium Desktop – Download and Install
#### Download Appium Desktop
Follow the steps given below to download the latest version of Appium Desktop –
1. Open Appium Desktop’s GitHub page –
<https://github.com/appium/appium-desktop/releases>
1. This page lists all the versions of Appium Desktop. You will have to download the latest version which is shown at the top of the page.
**Please Note:** New beta versions are released often. Even if you see a newer version on Github, please go ahead and download that version.

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/eabfec53-3088-479a-8089-392053090ad2)

1. In the Downloads section of the latest release, you will find different packages for Windows, Mac, Linux etc
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/0330a36e-b13c-4d1f-a406-8c654de88501)

1. Click on the windows version to download and save it on your machine
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/dd47bbd3-2ebd-402d-90d1-9344bc78d5f3)
With this, we complete the download process for Appium Server GUI. Let us now install it on our machine.

                    ### Install Appium Desktop (Appium Server GUI)
Use the steps given below to install Appium Server GUI on your machine
1. Open the folder location where you have downloaded Appium Server GUI and double click on the exe to start the installation process
2. Appium will first ask you Installation Options. Leave the already selected option as it is and then click on Install button

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/c5cd98f9-2c35-467e-8ffb-2c9c0868a13b)

1. Once the installation process starts, you will see the Appium Setup window as displayed below
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/57476e2f-0c71-47fc-afcf-c08faabeb57d)
1. Once installation is complete, you will see the below Appium Setup window

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/e3c296ec-e905-4672-a550-a03cd64f9c82)

1. Now, leave the **Run Appium Server GUI** checkbox selected and click on
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/156bf8ee-c542-42b4-bb46-e79ec02800af)

**Appium server requires a minimum of 2 parameters to run – Host and Port.** The default values for these parameters are “0.0.0.0” (for Host) and “4723” (for Port). So, if you don’t provide any specific values for these parameters, Appium would take the default ones to start the server.

1. To verify that the installation and setup is successful, click on **the start Server** button. This would start the Appium server, and you would see **‘The server is running’** message in Appium window

2. ![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/88ff5933-6707-47b7-9c2e-ba571047eb5b)

This shows that the Appium Desktop has been installed successfully.
1. Click on Stop Server button (3rd button with pause icon) to stop the Appium server and then **Close Log** button (one with X icon) to close the Appium server, you can close the Appium Server GUI window.

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/c082f2c6-bf79-4892-aceb-cbbba0db3127)

            # Appium Inspector – Download and Install
             #### Download Appium Inspector
Follow the steps given below to download the latest version of Appium Desktop Inspector –

             1. Click on this link to open [Appium Inspector Github Releases page](https://github.com/appium/appium-inspector/releases)On this GitHub page, you will be able to see the latest release details
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/ff5f15e4-0235-4ecd-910d-c0f4dc9f1d9a)


1. Under Assets section, click on windows exe file to download and save it on your machine
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/cd647d5b-5765-485c-8db9-faf8c24d2546)

With this, we complete the download process for Appium Inspector. Let us now install it on our machine.
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/9da76337-67b8-4ab5-b4e9-14391a1ce822)


                    **Install Appium Inspector**
Follow the steps given below to install this tool on your machine –
1. Open the folder location where you have downloaded the inspector tool and double click on the exe to start the installation process
2. Appium will first ask you Installation Options. Leave the already selected option as it is and then click on Install button

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/e885565d-eba3-414a-a5d0-49549bf28e4e)
1. Once the installation process starts, you will see the Appium Setup window as displayed below

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/7bb7f78a-f2d5-4d6d-afe7-aea19681d3a5)

1. When the installation is completed, you will see the installation completed screen as shown below
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/60fc6788-25de-4303-a75e-692407685c42)

1. Now, leave the **Run Appium Inspector** option checked and then click on the Finish button. Appium GUI window would look like this

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/c57768bb-e49a-45b4-8c51-a39915ddb5ca)

# Appium Inspector Steps to get started

Inspecting your mobile app and starting to identify elements is a multi- step process. You would need to do the following tasks to get rolling –

- - Start Appium Server
    - Open Appium Inspector and provide Desired Capabilities of your mobile device and app
    - Start New Session (i.e., Start Appium Inspector)
    - Inspect elements on your mobile app
   
### Start Appium Server
Click on **the start Server** button. This would start the Appium server, and you would see **‘The server is running’** message in Appium window
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/8427a0a6-5805-43b6-aa9d-c0671315674c)

### Open Appium Inspector and provide server details
1. Go to Windows -> Start, search for **Appium Inspector** and then open it

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/aa3fee0d-4249-4b77-9f42-10954826e7fe)

1. Appium Inspector start screen would be opened as shown in the below image
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/5a1dd18f-02f4-4af8-ab59-6ab9cef1855d)

1. You would notice that Remote Host is already defaulted to 127.0.0.1, and Remote Port is also set to 4723 by default. Remote Path also has / as the default greyed out value.

2. ![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/c29a8fd7-13b9-4242-a25c-181ea74cd3ad)

            # Get your Mobile Phone’s Device ID
1. Connect your mobile device to your computer using a USB cable. (If your mobile device shows a popup to allow debugging, then accept that popup)
2. Now open command prompt and run this command: **adb devices**
3. Once you run this command, you will see the details of the device as shown in the below image (if you see some other response such as “daemon not running. daemon started successfully”, then run the command again)
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/db1250c0-cf2f-4f26-bdd0-73fc13bdd8eb)


              **Ways to find appPackage and appActivity name of your App**
### Method 1: Using ‘mCurrentFocus’ or ‘mFocusedApp’
**in Command Prompt**
**Step 1:** Unlock your mobile device and connect it to your computer using USB cable
**Step 2:** Open Command Prompt and run **‘adb devices’** command. We are running this command to just make sure that your mobile is properly connected.
**Step 3:** Once you run **‘adb devices’** command, you should see that it displays the list of attached devices as shown in the below image (the actual device name that you see would be different based on what mobile phone you use) –
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/c38bffec-80ff-4b29-b9e4-e9cad34ade2d)

**Step 4:** Run **‘adb shell’** command. After running this command, the command prompt should look something like this –
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/1c321f0c-729b-4703-92ab-4bf9fc1ce903)

**Step 5: Now on your mobile phone, open the app for which you want to find the appPackage and appActivity.** 
*Step 6:** Now run this command: dumpsyswindowdisplays|grep-E ‘mCurrentFocus’

**Step 7:** The above command would display the details of the app which is currently in focus. From that, you can figure out the appPackage and appActivity name as per the below image –

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/2750bb03-364f-4553-80c7-7e9dee077e97)
appPackage starts with com. and ends before backslash (/). So, from the above image, appPackage name is – **com.android.vending**

appActivity starts after the backslash (/) and goes till the end. From the above image, appActivity name is – **com.android.vending.AssetBrowserActivity**

**Step 8:** There is one more similar command that provides the appPackage and appActivity name. This command adds some additional details before and after the package name & activity name, but you can still try it out just to verify that the results from the above command are the same. This command is – dumpsys window displays | grep -E ‘mFocusedApp’ and the output of this command is shown below –

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/eb5e5104-3494-432f-923f-7c69fee95474)

In this example, where we used mFocusedApp, appActivity name is shown as a relative name, i.e., it doesn’t start with com. In such cases, you would need to add com…. at the beginning to get the complete activity name. So,

in our case, complete activity name for **.AssetBrowserActivity** would be **com.android.vending.AssetBrowserActivity**

                               ### Provide Appium Inspector Desired Capabilities
Once you have added Appium Server details, the next step is to add the Desired Capabilities. Desired Capabilities are keys and values encoded in a JSON object and are sent by Appium Inspector to the server when you request a new automation session.

Note: If someone is working on the same project then they can use these capabilities, they just need to copy and paste the capabilities under JSON representation and save it. Here, Android version and Device name, you have to give based on your testing devices.

{

"platformName": "android", 
"appium:platformVersion": 12,
"appium:deviceName": "RZ8N810NC1K",
"appium:appPackage": "org.sunbird.app.staging",
"appium:appActivity": "org.sunbird.app.MainActivity"

}

For the new project, they have to follow the below steps to add the capabilities to Appium Inspector
You will have to add each of these capabilities to Appium Inspector. Follow the steps given below to do this –
1. To add the first capability, type **‘udid’** in Name field and **‘ENUL630010’**
2. in Value field. Your screen would now look like this (note that the JSON
Representation block would automatically show the capability that you have added just now)

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/0e212587-643f-4985-a496-591eaff514e4)


[Add new blank row by clicking on plus button]
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/e7825c8a-e1bc-4a66-b566-6671ba00d3cf)

2. Add the second capability (**appium:appPackage**) in this row
3. Keep on adding new rows till you add all the capabilities and your screen should now look like this

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/ab4cde27-39eb-4903-a5b3-a98b8a10277a)
You have now successfully added all the Desired Capabilities. Let us now save this Capability Set and then start the Appium Desktop Inspector.


### Save the Desired Capabilities Set

It’s a good approach to save the Desired Capabilities set especially when you are using multiple devices or testing multiple apps. This is because once you save a Desired Capability set, then you can directly select it from the **Saved Capabilities Set** section and start the inspector. So, if you use multiple devices or android versions, you can save these capabilities as say ‘Samsung Galaxy S7’, ‘Nexus 6P’, ‘Calculator App’ etc.

Let’s quickly see the steps that you must follow to save the Desired

Capabilities –

1. At the bottom of the screen, where you entered all the Desired

Capabilities, click on ‘Save As…’ button

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/b55374b5-da38-46bc-bf97-b6fc049b0ab7)

2. Enter any name you wish to use and click on the Save button. The capability set would get saved
3. Click on **Saved Capabilities Sets** tab and then click on edit icon. You will see that the capability set you saved just now is displayed here

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/9c643f23-3c84-43e5-bcd7-56978c77319d)

                 ### Start Appium Inspector

First, make sure that your mobile device is connected to your machine. Also see that it's unlocked. To start Appium Desktop Inspector, click on **the Start Session** button.

Once you click on the button, you will see that the screen starts getting refreshed. Then after a few moments, Appium window would display the

screenshot of app together with its Object Hierarchy Dump. The Appium window screen would like this –

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/d44d2009-7816-4418-9006-b29516c3f8e6)


# Appium Test Script to Launch App on Real Device

Steps to follow to launch App on real device:

- Open IntelliJ in your system
- Connect mobile device with your laptop via USB
- Appium test script should be added into IntelliJ
- Run your test script and check that it launches the app

1. Open the IntelliJ
2. Select the Test folder under src(expand it)

3. ![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/75e3ae8a-bd95-436a-adfe-6d3ea2b30738)

4. 1. Expand the ‘test’ and then again expand the ‘com.qualitrix.com’
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/28ca19e8-ef24-4fe6-8b21-d9515b510872)
1. Select ‘UserOnboardingSaniy’ component and double click

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/2f69c233-c8f8-4b0b-981d-9f7fa412b8c2)
\[Note: Here you can select one test script, otherwise you can run all scripts of sanity component at once\]
Here, we will see how to run all scripts of Sanity component:

Click on ‘**Suiteinventory**’ and expand it and then click on ‘**Smoke_test.xml**’
![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/8ef62ff9-22e1-4db0-aed3-d740f206d316)
Once you open the Smoke_test.xml file, you scroll to the bottom and give this class name
&lt;
class name="com.qualitrrix.test.UserOnBoardingSanity"t; And then right click on the same screen and click on the Run option

![image](https://github.com/Sunbird-Ed/Sunbrid-Mobile-UI-Automation/assets/43565430/b235f58b-688c-436e-b8ef-47115ca2af55)

\[Note: You can give the same class name, where you have kept your script\]

Your script would start running and you would see that app would get launched on your mobile device. This entire process might take 10-15 seconds because Appium must connect to your mobile device first.

