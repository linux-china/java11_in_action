package org.mvnsearch;

/**
 * enum size
 *
 * @author linux_china
 */
public enum Size {
    SMALL(36, 19),
    MEDIUM(32, 20) {               // Constant specific class body
        int number = 10;                    // variable specific to MEDIUM

        int getSize() {                     // method specific to MEDIUM
            return length + width;
        }
    },
    LARGE(34, 22) {
        @Override
        public String toText() {            // overriding method toText for
            return "LARGE";                 // constant LARGE
        }
    };

    int length;                             // instance variable accessible
    int width;                              // to all enum constants

    Size(int length, int width) {           // enum constructor; accepts length
        this.length = length;               // and width
        this.width = width;
    }

    int getLength() {                       // method accessible to all enum
        return length;                      // constants
    }

    int getWidth() {                        // method accessible to all enum
        return width;                       // constants
    }

    public String toText() {              // method accessible to all enum
        return length + " X " + width;      // constants
    }
}
