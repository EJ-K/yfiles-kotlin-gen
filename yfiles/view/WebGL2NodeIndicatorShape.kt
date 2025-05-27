// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Defines the shapes a [WebGL2NodeIndicatorShape] can display.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorShape">Online Documentation</a>
 */
external sealed class WebGL2NodeIndicatorShape: YEnum<WebGL2NodeIndicatorShape> {
   companion object: EnumMetadata<WebGL2NodeIndicatorShape> {
       /**
 * A rectangular shape.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorShape%23RECTANGLE">Online Documentation</a>
 */
val RECTANGLE: WebGL2NodeIndicatorShape

/**
 * A rectangular shape with rounded edges.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorShape%23ROUND_RECTANGLE">Online Documentation</a>
 */
val ROUND_RECTANGLE: WebGL2NodeIndicatorShape

/**
 * An elliptical shape.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorShape%23ELLIPSE">Online Documentation</a>
 */
val ELLIPSE: WebGL2NodeIndicatorShape

/**
 * A hexagonal shape with tips left and right.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorShape%23HEXAGON">Online Documentation</a>
 */
val HEXAGON: WebGL2NodeIndicatorShape

/**
 * A hexagonal shape with tips at the top and bottom.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorShape%23HEXAGON2">Online Documentation</a>
 */
val HEXAGON2: WebGL2NodeIndicatorShape

/**
 * An octagonal shape.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorShape%23OCTAGON">Online Documentation</a>
 */
val OCTAGON: WebGL2NodeIndicatorShape

/**
 * A triangle shape with a tip at the top.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorShape%23TRIANGLE">Online Documentation</a>
 */
val TRIANGLE: WebGL2NodeIndicatorShape

/**
 * A pill shape where the shorter sides are rounded.
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorShape%23PILL">Online Documentation</a>
 */
val PILL: WebGL2NodeIndicatorShape

/**
 * A shape that matches the shape of the current node style.
 * 
 * Value - `255`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorShape%23NODE_SHAPE">Online Documentation</a>
 */
val NODE_SHAPE: WebGL2NodeIndicatorShape
   }
}
