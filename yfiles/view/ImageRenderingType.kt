// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

/**
 * This enumeration contains the valid values for the `image-rendering` property of SVG image elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageRenderingType">Online Documentation</a>
 */

sealed external class ImageRenderingType {
  /**
   * Indicates that the rendering engine should use a balanced setup with a slight preference of quality.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageRenderingType%23AUTO">Online Documentation</a>
   */
  object AUTO: ImageRenderingType
  
  /**
   * Indicates that the rendering speed should be optimized.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageRenderingType%23OPTIMIZE_SPEED">Online Documentation</a>
   */
  object OPTIMIZE_SPEED: ImageRenderingType
  
  /**
   * Indicates that the rendering quality should be optimized.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageRenderingType%23OPTIMIZE_QUALITY">Online Documentation</a>
   */
  object OPTIMIZE_QUALITY: ImageRenderingType
  
  /**
   * Indicates that the setting for the rendering quality should be inherited from the parent.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ImageRenderingType%23INHERIT">Online Documentation</a>
   */
  object INHERIT: ImageRenderingType
}
