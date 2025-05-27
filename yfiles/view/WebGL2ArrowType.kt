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
 * Defines the different types of arrows supported by [WebGL2PolylineEdgeStyle], [WebGL2ArcEdgeStyle], and [WebGL2BridgeEdgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArrowType">Online Documentation</a>
 */
external sealed class WebGL2ArrowType: YEnum<WebGL2ArrowType> {
   companion object: EnumMetadata<WebGL2ArrowType> {
       /**
 * Do not render an arrow head.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArrowType%23NONE">Online Documentation</a>
 */
val NONE: WebGL2ArrowType

/**
 * Render a default arrow head, similar to [IArrow.DEFAULT][yfiles.styles.IArrow.DEFAULT].
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArrowType%23DEFAULT">Online Documentation</a>
 */
val DEFAULT: WebGL2ArrowType

/**
 * Render a pointed line end at the end of the edge's path.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArrowType%23POINTED">Online Documentation</a>
 */
val POINTED: WebGL2ArrowType

/**
 * Render a triangle arrow head, similar to [IArrow.TRIANGLE][yfiles.styles.IArrow.TRIANGLE].
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArrowType%23TRIANGLE">Online Documentation</a>
 */
val TRIANGLE: WebGL2ArrowType

/**
 * Render a small default arrow head, similar to [IArrow.DEFAULT][yfiles.styles.IArrow.DEFAULT].
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArrowType%23DEFAULT_SMALL">Online Documentation</a>
 */
val DEFAULT_SMALL: WebGL2ArrowType

/**
 * Render a large default arrow head, similar to [IArrow.DEFAULT][yfiles.styles.IArrow.DEFAULT].
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArrowType%23DEFAULT_LARGE">Online Documentation</a>
 */
val DEFAULT_LARGE: WebGL2ArrowType

/**
 * Render a small triangle arrow head, similar to [IArrow.TRIANGLE][yfiles.styles.IArrow.TRIANGLE].
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArrowType%23TRIANGLE_SMALL">Online Documentation</a>
 */
val TRIANGLE_SMALL: WebGL2ArrowType

/**
 * Render a large triangle arrow head, similar to [IArrow.TRIANGLE][yfiles.styles.IArrow.TRIANGLE].
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArrowType%23TRIANGLE_LARGE">Online Documentation</a>
 */
val TRIANGLE_LARGE: WebGL2ArrowType
   }
}
