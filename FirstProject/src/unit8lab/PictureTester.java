package unit8lab;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 * 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("/Users/samih/Downloads/beach.jpg");
//    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("/Users/samih/Downloads/beach.jpg");
//    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testNegate()
  {
    Picture beach = new Picture("/Users/samih/Downloads/beach.jpg");
//    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale()
  {
    Picture beach = new Picture("/Users/samih/Downloads/beach.jpg");
//    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  public static void testFixUnderwater()
  {
    Picture beach = new Picture("/Users/samih/Downloads/water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }



  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("/Users/samih/Downloads/caterpillar.jpg");
//    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("/Users/samih/Downloads/swan.jpg");
//    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("/Users/samih/Downloads/redMotorcycle.jpg");
//    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }

  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("/Users/samih/Downloads/swan.jpg");
//    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("unit8lab/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms()
  {
    Picture snowman = new Picture("C:\\Users\\thami\\OneDrive\\Documents\\GitHub\\AP-CS-Projects\\FirstProject\\src\\snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }

  public static void testMirrorGull()
  {
    Picture temple = new Picture("C:\\Users\\thami\\OneDrive\\Documents\\GitHub\\AP-CS-Projects\\FirstProject\\src\\seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }

  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\thami\\OneDrive\\Documents\\GitHub\\AP-CS-Projects\\FirstProject\\src\\640x480.jpg");
    Picture gorge = new Picture("C:\\Users\\thami\\OneDrive\\Documents\\GitHub\\AP-CS-Projects\\FirstProject\\src\\gorge.jpg");
    canvas.copy(gorge,100,190,23,250,0,200);
    canvas.myCollage();
    canvas.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("unit8lab/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  /** randomstuff.Main method for randomstuff.testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//    testMirrorVertical();
//    testMirrorVerticalRightToLeft();
//    testMirrorHorizontal();
//    testMirrorHorizontalBotToTop();
    //testMirrorTemple();
//    testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}