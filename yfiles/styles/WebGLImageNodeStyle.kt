// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.lang.ClassMetadata

/**
 * A node style that uses WebGL rendering and displays an image for the visual representation of a node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLImageNodeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance that uses the specified image.
 * @param [image] The image source, i.e. everything that one could use to specify the `src` of an `<img>` element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLImageNodeStyle%23WebGLImageNodeStyle-constructor-WebGLImageNodeStyle">Online Documentation</a>
 * 
 * @property image
 * Gets or sets the image reference.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLImageNodeStyle%23image">Online Documentation</a>
 */
external open class WebGLImageNodeStyle  (
final var image: String? = definedExternally) : INodeStyle {

/**
 * Gets or sets the normalized outline of the image that will be displayed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLImageNodeStyle%23normalizedOutline">Online Documentation</a>
 */
final var normalizedOutline: GeneralPath?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLImageNodeStyle%23renderer">Online Documentation</a>
 */
final override val renderer: INodeStyleRenderer
/**
 * This implementation performs a shallow copy with respect to the [image] property.
 * @return A shallow copy of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLImageNodeStyle%23WebGLImageNodeStyle-method-clone">Online Documentation</a>
 */
 final override   fun clone():WebGLImageNodeStyle

companion object : ClassMetadata<WebGLImageNodeStyle> {
}
}

inline fun WebGLImageNodeStyle(
    block: WebGLImageNodeStyle.() -> Unit
): WebGLImageNodeStyle {
    return WebGLImageNodeStyle()
        .apply(block)
}
