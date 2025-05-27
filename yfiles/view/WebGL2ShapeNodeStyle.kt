// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A node style for geometric shapes for use in WebGL2 rendering.
 * @see [WebGL2IconNodeStyle]
 * @see [WebGL2GroupNodeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new shape node style that is rendered with WebGL2.
 * @param [shape] The shape of the node. Defaults to [WebGL2ShapeNodeShape.ELLIPSE].
 * @param [fill] The background color of the node. Defaults to [Color.WHITE].
 * @param [stroke] The border color of the node. Defaults to [Color.BLACK].
 * @param [effect] The effect around the node. Defaults to [WebGL2Effect.NONE].
 * @param [keepIntrinsicAspectRatio] Whether to keep the intrinsic aspect ratio of the shape.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeStyle%23WebGL2ShapeNodeStyle-constructor-WebGL2ShapeNodeStyle">Online Documentation</a>
 */
external  class WebGL2ShapeNodeStyle  ( shape: WebGL2ShapeNodeShape  = definedExternally,
 fill: Color?  = definedExternally,
 stroke: WebGL2Stroke?  = definedExternally,
 effect: WebGL2Effect  = definedExternally,
 keepIntrinsicAspectRatio: Boolean  = definedExternally) : YObject {

/**
 * Gets the set of applied effects on this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeStyle%23effect">Online Documentation</a>
 */
final val effect: WebGL2Effect
/**
 * Gets the fill color for the shape background.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeStyle%23fill">Online Documentation</a>
 */
final val fill: Color
/**
 * Gets a value indicating whether to keep the intrinsic aspect ratio of the shape.
 * 
 * The default value is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeStyle%23keepIntrinsicAspectRatio">Online Documentation</a>
 */
final val keepIntrinsicAspectRatio: Boolean
/**
 * Gets the shape of the style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeStyle%23shape">Online Documentation</a>
 */
final val shape: WebGL2ShapeNodeShape
/**
 * Gets the stroke around the shape.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShapeNodeStyle%23stroke">Online Documentation</a>
 */
final val stroke: WebGL2Stroke

companion object : ClassMetadata<WebGL2ShapeNodeStyle> {
}
}
