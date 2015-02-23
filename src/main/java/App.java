
/**
 * Demo - do whatever you want with this source ;)
 */

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
public class App {

  public static void main(String[] args) throws InterruptedException {
    final GpioController gpio = GpioFactory.getInstance();
    final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);
    pin.low();
    System.out.println("--> GPIO 1 state should be: blinking...");
    for (int i = 0; i <= 100; i++) {
      Thread.sleep(200);
      pin.toggle();
    }
    System.out.println("--> finished");
    pin.low();
    gpio.shutdown();
  }

}
