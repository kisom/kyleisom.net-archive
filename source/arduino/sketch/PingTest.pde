#include <pushbutton.h>
#include <Ping.h>

int pingPin = 3;
int pushButton = 2;

Ping URS0(pingPin);
pushbutton trigger(pushButton, LOW);

void setup() { Serial.begin(9600); } 

void loop() {

  if ( trigger.isPressed() ) { 
    Serial.print("Distance: ");
    Serial.println(URS0.ping_cm()); 
    delay(200);
  }
}



