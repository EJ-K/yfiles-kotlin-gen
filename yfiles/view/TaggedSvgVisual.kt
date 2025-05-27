// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.svg.SVGElement
import yfiles.lang.InterfaceMetadata

/**
 * An utility type for [SvgVisual] that restricts the type of the [svgElement][SvgVisual] property and adds a [tag][TaggedSvgVisual] property to store additional data.
 * @param [TElement] The type of the [svgElement][TaggedSvgVisual] property.
 * @param [TTag] The type of the [tag][TaggedSvgVisual] property.
 * @see [TypedSvgVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TaggedSvgVisual">Online Documentation</a>
 */
external interface TaggedSvgVisual<TElement : SVGElement, TTag>  {
  /**
   * Gets or sets the SVG element of this visual.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TaggedSvgVisual%23svgElement">Online Documentation</a>
   */
  var svgElement: TElement
  
  /**
   * Gets or sets an object that stores additional data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TaggedSvgVisual%23tag">Online Documentation</a>
   */
  var tag: TTag

  
  companion object : InterfaceMetadata<TaggedSvgVisual<*, *>> {
  }
}
