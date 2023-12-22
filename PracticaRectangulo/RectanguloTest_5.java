import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RectanguloTest_5{
 @Test
 public void testArea1(){
 Rectangulo r1 = new Rectangulo();
 assertEquals(1,r1.area());
 }
 @Test
 public void testBase1(){
 Rectangulo r1 = new Rectangulo();
 assertEquals(1,r1.base());
 }
 @Test
 public void testAltura1(){
 Rectangulo r1 = new Rectangulo();
 assertEquals(1,r1.altura());
 }
 @Test
 public void testPerimetro1(){
 Rectangulo r1 = new Rectangulo();
 assertEquals(4,r1.perimetro());
 }
 @Test
 public void testArea2(){
 Rectangulo r2 = new Rectangulo(2,5);
 assertEquals(10,r2.area());
 }
 @Test
 public void testBase2(){
 Rectangulo r2 = new Rectangulo(2,5); 
 assertEquals(2,r2.base());
 }
 @Test
 public void testAltura2(){
 Rectangulo r2 = new Rectangulo(2,5); 
 assertEquals(5,r2.altura());
 }
 @Test
 public void testPerimetro2(){
 Rectangulo r2 = new Rectangulo(2,5); 
 assertEquals(14,r2.perimetro());
 }
}
