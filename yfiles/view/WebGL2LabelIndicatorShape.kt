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
 * Defines the shapes that can be used together with [WebGL2DefaultLabelStyle] and [WebGL2IconLabelStyle] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2LabelIndicatorShape">Online Documentation</a>
 */
external sealed class WebGL2LabelIndicatorShape: YEnum<WebGL2LabelIndicatorShape> {
   companion object: EnumMetadata<WebGL2LabelIndicatorShape> {
       /**
 * A rectangular shape.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2LabelIndicatorShape%23RECTANGLE">Online Documentation</a>
 */
val RECTANGLE: WebGL2LabelIndicatorShape

/**
 * A rectangular shape with rounded edges.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2LabelIndicatorShape%23ROUND_RECTANGLE">Online Documentation</a>
 */
val ROUND_RECTANGLE: WebGL2LabelIndicatorShape

/**
 * A pill shape.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2LabelIndicatorShape%23PILL">Online Documentation</a>
 */
val PILL: WebGL2LabelIndicatorShape

/**
 * A shape that matches the shape of the current label style.
 * 
 * Value - `255`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2LabelIndicatorShape%23LABEL_SHAPE">Online Documentation</a>
 */
val LABEL_SHAPE: WebGL2LabelIndicatorShape
   }
}
