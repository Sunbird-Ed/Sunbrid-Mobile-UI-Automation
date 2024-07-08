# MobileUIAutomation
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

