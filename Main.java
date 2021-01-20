class Main {
  public static void main(String[] args) {
    String password = "";
    //Step 1: boolean valid set to false
    Boolean valid = false;
    //Step 2: start conditional loop while valild is false
    while (valid == false) {
    //Step 3: ask user to enter password
    password = Keyboard.getText("please enter your password.");
    //Step 4: set character firstLetter to the value of the first letter of password
    char firstLetter = password.charAt(0); 
    //Step 5: set character lastLetter to the value of the last letter of password
    char lastLetter = password.charAt(password.length() - 1);
    //Step 6: integer firstValue to the ascii value of firstLetter
    int firstValue = (int) firstLetter;
    //Step 7: integer lastValue to the ascii value of lastLetter
    int lastValue = (int) lastLetter;
    //Step 8: If firstValue is between 40 and 42 AND lastValue is between 65 and 90 AND password length is greater than 7 THEN
    if (firstValue > 39 && firstValue < 43 && lastValue > 64 && lastValue < 91 && password.length() > 7) {  
    //Step 9: valid = true
    valid = true;
    }
    //Step 10: ELSE
    else{
    //Step 11: display "Error password must be at least 8 characters, with a ()* to start adn a captial at the end"
    Screen.display("Error password must be at least 8 characters, with ()* to start and a captial at the end.","Error");
    
    //Step 12: END IF
    }
    //Step 13: END LOOP
    }
  
    //Step 14: display "Your password meets the strength requirements"
    Screen.display("Your password meets the strength requirements.", "Accepted");
  }
}
