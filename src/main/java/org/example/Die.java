/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

import java.util.Random;

public class Die {
    private int faceValue;
    private final Random random;
    public Die() {
        random = new Random();
        roll();
    }
    public void roll(){
        faceValue = random.nextInt(6)+1;
    }
    public int getFaceValue() {
        return  faceValue;
    }
}
