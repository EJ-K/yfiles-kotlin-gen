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
 * An icon label style for use in WebGL2 rendering.
 * @see [WebGL2DefaultLabelStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconLabelStyle">Online Documentation</a>
 * 
 * @constructor Creates a new icon label style that is rendered with WebGL2.
 * @param [icon] The mandatory image data for the icon to be used for the label.
 * @param [iconColor] The fill color of the icon, or `null`. If this parameter is `null`, the original color of the icon is used. Otherwise the alpha values of the icon will be combined with the color values from this value. Defaults to `null`.
 * @param [backgroundColor] The color of the label's background. Defaults to [Color.TRANSPARENT], which does not render a background.
 * @param [backgroundStroke] The color of the label's background border. Defaults to [WebGL2Stroke.NONE], which does not render a stroke.
 * @param [insets] The padding of the text within the label's bounds. Defaults to `0`.
 * @param [shape] The shape of the label's background. Defaults to [WebGL2LabelShape.RECTANGLE].
 * @param [effect] The effect around the label. Defaults to [WebGL2Effect.NONE].
 * @param [textureRendering] Rendering hint on how to resolve blurriness of icon images at large zoom levels. Defaults to [WebGL2TextureRendering.INTERPOLATED]. We recommend not using [WebGL2TextureRendering.SDF] for images that contain gradients.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconLabelStyle%23WebGL2IconLabelStyle-constructor-WebGL2IconLabelStyle">Online Documentation</a>
 */
external  class WebGL2IconLabelStyle  ( icon: ImageData ,
 iconColor: Color?  = definedExternally,
 backgroundColor: Color?  = definedExternally,
 backgroundStroke: WebGL2Stroke?  = definedExternally,
 insets: Double  = definedExternally,
 shape: WebGL2LabelShape  = definedExternally,
 effect: WebGL2Effect  = definedExternally,
 textureRendering: WebGL2TextureRendering  = definedExternally) : YObject {

/**
 * Gets the fill color for the background of the shape.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconLabelStyle%23backgroundColor">Online Documentation</a>
 */
final val backgroundColor: Color
/**
 * Gets the color of the stroke around the shape.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconLabelStyle%23backgroundStroke">Online Documentation</a>
 */
final val backgroundStroke: WebGL2Stroke
/**
 * Gets the set of applied effects on this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconLabelStyle%23effect">Online Documentation</a>
 */
final val effect: WebGL2Effect
/**
 * Gets the [ImageData] of the icon to render.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconLabelStyle%23icon">Online Documentation</a>
 */
final val icon: ImageData
/**
 * Gets the fill color for the icon, or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconLabelStyle%23iconColor">Online Documentation</a>
 */
final val iconColor: Color?
/**
 * Gets the padding of the text within the label's bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconLabelStyle%23insets">Online Documentation</a>
 */
final val insets: Double
/**
 * Gets the shape of the label's background.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconLabelStyle%23shape">Online Documentation</a>
 */
final val shape: WebGL2LabelShape
/**
 * Gets the rendering hint on how to resolve blurriness of icon images on large zoom values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IconLabelStyle%23textureRendering">Online Documentation</a>
 */
final val textureRendering: WebGL2TextureRendering

companion object : ClassMetadata<WebGL2IconLabelStyle> {
}
}
