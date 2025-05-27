// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import js.promise.Promise
import yfiles.geometry.GeneralPath
import yfiles.lang.ClassMetadata

/**
 * A node style that can use an image for the visual representation of a node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance that uses the specified image URL, fallback image URL and the given renderer instance.
 * @param [image] The image URL.
 * @param [fallbackImage] The fallback image URL.
 * @param [renderer] The renderer used by this instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23ImageNodeStyle-constructor-ImageNodeStyle">Online Documentation</a>
 * 
 * @property image
 * Gets or sets the image that is used by the style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23image">Online Documentation</a>
 * 
 * @property fallbackImage
 * Gets or sets the fallback image that is used by the style instance if the [image] is null.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23fallbackImage">Online Documentation</a>
 * 
 * @property renderer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23renderer">Online Documentation</a>
 */
external open class ImageNodeStyle  (
open var image: String? = definedExternally,
open var fallbackImage: String? = definedExternally,
final override val renderer: ImageNodeStyleRenderer = definedExternally) : INodeStyle {

/**
 * Gets or sets the aspect ratio for scaling the image to a node's size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23aspectRatio">Online Documentation</a>
 */
open var aspectRatio: Double
/**
 * Gets or sets a CSS class that will be applied to the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets the normalized outline of the image that will be displayed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23normalizedOutline">Online Documentation</a>
 */
final var normalizedOutline: GeneralPath?
/**
 * This implementation performs a shallow copy with respect to the [image] property.
 * @return A shallow copy of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23ImageNodeStyle-method-clone">Online Documentation</a>
 */
 override   fun clone():ImageNodeStyle

companion object : ClassMetadata<ImageNodeStyle> {
/**
 * Convenience method to determine the aspect ratio of the given image URL.
 * @param [image] The image URL
 * @return The aspect ratio of the image
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23ImageNodeStyle-method-getAspectRatio">Online Documentation</a>
 */
 final   fun getAspectRatio( image: String ):Promise<Number>
}
}

inline fun ImageNodeStyle(
    block: ImageNodeStyle.() -> Unit
): ImageNodeStyle {
    return ImageNodeStyle()
        .apply(block)
}
