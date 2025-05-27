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
 * Defines the shapes a [WebGL2ShapeNodeStyle] and [WebGL2IconNodeStyle] can display.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeShape">Online Documentation</a>
 */
external sealed class WebGL2ShapeNodeShape: YEnum<WebGL2ShapeNodeShape> {
   companion object: EnumMetadata<WebGL2ShapeNodeShape> {
       /**
 * A rectangular shape.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeShape%23RECTANGLE">Online Documentation</a>
 */
val RECTANGLE: WebGL2ShapeNodeShape

/**
 * A rectangular shape with rounded edges.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeShape%23ROUND_RECTANGLE">Online Documentation</a>
 */
val ROUND_RECTANGLE: WebGL2ShapeNodeShape

/**
 * An elliptical shape.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeShape%23ELLIPSE">Online Documentation</a>
 */
val ELLIPSE: WebGL2ShapeNodeShape

/**
 * A hexagonal shape with tips left and right.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeShape%23HEXAGON">Online Documentation</a>
 */
val HEXAGON: WebGL2ShapeNodeShape

/**
 * A hexagonal shape with tips at the top and bottom.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeShape%23HEXAGON2">Online Documentation</a>
 */
val HEXAGON2: WebGL2ShapeNodeShape

/**
 * An octagonal shape.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeShape%23OCTAGON">Online Documentation</a>
 */
val OCTAGON: WebGL2ShapeNodeShape

/**
 * A triangle shape with a tip at the top.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeShape%23TRIANGLE">Online Documentation</a>
 */
val TRIANGLE: WebGL2ShapeNodeShape

/**
 * A pill shape where the shorter sides are rounded.
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeShape%23PILL">Online Documentation</a>
 */
val PILL: WebGL2ShapeNodeShape
   }
}
