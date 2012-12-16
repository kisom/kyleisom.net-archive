ARDUINO LIBRARY FOR PARALLAX PING)))
Written by Kyle Isom <isomk@kyleisom.net>

Version 1.0
2010 FEB 16 1709 MST

.:[ INTRO / HARDWARE INTERFACE ]:.
The PARALLAX Ping))) is an ultrasonic ranging sensor built by Parallax for their
BASIC STAMP microcontroller kit. It has a range of 2 centimeters to 3 meters.

The Ping))) is extremely easy to set up: wire ground and +5V to the appropriately
labeled pins on the sensor, and connect the SIG pin to a digital pin on the
arduino. 

.:[ USING THE LIBRARY ]:.
First, declare a instance:

    Ping URS0(pin);
    
where pin is the digital pin the sensor is connected to. If you have nothing
else connected to your arduino, you can connect 11 Ping))) sensors to the 
microcontroller.

The next step is to get the distance from the sensor. There are two functions
for this, one to return sensor data in centimeters and one to return sensor
data in inches:

    int distance = URS0.ping_cm();
    int distance = URS0.ping_in();

The returned number is the distance in centimeters or inches respectively.

It's that easy!


