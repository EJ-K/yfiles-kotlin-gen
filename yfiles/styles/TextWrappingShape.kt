// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Provides constants for shapes that [DefaultLabelStyle] can wrap text into.
 * @see [DefaultLabelStyle.textWrappingShape]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape">Online Documentation</a>
 */
external sealed class TextWrappingShape: YEnum<TextWrappingShape> {
   companion object: EnumMetadata<TextWrappingShape> {
       /**
 * A rectangular shape.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23RECTANGLE">Online Documentation</a>
 */
val RECTANGLE: TextWrappingShape

/**
 * A rectangular shape with rounded corners.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23ROUND_RECTANGLE">Online Documentation</a>
 */
val ROUND_RECTANGLE: TextWrappingShape

/**
 * An elliptical shape.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23ELLIPSE">Online Documentation</a>
 */
val ELLIPSE: TextWrappingShape

/**
 * A triangular shape that points to the top.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23TRIANGLE">Online Documentation</a>
 */
val TRIANGLE: TextWrappingShape

/**
 * A triangular shape that points to the bottom.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23TRIANGLE2">Online Documentation</a>
 */
val TRIANGLE2: TextWrappingShape

/**
 * A rectangle that is sheared in the horizontal direction to the right.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23SHEARED_RECTANGLE">Online Documentation</a>
 */
val SHEARED_RECTANGLE: TextWrappingShape

/**
 * A rectangle that is sheared in the horizontal direction to the left.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23SHEARED_RECTANGLE2">Online Documentation</a>
 */
val SHEARED_RECTANGLE2: TextWrappingShape

/**
 * A trapezoid shape that is smaller at the bottom.
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23TRAPEZ">Online Documentation</a>
 */
val TRAPEZ: TextWrappingShape

/**
 * A trapezoid shape that is smaller at the top.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23TRAPEZ2">Online Documentation</a>
 */
val TRAPEZ2: TextWrappingShape

/**
 * A symmetric parallelogram shape that has sloped edges.
 * 
 * Value - `9`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23DIAMOND">Online Documentation</a>
 */
val DIAMOND: TextWrappingShape

/**
 * An 8-sided polygon.
 * 
 * Value - `10`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23OCTAGON">Online Documentation</a>
 */
val OCTAGON: TextWrappingShape

/**
 * A 6-sided polygon with tips left and right.
 * 
 * Value - `11`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23HEXAGON">Online Documentation</a>
 */
val HEXAGON: TextWrappingShape

/**
 * A 6-sided polygon with tips at top and bottom.
 * 
 * Value - `12`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23HEXAGON2">Online Documentation</a>
 */
val HEXAGON2: TextWrappingShape

/**
 * A stadium shape with the shorter sides rounded.
 * 
 * Value - `13`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23PILL">Online Documentation</a>
 */
val PILL: TextWrappingShape

/**
 * The [LabelShape] set as [DefaultLabelStyle.shape].
 * 
 * Value - `14`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23LABEL_SHAPE">Online Documentation</a>
 */
val LABEL_SHAPE: TextWrappingShape
   }
}
