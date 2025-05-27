// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.dom.Node
import web.svg.SVGElement
import yfiles.collections.List
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * Fills an area with a linear gradient.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LinearGradient] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23LinearGradient-constructor-LinearGradient">Online Documentation</a>
 */
external class LinearGradient () : Fill, ISvgDefsCreator {
  /**
   * Gets or sets the end point of this gradient.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23endPoint">Online Documentation</a>
   */
  final var endPoint: Point
  
  /**
   * Gets or sets the gradient stops of this [Fill].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23gradientStops">Online Documentation</a>
   */
  final var gradientStops: List<GradientStop>
  
  /**
   * Gets or sets the spread method of this gradient.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23spreadMethod">Online Documentation</a>
   */
  final var spreadMethod: GradientSpreadMethod
  
  /**
   * Gets or sets the start point of this gradient.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23startPoint">Online Documentation</a>
   */
  final var startPoint: Point
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23LinearGradient-method-accept">Online Documentation</a>
   */
  override fun accept(
    context: ICanvasContext,
    node: Node,
    id: String,
  ): Boolean
  
  /**
   * Creates a new SVG gradient that corresponds to this [LinearGradient].
   * @param [context] The current canvas context.
   * @return A new SVG gradient that corresponds to this [LinearGradient]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23LinearGradient-method-createDefsElement">Online Documentation</a>
   */
  override fun createDefsElement(
    context: ICanvasContext,
  ): SVGElement
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23LinearGradient-method-freeze">Online Documentation</a>
   */
  override fun freeze(): Fill
  
  /**
   * Determines whether this [LinearGradient] is equal to the specified object.
   * @param [fill] The other [Fill] instance to compare.
   * @return `true`, if this [LinearGradient] is equal to the other object; `false`, otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23LinearGradient-method-hasSameValue">Online Documentation</a>
   */
  override fun hasSameValue(
    fill: Fill?,
  ): Boolean
  
  /**
   * Creates a new SVG gradient that corresponds to this [LinearGradient].
   * @return A new SVG gradient that corresponds to this [LinearGradient]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23LinearGradient-method-toSvgGradient">Online Documentation</a>
   */
  fun toSvgGradient(): SVGElement
  
  /**
   * Updates the SVG gradient within the `defs` section of the SVG document if it has changed.
   * @param [context] The context.
   * @param [oldElement] The old element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23LinearGradient-method-updateDefsElement">Online Documentation</a>
   */
  override fun updateDefsElement(
    context: ICanvasContext,
    oldElement: SVGElement,
  )
  
  /**
   * Updates the SVG gradient within the `defs` section of the SVG document if it has changed.
   * @param [oldElement] The old element.
   * @param [context] The context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinearGradient%23LinearGradient-method-updateSvgGradient">Online Documentation</a>
   */
  fun updateSvgGradient(
    oldElement: SVGElement,
    context: ICanvasContext,
  )
  
  companion object : ClassMetadata<LinearGradient> {
  }
}

inline fun LinearGradient(
    block: LinearGradient.() -> Unit
): LinearGradient {
    return LinearGradient()
        .apply(block)
}
