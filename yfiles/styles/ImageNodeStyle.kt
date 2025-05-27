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
import yfiles.view.Fill
import yfiles.view.Stroke

/**
 * A node style that can use an image for the visual representation of a node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance that uses the specified image.
 * @param [href] The image to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23ImageNodeStyle-constructor-ImageNodeStyle">Online Documentation</a>
 */
open external class ImageNodeStyle (
  href: String  = definedExternally,
) : INodeStyle {
  /**
   * Gets or sets the aspect ratio for scaling the image to a node's size.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23aspectRatio">Online Documentation</a>
   */
  open var aspectRatio: Double
  
  /**
   * Gets or sets the [Fill] of the image [backgroundShape][ImageNodeStyle] for this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23backgroundFill">Online Documentation</a>
   */
  final var backgroundFill: Fill?
  
  /**
   * Gets or sets the background shape for this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23backgroundShape">Online Documentation</a>
   */
  final var backgroundShape: ShapeNodeShape
  
  /**
   * Gets or sets the [Stroke] of the image [backgroundShape][ImageNodeStyle] for this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23backgroundStroke">Online Documentation</a>
   */
  final var backgroundStroke: Stroke?
  
  /**
   * Gets or sets a CSS class that will be applied to the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23cssClass">Online Documentation</a>
   */
  final var cssClass: String
  
  /**
   * Gets or sets the image URL that is used by the style instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23href">Online Documentation</a>
   */
  final var href: String?
  
  /**
   * Gets or sets the normalized outline of the image that will be displayed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23normalizedOutline">Online Documentation</a>
   */
  final var normalizedOutline: GeneralPath?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23renderer">Online Documentation</a>
   */
  final override val renderer: INodeStyleRenderer
  
  /**
   * This implementation performs a shallow copy with respect to the [href][ImageNodeStyle] property.
   * @return A shallow copy of this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23ImageNodeStyle-method-clone">Online Documentation</a>
   */
  final override fun clone(): ImageNodeStyle
  
  companion object : ClassMetadata<ImageNodeStyle> {
    /**
     * Convenience method to determine the aspect ratio of the given image [href][ImageNodeStyle].
     * @param [image] The image URL
     * @return The aspect ratio of the image
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageNodeStyle%23ImageNodeStyle-method-getAspectRatio">Online Documentation</a>
     */
    fun getAspectRatio(
      image: String,
    ): Promise<Number>
  }
}

inline fun ImageNodeStyle(
    block: ImageNodeStyle.() -> Unit
): ImageNodeStyle {
    return ImageNodeStyle()
        .apply(block)
}
