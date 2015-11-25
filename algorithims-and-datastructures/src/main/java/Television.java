import java.util.HashMap;
import java.util.Arrays;

public class Television {
  private boolean isOn = false;
  private String[] settingKeys = new String[10];
  private Object[] settingValues = new Object[10];
  
  boolean isOn() {
    return isOn;
  }

  void turnOn() {
    isOn = true;
  }

  // use two arrays
  public Object get(String setting) {
    for(int i = 0 ; i < settingKeys.length ; i++) {
      if(settingKeys[i] == setting) {
        return settingValues[i];
      }
    }
    return "No value found";
  }

  public void set(String settingName, Object settingVal) {
    for(int i = 0 ; i < settingKeys.length ; i++) {
      if(settingKeys[i] == null) {
        settingKeys[i] = settingName;
        settingValues[i] = settingVal;
        break;
      }
    }
  }
}
