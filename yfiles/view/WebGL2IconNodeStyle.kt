// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.images.ImageData
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * An icon node style for use in WebGL2 rendering.
 * @see [WebGL2ShapeNodeStyle]
 * @see [WebGL2GroupNodeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconNodeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new icon node style that is rendered with WebGL2.
 * @param [icon] The mandatory image data for the icon.
 * @param [iconColor] The fill color of the icon, or `null`. If this parameter is `null`, the original color of the icon is used. Otherwise the alpha values of the icon will be combined with the color values from this value. Defaults to `null`.
 * @param [preserveAspectRatio] Whether to preserve the icon aspect ratio. Defaults to `false`.
 * @param [shape] The shape of the node. Defaults to [WebGL2ShapeNodeShape.ELLIPSE].
 * @param [fill] The background color of the node. Defaults to [Color.WHITE].
 * @param [stroke] The border color of the node. Defaults to [Color.BLACK].
 * @param [effect] The effect around the node. Defaults to [WebGL2Effect.NONE].
 * @param [textureRendering] Rendering hint on how to resolve blurriness of icon images on large zoom values. Defaults to [WebGL2TextureRendering.INTERPOLATED] We recommend not using [WebGL2TextureRendering.SDF] for images that contain gradients.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconNodeStyle%23WebGL2IconNodeStyle-constructor-WebGL2IconNodeStyle">Online Documentation</a>
 */
external  class WebGL2IconNodeStyle  ( icon: ImageData ,
 iconColor: Color?  = definedExternally,
 preserveAspectRatio: Boolean  = definedExternally,
 shape: WebGL2ShapeNodeShape  = definedExternally,
 fill: Color?  = definedExternally,
 stroke: WebGL2Stroke?  = definedExternally,
 effect: WebGL2Effect  = definedExternally,
 textureRendering: WebGL2TextureRendering  = definedExternally) : YObject {

/**
 * Gets the set of applied effects on this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconNodeStyle%23effect">Online Documentation</a>
 */
final val effect: WebGL2Effect
/**
 * Gets the fill color for the shape background.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconNodeStyle%23fill">Online Documentation</a>
 */
final val fill: Color
/**
 * Gets the [ImageData] of the icon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconNodeStyle%23icon">Online Documentation</a>
 */
final val icon: ImageData
/**
 * Gets the fill color for the icon, or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconNodeStyle%23iconColor">Online Documentation</a>
 */
final val iconColor: Color?
/**
 * Gets a value that specifies whether to preserve the aspect ratio of the [icon] and the background [shape].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconNodeStyle%23preserveAspectRatio">Online Documentation</a>
 */
final val preserveAspectRatio: Boolean
/**
 * Gets the shape of the style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconNodeStyle%23shape">Online Documentation</a>
 */
final val shape: WebGL2ShapeNodeShape
/**
 * Gets the stroke around the shape.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconNodeStyle%23stroke">Online Documentation</a>
 */
final val stroke: WebGL2Stroke
/**
 * Gets the rendering hint on how to resolve blurriness of icon images on large zoom values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconNodeStyle%23textureRendering">Online Documentation</a>
 */
final val textureRendering: WebGL2TextureRendering

companion object : ClassMetadata<WebGL2IconNodeStyle> {
}
}
