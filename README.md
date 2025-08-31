# COP-3330C-Object-Oriented-Programming
My repository where I will be sharing project done at Valencia College in Spring 2025

**Name:** Kenji Nakanishi 
**Course:** COP 3330C Object Oriented Programming 
**CRN:** 26824



**Description of the project: **

I was taking the class back on January 2025, while learning concepts on inheritance, polymorphism, and interface were part of the theory. In this program since I am a big fan of the Toyota car model Prius, and I own two prii(term for plural) according to  the Toyota team after they did the survey on the plural term for prius in 2011, February 20. I will be using Prius car models to undetstand those learnt concepts. 

Also, Prius with its original settings and the Prius V which stands for versatility, This program will perform inheritance and polymorphism. Interface "Model" has been added and by utilizing implements and extends I was able to modify the desired performance in other class.
Prius mentioned that plural form of prius is prii 

Source: https://pressroom.toyota.com/toyota-announces-the-plural-of-prius/


**Concepts to keep in mind:**
It contains PARENT Class Prius where: added data types such as name, price, year, and acceleration information.


- Attribute delcared as Protected
- Customized methods:
  1) Age by Years: Which substract the car manufactured year by 2025,
  example: 2024 Toyota prius will be 2025 - 2024 = 1 year old car.


  2) Distnace: Calculate how far does it goes in 10 seconds.

an Interface model that contains two methods: 
  3) Variant: Displaying specific model information to the user
  
  4) MSRP: Give the user information on the initial pricing and year of launch
     MSRP stands for Manufacturer Suggested Retail Price


When it came to specific car model such as the Prius V and Prius C 
I did used extends which make them the CHILD classes. So, I added the @Override to make a specific output result.



**Tools used:**
- Java language
- IDE: JetBrain IntelliJ IDE
   
Expected input and outputs: 
The code will gather information from the instantiated objects with different values depending on the Year of the Prius and its model. 

Added an array **prii** after the research, then used a loop "for" to display result. 
It was pretty fun to add the car model text graphic to each output result:

**an example output is:**
***********************************PRIUS**********************************
    
    
         ______
        /|_||_\`.__
       (  o  o  o  )
        `-(_)--(_)-'

   
V model Information [name= Prius model V2 , price= 30935.0]


Prius model V2 was released in May of 2011 in Japan.


Prius model V2 had a original MSRP of $30935.0 dollars.


Your car is manufactured in 2016


This vehicle is 9 years old now.


This Version of prius can go up to 103.0 meters of distance in 10 seconds.


***********************************PRIUS**********************************


This is the UML diagram created for the class:

<img src="Kenji Nakanishi UML diagram Project 2..png" widtg="300" >

   
