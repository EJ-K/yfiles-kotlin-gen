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
 * Fills an area with a radial gradient.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [RadialGradient] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23RadialGradient-constructor-RadialGradient">Online Documentation</a>
 */
external class RadialGradient () : Fill, ISvgDefsCreator {
  /**
   * Gets or sets the center of this radial gradient.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23center">Online Documentation</a>
   */
  final var center: Point
  
  /**
   * Gets or sets the origin of this radial gradient.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23gradientOrigin">Online Documentation</a>
   */
  final var gradientOrigin: Point
  
  /**
   * Gets or sets the gradient stops of this brush.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23gradientStops">Online Documentation</a>
   */
  final var gradientStops: List<GradientStop>
  
  /**
   * Gets or sets the radius of the largest circle of this radial gradient in horizontal direction.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23radiusX">Online Documentation</a>
   */
  final var radiusX: Double
  
  /**
   * Gets or sets the radius of the largest circle of this radial gradient in vertical direction.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23radiusY">Online Documentation</a>
   */
  final var radiusY: Double
  
  /**
   * Gets or sets the spread method of this gradient.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23spreadMethod">Online Documentation</a>
   */
  final var spreadMethod: GradientSpreadMethod
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23RadialGradient-method-accept">Online Documentation</a>
   */
  override fun accept(
    context: ICanvasContext,
    node: Node,
    id: String,
  ): Boolean
  
  /**
   * Creates a new SVG gradient that corresponds to this gradient brush.
   * @param [context] The current canvas context.
   * @return A new SVG gradient that corresponds to this gradient brush.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23RadialGradient-method-createDefsElement">Online Documentation</a>
   */
  override fun createDefsElement(
    context: ICanvasContext,
  ): SVGElement
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23RadialGradient-method-freeze">Online Documentation</a>
   */
  override fun freeze(): Fill
  
  /**
   * Determines whether this [RadialGradient] is equal to the specified object.
   * @param [fill] The other [Fill] instance to compare.
   * @return `true`, if this [Color] is equal to the other object; `false`, otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23RadialGradient-method-hasSameValue">Online Documentation</a>
   */
  override fun hasSameValue(
    fill: Fill?,
  ): Boolean
  
  /**
   * Creates a new SVG gradient that corresponds to this gradient brush.
   * @return A new SVG gradient that corresponds to this gradient brush
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23RadialGradient-method-toSvgGradient">Online Documentation</a>
   */
  fun toSvgGradient(): SVGElement
  
  /**
   * Updates the SVG gradient within the `defs` section of the SVG document if it has changed.
   * @param [context] The context.
   * @param [oldElement] The old element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23RadialGradient-method-updateDefsElement">Online Documentation</a>
   */
  override fun updateDefsElement(
    context: ICanvasContext,
    oldElement: SVGElement,
  )
  
  /**
   * Updates the SVG gradient within the `defs` section of the SVG document if it has changed.
   * @param [oldElement] The old element.
   * @param [context] The context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialGradient%23RadialGradient-method-updateSvgGradient">Online Documentation</a>
   */
  fun updateSvgGradient(
    oldElement: SVGElement,
    context: ICanvasContext,
  )
  
  companion object : ClassMetadata<RadialGradient> {
  }
}

inline fun RadialGradient(
    block: RadialGradient.() -> Unit
): RadialGradient {
    return RadialGradient()
        .apply(block)
}
