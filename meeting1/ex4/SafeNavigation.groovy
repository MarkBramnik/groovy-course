package meeting1.ex4

import java.awt.Point


// Safe navigation operator

Point p = new Point(x : 4, y : 5)

void safeNavigation(Point p) {
   println "${p?.x} :: ${p?.y}"
}

safeNavigation(p)
safeNavigation(null)