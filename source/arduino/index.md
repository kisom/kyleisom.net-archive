Arduino Libraries
=================

Libraries are also available via 
[github](http://github.com/brokenlcd/Arduino-Libraries).

**Complete Libraries**
----------------------
* **[ThumbStick](lib/ThumbStick.zip)** 
\([ThumbStick Readme](doc/ThumbStick-Readme.txt)\) - 1092 bytes of code plus 
20 bytes per instance (on the ATmega168/328-based boards, you can have a max 
of 3 fully-functional ThumbSticks because of the limit of 6 analog pins)
* **[DS1307](lib/DS1307.zip)** 
\([DS1307 Readme](doc/DS1307-Readme.txt)\) - 1254 bytes of code with one 
instance (note that there can only be one DS1307 on the I2C bus as per the 
datasheet). Also a note for people new to the Arduino, this device uses the 
I2C bus, which requires the use of analog pins 4 and 5, meaning you can only
have up to four analog devices on the Arduino.
* **[Ping](lib/Ping.zip)** 
\([Ping Readme](doc/Ping-Readme.txt)\) - a library to easily use the 
Parallax Ping))) sensor in robotics / UAV projects. 520 bytes of code with 
one instance using an integer to store the pin in, plus 18 bytes per 
instance (also using an integer to store the pin).
* **[pushbutton](lib/pushbutton.zip)** 
\([pushbutton Readme](doc/pushbutton-Readme.txt)\) - 72 bytes including an 
integer for storing the pin used, 22 bytes per additional instance. 
Includes debouncing and uses internal resistor.


**Demo Sketches**
-----------------
**Warning**: these are usually thrown together quickly to very rapidly test 
code / libraries, and generally have minimal commenting. Read at your own 
risk.

* [LCD/ThumbStick interface to RTC](sketch/RTC_LCD.pde) (uses the ThumbStick
and DS1307 libraries). This file will compile to almost 12k of arduino of 
code. There are several two-dimensional char arrays to display things in a 
human-friendly manner, which use 278 bytes of RAM, a little over the quarter
of of the ATmega168's available RAM. This provides a user-friendly way to 
view the RTC's functions and to easily set and verify the date and time on 
the RTC. The code is not commented, one day I might get around to commenting
it.
* [I2C Scanner](sketch/I2C_scanner.pde). A modified version of Tod Kurt's 
I2C scanner, the source has a link to his site.
* [Ping Test](sketch/PingTest.pde). A very quick test to display the 
distance in centimeters from a Ping))) sensor triggered via pushbutton over 
a serial connection. Uses pushbutton and Ping libraries.


