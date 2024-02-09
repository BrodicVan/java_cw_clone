// Unregister the sensor listener
@Override
public void onPause(){
  super.onPause();
  sensorManager.unregisterListener(this); // <10>
}